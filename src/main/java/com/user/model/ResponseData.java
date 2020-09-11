package com.user.model;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ResponseData {

	@JsonFormat(shape= JsonFormat.Shape.STRING, pattern="yyyy-MM-dd hh:mm:ss")
	private LocalDateTime timestamp;
	private String respCode;
	private String respMessage;
	
	public ResponseData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResponseData(LocalDateTime timestamp, String respCode, String respMessage) {
		super();
		this.timestamp = timestamp;
		this.respCode = respCode;
		this.respMessage = respMessage;
	}
	/**
	 * @return the timestamp
	 */
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	/**
	 * @return the respCode
	 */
	public String getRespCode() {
		return respCode;
	}
	/**
	 * @param respCode the respCode to set
	 */
	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}
	/**
	 * @return the respMessage
	 */
	public String getRespMessage() {
		return respMessage;
	}
	/**
	 * @param respMessage the respMessage to set
	 */
	public void setRespMessage(String respMessage) {
		this.respMessage = respMessage;
	}
	
	
}
