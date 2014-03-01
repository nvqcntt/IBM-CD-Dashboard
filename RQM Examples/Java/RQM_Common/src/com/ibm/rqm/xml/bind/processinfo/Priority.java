//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.04.28 at 12:49:50 PM EDT
//

package com.ibm.rqm.xml.bind.processinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

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
 *       &lt;sequence>
 *         &lt;element name="default" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element ref="{http://purl.org/dc/elements/1.1/}title"/>
 *         &lt;element ref="{http://purl.org/dc/elements/1.1/}identifier"/>
 *         &lt;element ref="{http://jazz.net/xmlns/prod/jazz/rqm/process/1.0/}projectArea"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"_default", "title", "identifier", "projectArea"})
@XmlRootElement(name = "Priority")
public class Priority
{
    
    @XmlElement(name = "default")
    protected Boolean     _default;
    
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/", required = true)
    protected String      title;
    
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/", required = true)
    protected String      identifier;
    
    @XmlElement(required = true)
    protected ProjectArea projectArea;
    
    /**
     * Gets the value of the default property.
     * 
     * @return possible object is {@link Boolean }
     */
    public Boolean isDefault()
    {
        return _default;
    }
    
    /**
     * Sets the value of the default property.
     * 
     * @param value
     *            allowed object is {@link Boolean }
     */
    public void setDefault(Boolean value)
    {
        this._default = value;
    }
    
    /**
     * [READ-ONLY] Name of the priority literal
     * 
     * @return possible object is {@link String }
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Sets the value of the title property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setTitle(String value)
    {
        this.title = value;
    }
    
    /**
     * [READ-ONLY] Identifier of the priority literal
     * 
     * @return possible object is {@link String }
     */
    public String getIdentifier()
    {
        return identifier;
    }
    
    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setIdentifier(String value)
    {
        this.identifier = value;
    }
    
    /**
     * [READ-ONLY] The project area of the workflow state
     * 
     * @return possible object is {@link ProjectArea }
     */
    public ProjectArea getProjectArea()
    {
        return projectArea;
    }
    
    /**
     * Sets the value of the projectArea property.
     * 
     * @param value
     *            allowed object is {@link ProjectArea }
     */
    public void setProjectArea(ProjectArea value)
    {
        this.projectArea = value;
    }
    
}
