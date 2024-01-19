package com.example.demo.login.Service;

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
        Optional<Member> memberByEmailAndPassword=memberRepository.findMemberByEmailAndPassword(member.getEmail(), member.getPassword());
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
