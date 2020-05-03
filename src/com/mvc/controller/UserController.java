package com.mvc.controller;

import com.mvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * @Classname UserController
 * @Description TODO
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-05-03 21:48
 * @Version 1.0
 **/
@Controller
public class UserController {
    @RequestMapping(value = "/")
    public String index(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "index";
    }

    // 创建验证方法，测试表单数据验证
    @RequestMapping(value = "/testValidate", method = RequestMethod.POST)
    public String testValidate(@Valid User user, BindingResult bindingResult){
        if (bindingResult.getErrorCount() > 0) {
            for (FieldError fieldError : bindingResult.getFieldErrors()) {
                System.out.println(fieldError.getField() + ": " + fieldError.getDefaultMessage());
                return "index";
            }
        }
        return "success";
    }
}
