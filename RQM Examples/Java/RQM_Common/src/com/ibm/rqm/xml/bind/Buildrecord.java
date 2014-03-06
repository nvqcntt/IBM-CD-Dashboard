//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.04.28 at 12:49:50 PM EDT
//

package com.ibm.rqm.xml.bind;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for anonymous complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://jazz.net/xmlns/alm/qm/v0.1/}reportableArtifact">
 *       &lt;sequence>
 *         &lt;element ref="{http://purl.org/dc/elements/1.1/}title"/>
 *         &lt;element ref="{http://purl.org/dc/elements/1.1/}description"/>
 *         &lt;element ref="{http://jazz.net/xmlns/alm/v0.1/}updated"/>
 *         &lt;element ref="{http://jazz.net/xmlns/alm/v0.1/}state"/>
 *         &lt;element ref="{http://purl.org/dc/elements/1.1/}creator"/>
 *         &lt;element ref="{http://jazz.net/xmlns/alm/v0.1/}owner"/>
 *         &lt;element name="starttime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="endtime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"title", "description", "updated", "state", "creator", "owner", "starttime", "endtime", "status", "providerTypeId"})
@XmlRootElement(name = "buildrecord")
public class Buildrecord extends ReportableArtifact
{
    
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/", required = true)
    protected String               title;
    
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/", required = true)
    protected String               description;
    
    @XmlElement(namespace = "http://jazz.net/xmlns/alm/v0.1/", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updated;
    
    @XmlElement(namespace = "http://jazz.net/xmlns/alm/v0.1/", required = true)
    protected State                state;
    
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/", required = true)
    protected Creator              creator;
    
    @XmlElement(namespace = "http://jazz.net/xmlns/alm/v0.1/", required = true)
    protected Owner                owner;
    
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar starttime;
    
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endtime;
    
    protected String               status;
    
    protected String               providerTypeId;
    
    /**
     * A name given to the build record.
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
     * An account of the build record.
     * 
     * @return possible object is {@link String }
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * Sets the value of the description property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setDescription(String value)
    {
        this.description = value;
    }
    
    /**
     * [READ-ONLY] XML dateTime of the last update of the build record.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getUpdated()
    {
        return updated;
    }
    
    /**
     * Sets the value of the updated property.
     * 
     * @param value
     *            allowed object is {@link XMLGregorianCalendar }
     */
    public void setUpdated(XMLGregorianCalendar value)
    {
        this.updated = value;
    }
    
    /**
     * An ID or name of the current state of the build record. Valid states for RTC build integration include:
     * <ul>
     * <li>com.ibm.rqm.buildintegration.buildstate.complete</li>
     * <li>com.ibm.rqm.buildintegration.buildstate.running</li>
     * <li>com.ibm.rqm.buildintegration.buildstate.queued</li>
     * <li>com.ibm.rqm.buildintegration.buildstate.cancelled</li>
     * </ul>
     * 
     * @return possible object is {@link State }
     */
    public State getState()
    {
        return state;
    }
    
    /**
     * Sets the value of the state property.
     * 
     * @param value
     *            allowed object is {@link State }
     */
    public void setState(State value)
    {
        this.state = value;
    }
    
    /**
     * [READ-ONLY] The contributor that created the build record.
     * 
     * @return possible object is {@link Creator }
     */
    public Creator getCreator()
    {
        return creator;
    }
    
    /**
     * Sets the value of the creator property.
     * 
     * @param value
     *            allowed object is {@link Creator }
     */
    public void setCreator(Creator value)
    {
        this.creator = value;
    }
    
    /**
     * [READ-ONLY] The contributor that owns the build record.
     * 
     * @return possible object is {@link Owner }
     */
    public Owner getOwner()
    {
        return owner;
    }
    
    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *            allowed object is {@link Owner }
     */
    public void setOwner(Owner value)
    {
        this.owner = value;
    }
    
    /**
     * Gets the value of the starttime property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getStarttime()
    {
        return starttime;
    }
    
    /**
     * Sets the value of the starttime property.
     * 
     * @param value
     *            allowed object is {@link XMLGregorianCalendar }
     */
    public void setStarttime(XMLGregorianCalendar value)
    {
        this.starttime = value;
    }
    
    /**
     * Gets the value of the endtime property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getEndtime()
    {
        return endtime;
    }
    
    /**
     * Sets the value of the endtime property.
     * 
     * @param value
     *            allowed object is {@link XMLGregorianCalendar }
     */
    public void setEndtime(XMLGregorianCalendar value)
    {
        this.endtime = value;
    }
    
    /**
     * Gets the value of the status property.
     * 
     * @return possible object is {@link String }
     */
    public String getStatus()
    {
        return status;
    }
    
    /**
     * Sets the value of the status property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setStatus(String value)
    {
        this.status = value;
    }
    
    /**
     * Gets the value of the providerTypeId property.
     * 
     * @return possible object is {@link String }
     */
    public String getProviderTypeId()
    {
        return providerTypeId;
    }
    
    /**
     * Sets the value of the providerTypeId property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setProviderTypeId(String value)
    {
        this.providerTypeId = value;
    }
    
}