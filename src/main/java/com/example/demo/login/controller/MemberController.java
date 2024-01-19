package com.example.demo.login.controller;

import com.example.demo.login.entity.memberaddress;
import com.example.demo.login.entity.Member;
import com.example.demo.login.Service.MemberService;
import com.example.demo.login.Service.MemberaddressService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequestMapping("/")
public class MemberController
{
    private final Logger log= LoggerFactory.getLogger(getClass());

    @Autowired
    private MemberService memberService;

    @Autowired
    private MemberaddressService memberaddressService;

    @GetMapping("findByEmail/{email}")
    public String registerMember(@PathVariable("email") String email)
    {
        Member memberByEmail=memberService.findMemberByEmail(email);
        System.out.println(memberByEmail.getEmail());
        return memberByEmail.getEmail();
    }

    @PostMapping("api/LogIn")
    public ModelAndView logIN(@RequestBody Member data)
    {
        log.info(data.getEmail());
        boolean loggedIn=memberService.LogIn(data);

        if(loggedIn)
        {
            return new ModelAndView("redirect:/map");

        }
        else
        {

            ModelAndView modelAndView =new ModelAndView();
            modelAndView.addObject("error", "로그인 실패 메세지");
            modelAndView.setViewName("loginFailed");

            return modelAndView;
        }
    }

    @PostMapping("api/Join")
    public boolean join_member(@RequestBody Member data)
    {
        log.info(data.getEmail());
        log.info(data.getPhone_number());
        String result=memberService.join(data);
        if(result=="회원가입이 완료 되었습니다.")
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @PostMapping("api/GetAddr")
    public List<memberaddress> Addr(@RequestBody String email)
    {
        List<memberaddress> myAddress=memberaddressService.get_my_address(email);
        for(memberaddress memberaddress : myAddress)
        {
            log.info(memberaddress.getAddress());
        }

        return myAddress;
    }

}
