package com.example.demo.login.Service;

import com.example.demo.login.entity.Member;

import java.sql.SQLException;
import java.util.Map;
import java.util.Objects;
import java.util.List;
public interface MemberService
{
    Member findMemberByEmail(String email);
    String join(Member member);
    boolean LogIn(Member member);
    Map<String, Object> get_my_info(String useremail) throws SQLException;
    List<Map<String,Objects>> update_addresss(String user_email, String address, String phoneNumber, String name);
}
