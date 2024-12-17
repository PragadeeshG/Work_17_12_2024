package com.test1;

public class StripeSystem {
	private long systemCode;
	private String paymentId;
	private String sessionId;
	private String paymentStatus;
	private String paymentGateway;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public StripeSystem() {

	}

	public StripeSystem(long systemCode, String paymentId, String sessionId, String paymentStatus,
			String paymentGateway, String creationDate, String modifiedDate, String entityState) {
		super();
		this.systemCode = systemCode;
		this.paymentId = paymentId;
		this.sessionId = sessionId;
		this.paymentStatus = paymentStatus;
		this.paymentGateway = paymentGateway;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getSystemCode() {
		return systemCode;
	}

	public void setSystemCode(long systemCode) {
		this.systemCode = systemCode;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getPaymentGateway() {
		return paymentGateway;
	}

	public void setPaymentGateway(String paymentGateway) {
		this.paymentGateway = paymentGateway;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
