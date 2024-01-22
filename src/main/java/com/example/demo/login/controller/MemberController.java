package com.example.demo.login.controller;
/**
 *     파일명: MemberController.java
 *     프로그램 목적 및 기능:
 *         - 로그인 기능과 회원가입을 수행하는 컨트롤러
 *     프로그램 작성자: 박 형 건 (2024년 1월 19일 (금))
 *     최종 Update: 2024.01.22
 *     ===================================================================
 *     프로그램 수정 및 보완 이력
 *     ===================================================================
 *     프로그램 작성자    보완 일자               보완 내용
 *     박 형 건        2024.1.19          로그인 기능을 구현하는 컨트롤러
 *     박 형 건        2024.1.22          로그인 하였을 때 맵을 보여주는 화면을 전환
 *     ===================================================================
 */

import com.example.demo.login.entity.memberaddress;
import com.example.demo.login.entity.Member;
import com.example.demo.login.Service.MemberService;
import com.example.demo.login.Service.MemberaddressService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;


import java.util.List;


@RestController
@RequestMapping("/")
public class MemberController
{
    private final Logger log= LoggerFactory.getLogger(getClass());

    @Autowired
    private MemberService memberService;

    @Autowired
    private MemberaddressService memberaddressService;

    /**
    * 특정 이메일을 기준으로 회원을 찾아 반환하는 엔드포인트
    * @param email 찾을 회원의 이메일
    * @return 회원의 이메일
    * */
    @GetMapping("findByEmail/{email}")
    public String registerMember(@PathVariable("email") String email)
    {
        Member memberByEmail=memberService.findMemberByEmail(email);
        System.out.println(memberByEmail.getEmail());
        return memberByEmail.getEmail();
    }

    /**
    * 회원 로그인을 처리하는 엔드포인트
    * @param data 로그인 요청에 필요한 회원 정보
    * @return 로그인 성공 여부 판단
    * */
    @PostMapping("api/LogIn")
    public boolean logIN(@RequestBody Member data)
    {
        log.info(data.getEmail());
        boolean login = memberService.LogIn(data);
        return login;
    }

    /**
    * 회원 가입을 처리하는 엔드포인트
    * @param data 가입 요청에 필요한 회원 정보
    * @return 가입 성공 여부
    * */
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

    /**
    * 특정 이메일을 기준으로 회원의 주소를 반환하는 엔드포인트
    * @param email 찾을 회원의 이메일
    * @return 회원의 주소 목록
    * */
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
