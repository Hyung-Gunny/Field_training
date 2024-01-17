/*
 *     파일명: MapController.java
 *     프로그램 목적 및 기능:
 *         - 웹 사이트 화면상에 맵을 보여주고 맵 안에서의 컨트롤을 담당하여 준다.
 *     프로그램 작성자: 박 형 건 (2024년 1월 12일 (금))
 *     최종 Update: 2024.01.12
 *     ===============================================================
 *     프로그램 수정 및 보완 이력
 *     ===============================================================
 *     프로그램 작성자    보완 일자               보완 내용
 *     박 형 건        2024.1.12          웹 상의 맵을 컨트롤
 *     ===============================================================
 */

package com.example.demo.map.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// map.html 로 매핑
@Controller
public class MapController {
    @GetMapping("/map")
    public String showMap(Model model)
    {

        return "map";
    }

}

