package com.test1;

public class ZelleSystem {
	private long systemCode;
	private String orderId;
	private String recieptUrl;
	private String primaryAccountType;
	private String transactionStatus;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public ZelleSystem() {

	}

	public ZelleSystem(long systemCode, String orderId, String recieptUrl, String primaryAccountType,
			String transactionStatus, String creationDate, String modifiedDate, String entityState) {
		super();
		this.systemCode = systemCode;
		this.orderId = orderId;
		this.recieptUrl = recieptUrl;
		this.primaryAccountType = primaryAccountType;
		this.transactionStatus = transactionStatus;
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

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getRecieptUrl() {
		return recieptUrl;
	}

	public void setRecieptUrl(String recieptUrl) {
		this.recieptUrl = recieptUrl;
	}

	public String getPrimaryAccountType() {
		return primaryAccountType;
	}

	public void setPrimaryAccountType(String primaryAccountType) {
		this.primaryAccountType = primaryAccountType;
	}

	public String getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
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
