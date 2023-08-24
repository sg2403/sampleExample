package org.sample.controller;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.sample.Entity.Login;
import org.sample.Entity.loginPOJO;
import org.sample.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
public class LoginController {
	
	@Autowired
	private LoginService loginservice;
	
	@PostMapping("/login")
	public loginPOJO getLogin(@RequestParam("login_id") String login_id, @RequestParam("password") String pwd) {
		
		
		Login login = loginservice.getLogin(login_id, pwd);
		loginPOJO login1=new loginPOJO();
		if(login!=null) {
			System.out.println("controller Login");
			String token = getJWTToken(login_id);
			login1.setBearer_token(token);
			login1.setLogin_id(login_id);
//			login.setPassword(pwd);
			return login1;
		}
		return login1;
		
		
		
		
	}
	
	private String getJWTToken(String login_id) {
		String secretKey = "mySecretKey";
		List<GrantedAuthority> grantedAuthorities = AuthorityUtils
				.commaSeparatedStringToAuthorityList("ROLE_USER");
		
		String token = Jwts
				.builder()
				.setId("test")
				.setSubject(login_id)
				.claim("authorities",
						grantedAuthorities.stream()
								.map(GrantedAuthority::getAuthority)
								.collect(Collectors.toList()))
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 600000))
				.signWith(SignatureAlgorithm.HS512,
						secretKey.getBytes()).compact();

		return "Bearer " + token;
	}
	

}
