package com.example.demo.login.entity;


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
