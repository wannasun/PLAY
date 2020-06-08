package com.example.play.domain;

import org.springframework.stereotype.Component;
import lombok.Data;

@Data
@Component
public class User {
	private Integer id;
	private String name;
	private String age;
	private String sex;
}
