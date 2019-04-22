package com.cts.cloud.enablement.onlinesales1.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Max;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author 547991
 *
 */
@Entity
@Table
public class ActiveDirectory implements Serializable {

	private static final long serialVersionUID = 728806186124441033L;

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		//@GeneratedValue(strategy = GenerationType.TABLE)
		@Column(name = "id")
		private Long id;
		
		@Column(name = "userId", unique=true, nullable=false)
		private String userId;
		
		@Column(name = "password")
		private String password;
		
		@Column(name = "cifNumber")
		private String cifNumber;
		
		
		@Column(name = "role")
		private String role;
		
		
		/**
		 * Default constructor
		 */
		public ActiveDirectory() {
			super();
		}

		/**
		 * @param id
		 * @param userid
		 * @param password
		 * @param cifnumber
		 * @param role
		 */
		public ActiveDirectory(Long id, Long empid, String password, String empname, String userEmailId, Long projId, 
				String buid, String role) {
			super();
			this.id = id;
			this.userId = userId;
			this.password = password;
			this.cifNumber = cifNumber;
			this.role = role;
			
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getUserId() {
			return userId;
		}

		public void setUserid(String userId) {
			this.userId = userId;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getCifNumber() {
			return cifNumber;
		}

		public void setCifNumber(String cifNumber) {
			this.cifNumber = cifNumber;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		


}