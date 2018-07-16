package com.ming.service;


import com.ming.domain.User;
import com.ming.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author chenmingcan
 */
@Service
public class UserServiceImpl   {

	private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

	@Autowired
	private UserDao userDao;


	public User create(String username, String password) {

		User user=new User();
		user.setUsername(username);
		String hash = encoder.encode(password);
		user.setPassword(hash);
		User u=userDao.save(user);
		return u;

	}
}
