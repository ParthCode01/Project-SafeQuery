package com.parth.projectsafequery.repository;

import com.parth.projectsafequery.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {



}
