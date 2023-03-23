package com.example.demo.model;

/**

This enum represents the different roles that a user can have in the system.
Each role has different permissions and access levels, which determine what
actions the user can perform and what information they can see.

*/
public enum ERole {
	/**
	 * USER
	 */
	  ROLE_USER,
	  /**
		 * MODERATOR
		 */
	  ROLE_MODERATOR,
	  /**
		 * ADMIN
		 */
	  ROLE_ADMIN
	}