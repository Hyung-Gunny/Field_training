package com.example.demo.login.entity;
/**
 *     파일명: Member.java
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
import java.util.List;
import java.util.ArrayList;

@Entity(name="user")
public class Member
{

    @Id
    @Column(name="email")
    private String email;

    private String password;

    private String gender;

    private String phone_number;

    private String address;

    private String username;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<memberaddress> addressList;

    public Member() {}

    public Member(String email, String password, String gender, String phone_number, String address, String username)
    {
        this.address=address;
        this.password=password;
        this.gender=gender;
        this.email=email;
        this.phone_number=phone_number;
        this.username=username;
    }

    public String getEmail()
    {
        return email;
    }

    public List<memberaddress> getAddressList()
    {
        if(addressList==null)
        {
            addressList=new ArrayList<>();
        }

        return addressList;
    }

    public void setAddressList(List<memberaddress> addressList)
    {

        this.addressList=addressList;
    }

    public void setEmail(String email)
    {
        this.email=email;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password=password;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender=gender;
    }

    public String getPhone_number()
    {
        return phone_number;
    }

    public void setPhone_number(String phone_number)
    {
        this.phone_number=phone_number;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address=address;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username=username;
    }


}
