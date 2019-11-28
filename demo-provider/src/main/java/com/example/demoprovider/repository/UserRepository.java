package com.example.demoprovider.repository;

import com.example.demoprovider.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}
