//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.04.28 at 12:49:50 PM EDT
//

package com.ibm.rqm.xml.bind.processinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * <p>
 * Java class for anonymous complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute ref="{http://www.w3.org/1999/02/22-rdf-syntax-ns#}datatype use="required""/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"content"})
@XmlRootElement(name = "category")
public class Category
{
    
    @XmlValue
    protected String content;
    
    @XmlAttribute(namespace = "http://www.w3.org/1999/02/22-rdf-syntax-ns#", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String datatype;
    
    /**
     * Gets the value of the content property.
     * 
     * @return possible object is {@link String }
     */
    public String getContent()
    {
        return content;
    }
    
    /**
     * Sets the value of the content property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setContent(String value)
    {
        this.content = value;
    }
    
    /**
     * Gets the value of the datatype property.
     * 
     * @return possible object is {@link String }
     */
    public String getDatatype()
    {
        return datatype;
    }
    
    /**
     * Sets the value of the datatype property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setDatatype(String value)
    {
        this.datatype = value;
    }
    
}
