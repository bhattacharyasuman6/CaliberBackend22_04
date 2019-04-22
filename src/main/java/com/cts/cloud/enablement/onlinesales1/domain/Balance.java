package com.cts.cloud.enablement.onlinesales1.domain;

import java.io.Serializable;
import java.security.Timestamp;
import java.util.Date;

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
public class Balance implements Serializable {

	private static final long serialVersionUID = 728806186124441033L;

		
		@Column(name = "accountNumber", nullable=false)
		private String accountNumber;
		
		@Column(name = "amount")
		private Float amount;
		
		@Column(name = "currency")
		private String currency;
		
		@Column(name = "updateTimestamp")
		private Timestamp updateTimestamp;
		
		/**
		 * Default constructor
		 */
		public Balance() {
			super();
		}

		/**
		 * @param id
		 * @param userid
		 * @param password
		 * @param cifnumber
		 * @param role
		 */
		public Balance(Long id, Long empid, String password, String empname, String userEmailId, Long projId, 
				String buid, String role) {
			super();
			this.accountNumber = accountNumber;
			this.amount = amount;
			this.currency = currency;
			this.updateTimestamp = updateTimestamp;
			
		}

		public String getAccountNumber() {
			return accountNumber;
		}

		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}

		public Float getAmount() {
			return amount;
		}

		public void setAmount(Float amount) {
			this.amount = amount;
		}

		public String getCurrency() {
			return currency;
		}

		public void setCurrency(String currency) {
			this.currency = currency;
		}

		public Timestamp getUpdateTimestamp() {
			return updateTimestamp;
		}

		public void setUpdateTimestamp(Timestamp updateTimestamp) {
			this.updateTimestamp = updateTimestamp;
		}
		

}

