package com.example.demo.map.controller;
/**
 *     파일명: MapViewController.java
 *     프로그램 목적 및 기능:
 *         - 웹 사이트 화면상에 맵을 보여주고 맵 안에서의 컨트롤을 담당하여 준다.
 *     프로그램 작성자: 박 형 건 (2024년 1월 19일 (금))
 *     최종 Update: 2024.01.19
 *     ===============================================================
 *     프로그램 수정 및 보완 이력
 *     ===============================================================
 *     프로그램 작성자    보완 일자               보완 내용
 *     박 형 건        2024.1.19          맵을 보여주게 하는 컨트롤러
 *     ===============================================================
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class MapViewController
{
    @GetMapping("/map")
    public ModelAndView showMapPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("map");
        return modelAndView;
    }
}
