package com.cts.cloud.enablement.onlinesales1.domain;

import java.io.Serializable;
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
public class Transaction implements Serializable {

	private static final long serialVersionUID = 728806186124441033L;

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		//@GeneratedValue(strategy = GenerationType.TABLE)
		@Column(name = "transactionId")
		private Long transactionId;
		
		@Column(name = "debitAccount", nullable=false)
		private String debitAccount;
		
		@Column(name = "creditAccount")
		private String creditAccount;
		
		@Column(name = "transactionDate")
		private Date transactionDate;
		
		@Column(name = "transactionCurrency")
		private String transactionCurrency;
		
		@Column(name = "transactionAmount")
		private Float transactionAmount;
		
		@Column(name = "transactionType")
		private String transactionType;
		
		@Column(name = "transactionProduct")
		private String transactionProduct;
		
		/**
		 * Default constructor
		 */
		public Transaction() {
			super();
		}

		/**
		 * @param id
		 * @param userid
		 * @param password
		 * @param cifnumber
		 * @param role
		 */
		public Transaction(Long id, Long empid, String password, String empname, String userEmailId, Long projId, 
				String buid, String role) {
			super();
			this.transactionId = transactionId;
			this.debitAccount = debitAccount;
			this.creditAccount = creditAccount;
			this.transactionDate = transactionDate;
			this.transactionCurrency = transactionCurrency;
			this.transactionAmount = transactionAmount;
			this.transactionType = transactionType;
			this.transactionProduct = transactionProduct;
			
		}

		public Long getTransactionId() {
			return transactionId;
		}

		public void setTransactionId(Long transactionId) {
			this.transactionId = transactionId;
		}

		public String getDebitAccount() {
			return debitAccount;
		}

		public void setDebitAccount(String debitAccount) {
			this.debitAccount = debitAccount;
		}

		public String getCreditAccount() {
			return creditAccount;
		}

		public void setCreditAccount(String creditAccount) {
			this.creditAccount = creditAccount;
		}

		public Date getTransactionDate() {
			return transactionDate;
		}

		public void setTransactionDate(Date transactionDate) {
			this.transactionDate = transactionDate;
		}

		public String getTransactionCurrency() {
			return transactionCurrency;
		}

		public void setTransactionCurrency(String transactionCurrency) {
			this.transactionCurrency = transactionCurrency;
		}

		public Float getTransactionAmount() {
			return transactionAmount;
		}

		public void setTransactionAmount(Float transactionAmount) {
			this.transactionAmount = transactionAmount;
		}

		public String getTransactionType() {
			return transactionType;
		}

		public void setTransactionType(String transactionType) {
			this.transactionType = transactionType;
		}

		public String getTransactionProduct() {
			return transactionProduct;
		}

		public void setTransactionProduct(String transactionProduct) {
			this.transactionProduct = transactionProduct;
		}


}
