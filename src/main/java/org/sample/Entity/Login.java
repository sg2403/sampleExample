package org.sample.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="login")

public class Login {

	@Id
	@NotNull
	@Column(name="login_id",unique = true)
	private String login_id;
	
	@NotNull
	@Column(name="password")
	private String password;
//	
//	@NotNull
//	@Column(name="bearer_token")
//	private String bearer_token;

//	public String getBearer_token() {
//		return bearer_token;
//	}
//
//	public void setBearer_token(String bearer_token) {
//		this.bearer_token = bearer_token;
//	}

	public Login() {
	
	}

	public Login(@NotNull String login_id, @NotNull String password) {
		
		this.login_id = login_id;
		this.password = password;
		
	}

	public String getLogin_id() {
		return login_id;
	}

	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
