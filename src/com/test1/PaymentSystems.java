package com.test1;

public class PaymentSystems {
	private long paymentId;
	private long systemId;
	private String availableGateways;
	private String maxTransactionTime;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public PaymentSystems() {

	}

	public PaymentSystems(long paymentId, long systemId, String availableGateways, String maxTransactionTime,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.paymentId = paymentId;
		this.systemId = systemId;
		this.availableGateways = availableGateways;
		this.maxTransactionTime = maxTransactionTime;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}

	public long getSystemId() {
		return systemId;
	}

	public void setSystemId(long systemId) {
		this.systemId = systemId;
	}

	public String getAvailableGateways() {
		return availableGateways;
	}

	public void setAvailableGateways(String availableGateways) {
		this.availableGateways = availableGateways;
	}

	public String getMaxTransactionTime() {
		return maxTransactionTime;
	}

	public void setMaxTransactionTime(String maxTransactionTime) {
		this.maxTransactionTime = maxTransactionTime;
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
