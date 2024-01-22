package com.example.demo.login.Service;
/**
 *     파일명: MemberServiceimpl.java
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

import com.example.demo.login.repository.MemberRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.login.entity.Member;
import com.example.demo.login.entity.memberaddress;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;

/**
 * 회원과 관련된 비즈니스 로직을 처리하는 서비스 클래스.
 */
@Service
public class MemberServiceimpl implements MemberService
{
    @Autowired
    private MemberRepository memberRepository;

    @Override
    public Member findMemberByEmail(String email)
    {
        return memberRepository.findMemberByEmail(email);
    }

    @Override
    @Transactional
    public String join(Member member)
    {
        Optional<Member> memberByEmail = Optional.ofNullable(memberRepository.findMemberByEmail(member.getEmail()));
        if(memberByEmail.isPresent())
        {
            return "존재하고 있는 Id입니다.";
        }
        else
        {
            try{
                memberaddress memberaddress=new memberaddress();

                memberaddress.setAddress(member.getAddress());
                memberaddress.setName(member.getUsername());
                memberaddress.setPhone_number(member.getPhone_number());

                memberaddress.setMember(member);
                member.getAddressList().add(memberaddress);

                memberRepository.save(member);

                return "회원가입이 완료 되었습니다.";
            }catch (
                    Exception a
            ){
                a.printStackTrace();
                return "회원가입을 완료하지 못 하였습니다.";
            }

        }
    }



    @Override
    public boolean LogIn(Member member)
    {
        Optional<Member> memberByEmailAndPassword = memberRepository.findMemberByEmailAndPassword(member.getEmail(), member.getPassword());
        return memberByEmailAndPassword.isPresent();

    }

    @Override
    public Map<String, Object> get_my_info (String useremail) throws SQLException{
        return null;
    }

    @Override
    public List<Map<String, Objects>> update_addresss(String user_email, String address, String phoneNumber, String name) {
        return null;
    }


}
