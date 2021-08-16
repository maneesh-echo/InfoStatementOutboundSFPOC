package com.echo.util;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JaxbUtil {

	/**
	 * Hide constructor
	 */
	private JaxbUtil() {
	}

	public static String objectToXMLString(Class<?> classToBeBound, Object jaxbElement) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(classToBeBound);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		StringWriter sw = new StringWriter();
		jaxbMarshaller.marshal(jaxbElement, sw);
		return sw.toString();
	}

	public static Object xmlStringToObject(Class<?> classToBeBound, String xmlString) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(classToBeBound);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		return jaxbUnmarshaller.unmarshal(new StringReader(xmlString));
	}

}
