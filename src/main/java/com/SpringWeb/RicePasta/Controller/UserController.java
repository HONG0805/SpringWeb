package com.SpringWeb.RicePasta.Controller;

import com.SpringWeb.RicePasta.VO.UserVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//spring 프레임워크가 자바 빈(=객체)으로 등록해서 관리할 수 있도록 어노테이션 달기
@Controller
public class UserController {

    @RequestMapping("/user/insert")
    public String insert(Model model) {

        model.addAttribute("UserVO", new UserVO());

        return "user/joinForm";
        //model은 jsp를 return, ModelAndView는 ModelAndView 객체를 리턴
    }
}