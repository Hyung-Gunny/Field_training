package com.example.demo.login.Service;
/**
 *     파일명: MemberService.java
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

import com.example.demo.login.entity.Member;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Member 엔터티와 관련된 비즈니스 로직을 처리하는 서비스 인터페이스.
 */
public interface MemberService {

    /**
     * 특정 이메일을 기준으로 회원을 조회하는 메서드.
     * @param email 조회할 회원의 이메일
     * @return 해당 이메일을 가진 회원
     */
    Member findMemberByEmail(String email);

    /**
     * 회원 가입을 처리하는 메서드.
     * @param member 가입할 회원의 정보
     * @return 회원 가입 결과 메시지
     */
    String join(Member member);

    /**
     * 로그인을 처리하는 메서드.
     * @param member 로그인 시 사용할 회원의 정보
     * @return 로그인 성공 여부
     */
    boolean LogIn(Member member);

    /**
     * 특정 회원의 정보를 조회하는 메서드.
     * @param useremail 조회할 회원의 이메일
     * @return 회원 정보 및 추가 정보를 담은 Map
     * @throws SQLException SQL 예외가 발생할 경우
     */
    Map<String, Object> get_my_info(String useremail) throws SQLException;

    /**
     * 특정 회원의 배송 주소를 업데이트하는 메서드.
     * @param user_email 업데이트할 회원의 이메일
     * @param address 새로운 주소
     * @param phoneNumber 새로운 전화번호
     * @param name 새로운 이름
     * @return 업데이트 결과를 담은 List<Map<String, Objects>>
     */
    List<Map<String, Objects>> update_addresss(String user_email, String address, String phoneNumber, String name);
}
