package com.example.demo.login.repository;
/**
 *     파일명: MemberRepository.java
 *     프로그램 목적 및 기능:
 *         - 로그인 기능과 회원가입을 수행 하기 위해 필요한 기본 매서드
 *     프로그램 작성자: 박 형 건 (2024년 1월 19일 (금))
 *     최종 Update: 2024.01.19
 *     ===================================================================
 *     프로그램 수정 및 보완 이력
 *     ===================================================================
 *     프로그램 작성자    보완 일자               보완 내용
 *     박 형 건        2024.1.19          멤버 주소 메서드를 나타냄
 *     ===================================================================
 */

import com.example.demo.login.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Member 엔터티에 대한 JPA Repository 인터페이스.
 * JpaRepository를 확장하여 기본적인 CRUD 기능을 제공받습니다.
 */
public interface MemberRepository extends JpaRepository<Member, String>
{
    /**
     * 특정 이메일을 기준으로 회원을 조회하는 메서드.
     * @param email 조회할 회원의 이메일
     * @return 해당 이메일을 가진 회원
     */
    Member findMemberByEmail(String email);

    /**
     * 이메일과 비밀번호를 기준으로 회원을 조회하는 메서드.
     * @param email 조회할 회원의 이메일
     * @param password 조회할 회원의 비밀번호
     * @return 해당 이메일과 비밀번호를 가진 회원
     */
    Optional<Member> findMemberByEmailAndPassword(String email, String password);
}
