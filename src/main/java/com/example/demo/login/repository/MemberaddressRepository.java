package com.example.demo.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.login.entity.memberaddress;
import java.util.List;

public interface MemberaddressRepository extends JpaRepository<memberaddress, Integer>
{
    List<memberaddress> findByMemberEmail(String user_email);
}
