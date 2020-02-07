/*
 * @ApiResponse.java	@Jan 28, 2020
 */
package com.ec2.rds.api.vo;

/**
 * <p>
 * </p>
 *
 * @author Bhabani.behera
 * @version 1.0
 *
 */
public class ApiResponse {
	private String message;
	private Object data;

	/**
	 * <p>
	 * </p>
	 *
	 * @param responseBuilder
	 */
	public ApiResponse(ResposeBuilder responseBuilder) {

		super();
		this.message = responseBuilder.message;
		this.data = responseBuilder.data;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {

		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {

		this.message = message;
	}

	/**
	 * @return the data
	 */
	public Object getData() {

		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Object data) {

		this.data = data;
	}

	public static class ResposeBuilder {
		private String message;
		private Object data;

		public ResposeBuilder() {
			super();
		}

		public static ResposeBuilder getSuccessResposeBuilder(Object data) {
			ResposeBuilder builder = new ResposeBuilder();
			builder.setData(data);
			return builder;
		}

		public static ResposeBuilder getFailureResposeBuilder(String message) {
			ResposeBuilder builder = new ResposeBuilder();
			builder.setMessage(message);
			return builder;
		}

		public ApiResponse build() {
			return new ApiResponse(this);
		}

		/**
		 * @return the message
		 */
		public String getMessage() {

			return message;
		}

		/**
		 * @param message the message to set
		 */
		public void setMessage(String message) {

			this.message = message;
		}

		/**
		 * @return the data
		 */
		public Object getData() {

			return data;
		}

		/**
		 * @param data the data to set
		 */
		public void setData(Object data) {

			this.data = data;
		}
	}

}
