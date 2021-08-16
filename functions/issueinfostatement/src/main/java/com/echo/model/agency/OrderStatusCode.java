package com.echo.model.agency;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonCreator;

@XmlType(name = "OrderStatusCode")
@XmlEnum
public enum OrderStatusCode {

	NEW_REQUEST("New Request"), IN_PROGRESS("In Progress"), CANCELLED("Cancelled"), COMPLETED("Completed"), ELAPSED(
			"Elapsed"), UNDER_REVIEW("Under Review"), UNKNOWN("Unknown");

	String value;

	private OrderStatusCode(String value) {
		this.value = value;
	}

	public String value() {
		return this.value;
	}

	@JsonCreator
	public static OrderStatusCode fromValue(String v) {
		for (OrderStatusCode code : values()) {
			if (code.value().equals(v))
				return code;
		}
		return UNKNOWN;
	}

}
