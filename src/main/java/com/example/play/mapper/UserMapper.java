package com.example.play.mapper;

import org.springframework.stereotype.Repository;
import com.example.play.domain.User;;

@Repository
public interface UserMapper {

	User Sel(int id);

}
