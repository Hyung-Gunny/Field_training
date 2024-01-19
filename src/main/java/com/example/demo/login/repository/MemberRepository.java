package com.example.demo.login.repository;

import com.example.demo.login.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, String>
{
    Member findMemberByEmail(String email);

    Optional<Member> findMemberByEmailAndPassword(String email, String password);
}
