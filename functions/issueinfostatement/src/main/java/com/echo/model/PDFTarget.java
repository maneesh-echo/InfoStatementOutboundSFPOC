package com.echo.model;

public enum PDFTarget {
	LANDATA("LanData"), SAI_GLOBAL("SAIGPROPERTY"), UNKNOWN(null);

	private String target;

	private PDFTarget(String target) {
		this.target = target;
	}

	public String value() {
		return this.target;
	}

	public static PDFTarget fromValue(String v) {
		if (v != null) {
			for (PDFTarget code : values()) {
				if (v.equals(code.value()))
					return code;
			}
		}
		return UNKNOWN;
	}
}
