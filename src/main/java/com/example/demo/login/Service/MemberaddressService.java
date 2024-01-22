package com.example.demo.login.Service;
/**
 *     파일명: MemberaddressService.java
 *     프로그램 목적 및 기능:
 *         - 로그인 기능과 회원가입을 수행 하기 위한 에터티와 관련된 비지니스 로직을 처리
 *     프로그램 작성자: 박 형 건 (2024년 1월 19일 (금))
 *     최종 Update: 2024.01.19
 *     ===================================================================
 *     프로그램 수정 및 보완 이력
 *     ===================================================================
 *     프로그램 작성자    보완 일자               보완 내용
 *     박 형 건        2024.1.19          비즈니스 로직을 처리하는 서비스 인터페이스
 *     ===================================================================
 */

import java.util.List;
import com.example.demo.login.entity.memberaddress;

/**
 * Memberaddress 엔터티와 관련된 비즈니스 로직을 처리하는 서비스 인터페이스.
 */
public interface MemberaddressService {

    /**
     * 특정 회원 이메일을 기준으로 회원의 배송 주소 목록을 조회하는 메서드.
     * @param useremail 조회할 회원의 이메일
     * @return 해당 회원의 배송 주소 목록
     */
    List<memberaddress> get_my_address(String useremail);
}
