package com.ming.repository;

import com.ming.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author chenmingcan
 */
public interface UserDao extends JpaRepository<User, Long> {

	User findByUsername(String username);
}
