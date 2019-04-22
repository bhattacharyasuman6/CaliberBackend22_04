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
public class CustomerDetails implements Serializable {

	private static final long serialVersionUID = 728806186124441033L;

		
		@Column(name = "cifNumber", nullable=false)
		private String cifNumber;
		
		@Column(name = "accountNumber", nullable=false)
		private String accountNumber;
		
		@Column(name = "status")
		private String status;
		
		@Column(name = "validFrom")
		private Date validFrom;
		
		@Column(name = "validTo")
		private Date validTo;
		
		@Column(name = "ruleId")
		private String ruleId;
		
		@Column(name = "offerResponceRatio")
		private Float offerResponceRatio;
		
		@Column(name = "priceSensitivity")
		private Integer priceSensitivity;
		
		@Column(name = "customerSegment")
		private String customerSegment;
		
		@Column(name = "rmId")
		private String rmId;
		
		/**
		 * Default constructor
		 */
		public CustomerDetails() {
			super();
		}

		/**
		 * @param id
		 * @param userid
		 * @param password
		 * @param cifnumber
		 * @param role
		 */
		public CustomerDetails(Long id, Long empid, String password, String empname, String userEmailId, Long projId, 
				String buid, String role) {
			super();
			this.cifNumber = cifNumber;
			this.accountNumber = accountNumber;
			this.status = status;
			this.validFrom = validFrom;
			this.validTo = validTo;
			this.ruleId = ruleId;
			this.offerResponceRatio = offerResponceRatio;
			this.priceSensitivity = priceSensitivity;
			this.customerSegment = customerSegment;
			this.rmId = rmId;
			
		}

		public String getCifNumber() {
			return cifNumber;
		}

		public void setCifNumber(String cifNumber) {
			this.cifNumber = cifNumber;
		}

		public String getAccountNumber() {
			return accountNumber;
		}

		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Date getValidFrom() {
			return validFrom;
		}

		public void setValidFrom(Date validFrom) {
			this.validFrom = validFrom;
		}

		public Date getValidTo() {
			return validTo;
		}

		public void setValidTo(Date validTo) {
			this.validTo = validTo;
		}

		public String getRuleId() {
			return ruleId;
		}

		public void setRuleId(String ruleId) {
			this.ruleId = ruleId;
		}

		public Float getOfferResponceRatio() {
			return offerResponceRatio;
		}

		public void setOfferResponceRatio(Float offerResponceRatio) {
			this.offerResponceRatio = offerResponceRatio;
		}

		public Integer getPriceSensitivity() {
			return priceSensitivity;
		}

		public void setPriceSensitivity(Integer priceSensitivity) {
			this.priceSensitivity = priceSensitivity;
		}

		public String getCustomerSegment() {
			return customerSegment;
		}

		public void setCustomerSegment(String customerSegment) {
			this.customerSegment = customerSegment;
		}

		public String getRmId() {
			return rmId;
		}

		public void setRmId(String rmId) {
			this.rmId = rmId;
		}

		

}
