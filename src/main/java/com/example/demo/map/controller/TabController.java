package com.example.demo.map.controller;
/**
 *     파일명: TabController.java
 *     프로그램 목적 및 기능:
 *         - 맵에서 메뉴 상단바에 있는 이벤트를 실행 시켜 다른 웹 페이지로 넘어가도록 만듬
 *     프로그램 작성자: 박 형 건 (2024년 1월 23일 (화))
 *     최종 Update: 2024.01.23
 *     ===================================================================
 *     프로그램 수정 및 보완 이력
 *     ===================================================================
 *     프로그램 작성자    보완 일자               보완 내용
 *     박 형 건        2024.1.23         맵에서 메뉴 상단바를 클릭 시 다른 웹 페이지를
 *                                     만들어 이동하게 만듬
 *     ===================================================================
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TabController
{
    //app을 누르게 되면 app.html로 전환 되어지게 만들어짐
    @GetMapping("/app")
    public String appPage()
    {
        return "app";
    }

    //map을 누르게 되면 map.html로 전환 되어지게 만들어짐
    @GetMapping("/map")
    public String mapPage()
    {
        return "map";
    }

    //지하관로을 누르게 되면 underground로 전환 되어지게 만들어짐
    @GetMapping("/underground")
    public String undergroundPage()
    {
        return "underground";
    }

    //실시간 원격 협업을 누르게 되면 collaboration.html로 전환 되어지게 만들어짐
    @GetMapping("/realtime-collaboration")
    public String realtimeCollaboration()
    {
        return "collaboration";
    }

    @GetMapping("/integratedpipeline")
    public String Integratedpipeline(){return "integratedpipeline";}
}
