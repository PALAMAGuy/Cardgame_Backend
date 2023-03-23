package com.example.demo.payload.request;

import java.util.Set;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

/**
 * Classe récuperant les requetes de création de compte
 */

public class SignupRequest {
    @NotBlank
    @Size(min = 3, max = 20)
    private String username;
 
    @NotBlank
    @Size(max = 50)
    @Email
    private String email;
    
    private Set<String> role;
    
    @NotBlank
    @Size(min = 6, max = 40)
    private String password;
	/**
	 * Getter
	 * @return data
	 */
    public String getUsername() {
        return username;
    }
	/**
	 * Setter
	 * @param username param
	 */
    public void setUsername(String username) {
        this.username = username;
    }
	/**
	 * Getter
	 * @return data
	 */
    public String getEmail() {
        return email;
    }
	/**
	 * Setter
	 * @param email param
	 */
    public void setEmail(String email) {
        this.email = email;
    }
	/**
	 * Getter
	 * @return data
	 */
    public String getPassword() {
        return password;
    }
	/**
	 * Setter
	 * @param password param
	 */
    public void setPassword(String password) {
        this.password = password;
    }
	/**
	 * Getter
	 * @return data
	 */
    public Set<String> getRole() {
      return this.role;
    }
	/**
	 * Setter
	 * @param role param
	 */
    public void setRole(Set<String> role) {
      this.role = role;
    }
}
