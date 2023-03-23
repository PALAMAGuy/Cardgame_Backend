package com.example.demo.payload.request;

import jakarta.validation.constraints.NotBlank;

/**
 * Classe récuperant les requetes de connexions
 */

public class LoginRequest {
	@NotBlank
	private String username;

	@NotBlank
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
}