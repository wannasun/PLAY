package com.example.play.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.example.play.domain.User;;

@Mapper
public interface UserMapper {

	List<User> Sel();

}
