//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation,
// v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2019.06.04 at 11:00:12 AM IST
//


package com.echo.model.agency;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the
 * com.echo.model.response package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation for XML content.
 * The Java representation of XML content can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory methods for each of these are provided in
 * this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package:
	 * com.echo.model.response
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link CustodianResponse }
	 * 
	 */
	public CustodianResponse createCustodianResponse() {
		return new CustodianResponse();
	}

	/**
	 * Create an instance of {@link CustodianResponse.Exceptions }
	 * 
	 */
	public CustodianResponse.Exceptions createCustodianResponseExceptions() {
		return new CustodianResponse.Exceptions();
	}

	/**
	 * Create an instance of {@link CustodianResponses }
	 * 
	 */
	public CustodianResponses createCustodianResponses() {
		return new CustodianResponses();
	}

	/**
	 * Create an instance of {@link CustodianResponse.OrderStatus }
	 * 
	 */
	public CustodianResponse.OrderStatus createCustodianResponseOrderStatus() {
		return new CustodianResponse.OrderStatus();
	}

	/**
	 * Create an instance of {@link CustodianResponse.CustodianReferences }
	 * 
	 */
	public CustodianResponse.CustodianReferences createCustodianResponseCustodianReferences() {
		return new CustodianResponse.CustodianReferences();
	}

	/**
	 * Create an instance of {@link CustodianResponse.Exceptions.Exception }
	 * 
	 */
	public CustodianResponse.Exceptions.Exception createCustodianResponseExceptionsException() {
		return new CustodianResponse.Exceptions.Exception();
	}

}
