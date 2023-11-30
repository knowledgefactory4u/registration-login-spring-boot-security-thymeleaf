package com.knf.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.knf.dev.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
