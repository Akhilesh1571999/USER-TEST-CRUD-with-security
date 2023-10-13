package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.model.User;
import com.example.model.Credentials;

public interface UserRepository extends JpaRepository<User, Integer>{


}
