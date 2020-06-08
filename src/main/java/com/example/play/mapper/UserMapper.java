package com.example.play.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.example.play.domain.User;;

@Mapper
public interface UserMapper {

	User Sel();

}
