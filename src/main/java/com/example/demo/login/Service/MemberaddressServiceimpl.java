package com.example.demo.login.Service;

import com.example.demo.login.entity.memberaddress;
import com.example.demo.login.repository.MemberaddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MemberaddressServiceimpl implements MemberaddressService
{
    @Autowired
    private MemberaddressRepository memberaddressRepository;
    @Override
    public List<memberaddress> get_my_address(String useremail)
    {
        List<memberaddress> byEmail= memberaddressRepository.findByMemberEmail(useremail);
        return byEmail;
    }
}
