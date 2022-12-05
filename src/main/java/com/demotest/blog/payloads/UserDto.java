package com.demotest.blog.payloads;

import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.demotest.blog.entities.Role;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

public class UserDto {
	
	private int id;
	
	@NotEmpty
	@Size(min=4, message="Userame must be minimum of 4 letters ")
	private String name;
	
	@Email(message="Your Email address is not valid")
	private String email;
	
	@NotEmpty
	@Size(min=3,max=10,message="password must be min=3chars and max=10chars !!")
	//pattern(regexp="......from google.......") Like alphanumeric and all
	private String password;
	
	@NotEmpty
	private String about;
	
	private Set<RoleDto> roles = new HashSet<>();

}
