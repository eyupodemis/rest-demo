package org.javaninja.http.base;

import java.util.Date;

public class JavaNinjaResponseHeader {
	
	private int statusCode;
	
	private Date responseTime;

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public Date getResponseTime() {
		return responseTime;
	}

	public void setResponseTime(Date responseTime) {
		this.responseTime = responseTime;
	}

}
