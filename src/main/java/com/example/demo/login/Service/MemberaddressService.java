package com.example.demo.login.Service;
import java.util.List;
import com.example.demo.login.entity.memberaddress;
public interface MemberaddressService
{
    List<memberaddress> get_my_address(String useremail);
}
