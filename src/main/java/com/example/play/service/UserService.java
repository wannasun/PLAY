package com.example.play.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.play.mapper.UserMapper;
import com.example.play.domain.User;

@Service
public class UserService {

	@Autowired
	UserMapper userMapper;
	public User Sel(int id){
		return userMapper.Sel(id);
	}
}
