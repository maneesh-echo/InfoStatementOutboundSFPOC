package com.echo.model;

public class FunctionInput {

    private String requestNumber;
		
	private String pdfTarget;
	
	private String pdfBucket;
	
	private String pdfKey;
	
	private String solicitorReference;

	public String getRequestNumber() {
		return requestNumber;
	}

	public void setRequestNumber(String requestNumber) {
		this.requestNumber = requestNumber;
	}

	public String getPdfTarget() {
		return pdfTarget;
	}

	public void setPdfTarget(String pdfTarget) {
		this.pdfTarget = pdfTarget;
	}

	public String getPdfBucket() {
		return pdfBucket;
	}

	public void setPdfBucket(String pdfBucket) {
		this.pdfBucket = pdfBucket;
	}

	public String getPdfKey() {
		return pdfKey;
	}

	public void setPdfKey(String pdfKey) {
		this.pdfKey = pdfKey;
	}

	public String getSolicitorReference() {
		return solicitorReference;
	}

	public void setSolicitorReference(String solicitorReference) {
		this.solicitorReference = solicitorReference;
	}
	
}
