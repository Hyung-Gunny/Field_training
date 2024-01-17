package com.example.demo.login.repository;

import com.example.demo.login.dto.SiteUser;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<SiteUser, Long> {
}
