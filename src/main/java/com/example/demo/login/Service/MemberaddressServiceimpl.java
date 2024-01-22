package com.example.demo.login.Service;
/**
 *     파일명: MemberaddressServiceimpl.java
 *     프로그램 목적 및 기능:
 *         - 로그인 기능과 회원가입을 수행 하기 위한 에터티와 관련된 비지니스 로직을 처리를
 *           위한 서비스 클래스
 *     프로그램 작성자: 박 형 건 (2024년 1월 19일 (금))
 *     최종 Update: 2024.01.19
 *     ===================================================================
 *     프로그램 수정 및 보완 이력
 *     ===================================================================
 *     프로그램 작성자    보완 일자               보완 내용
 *     박 형 건        2024.1.19          비즈니스 로직을 처리하는 서비스 클래스
 *     ===================================================================
 */

import com.example.demo.login.entity.memberaddress;
import com.example.demo.login.repository.MemberaddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * MemberaddressService 인터페이스를 구현하는 서비스 클래스.
 */
@Service
public class MemberaddressServiceimpl implements MemberaddressService {

    @Autowired
    private MemberaddressRepository memberaddressRepository;

    @Override
    public List<memberaddress> get_my_address(String useremail) {
        // MemberaddressRepository를 통해 회원의 배송 주소 목록을 조회합니다.
        List<memberaddress> byEmail = memberaddressRepository.findByMemberEmail(useremail);
        return byEmail;
    }
}
