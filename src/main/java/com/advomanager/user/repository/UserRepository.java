package com.advomanager.user.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.advomanager.user.domain.User;

public interface UserRepository extends JpaRepository <User, UUID> {

}
