package com.example.demo.login.entity;


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
