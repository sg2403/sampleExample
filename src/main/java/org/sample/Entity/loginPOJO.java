package org.sample.Entity;

public class loginPOJO {
	
		
		private String login_id;
		
		
		private String password;
		
		
		private String bearer_token;

		public String getBearer_token() {
			return bearer_token;
		}
	
		public void setBearer_token(String bearer_token) {
			this.bearer_token = bearer_token;
	}

	

		public loginPOJO(String login_id, String password, String bearer_token) {
			
			this.login_id = login_id;
			this.password = password;
			this.bearer_token = bearer_token;
		}

		public loginPOJO() {
			
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



