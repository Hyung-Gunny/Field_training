package com.example.demo.login.entity;
/**
 *     파일명: Memberaddress.java
 *     프로그램 목적 및 기능:
 *         - 로그인 기능과 회원가입을 수행 하기 위해 필요한 멤버 변수들
 *     프로그램 작성자: 박 형 건 (2024년 1월 19일 (금))
 *     최종 Update: 2024.01.19
 *     ===================================================================
 *     프로그램 수정 및 보완 이력
 *     ===================================================================
 *     프로그램 작성자    보완 일자               보완 내용
 *     박 형 건        2024.1.19          멤버 데이터 변수들을 정리
 *     ===================================================================
 */

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity(name="memberaddress")
public class memberaddress
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int memberid;

    private String address;

    private String phone_number;

    private String name;

    @ManyToOne
    @JoinColumn(name="user_email", referencedColumnName = "email", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    @JsonIgnore
    private Member member;

    public memberaddress(){

    }

    public memberaddress(int memberid, String address, String phone_number, String name)
    {
        this.memberid=memberid;
        this.address=address;
        this.phone_number=phone_number;
        this.name=name;
    }

    public void setMember(Member member)
    {
        this.member=member;
    }

    public Member getMember()
    {
        return member;
    }

    public void setMemberid(int memberid)
    {
        this.memberid=memberid;
    }

    public int getMemberid()
    {
        return memberid;
    }

    public void setAddress(String address)
    {
        this.address=address;
    }

    public String getAddress()
    {
        return address;
    }

    public void setPhone_number(String phone_number)
    {
        this.phone_number=phone_number;
    }

    public void setName (String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return name;
    }


}
