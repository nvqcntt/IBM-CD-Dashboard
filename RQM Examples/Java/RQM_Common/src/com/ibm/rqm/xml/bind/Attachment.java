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
 *         &lt;element name="webId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element ref="{http://purl.org/dc/elements/1.1/}title"/>
 *         &lt;element ref="{http://purl.org/dc/elements/1.1/}description"/>
 *         &lt;element ref="{http://jazz.net/xmlns/alm/qm/v0.1/}creationDate"/>
 *         &lt;element ref="{http://purl.org/dc/elements/1.1/}creator"/>
 *         &lt;element name="fileSize" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element ref="{http://jazz.net/xmlns/alm/v0.1/}updated"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"webId", "title", "description", "creationDate", "creator", "fileSize", "updated"})
@XmlRootElement(name = "attachment")
public class Attachment extends ReportableArtifact
{
    
    protected Integer              webId;
    
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/", required = true)
    protected String               title;
    
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/", required = true)
    protected String               description;
    
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/", required = true)
    protected Creator              creator;
    
    protected Float                fileSize;
    
    @XmlElement(namespace = "http://jazz.net/xmlns/alm/v0.1/", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updated;
    
    /**
     * Gets the value of the webId property.
     * 
     * @return possible object is {@link Integer }
     */
    public Integer getWebId()
    {
        return webId;
    }
    
    /**
     * Sets the value of the webId property.
     * 
     * @param value
     *            allowed object is {@link Integer }
     */
    public void setWebId(Integer value)
    {
        this.webId = value;
    }
    
    /**
     * [READ-ONLY] File name.
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
     * [READ-ONLY] An account of the test case.
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
     * Gets the value of the creationDate property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getCreationDate()
    {
        return creationDate;
    }
    
    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *            allowed object is {@link XMLGregorianCalendar }
     */
    public void setCreationDate(XMLGregorianCalendar value)
    {
        this.creationDate = value;
    }
    
    /**
     * [READ-ONLY] The contributor that created the test case.
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
     * Gets the value of the fileSize property.
     * 
     * @return possible object is {@link Float }
     */
    public Float getFileSize()
    {
        return fileSize;
    }
    
    /**
     * Sets the value of the fileSize property.
     * 
     * @param value
     *            allowed object is {@link Float }
     */
    public void setFileSize(Float value)
    {
        this.fileSize = value;
    }
    
    /**
     * [READ-ONLY] The last modification date of a resource. Format is XML dateTime.
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
    
}
