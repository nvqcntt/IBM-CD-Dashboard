//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.04.28 at 12:49:50 PM EDT
//

package com.ibm.rqm.xml.bind;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{http://jazz.net/xmlns/alm/v0.1/}updated"/>
 *         &lt;element ref="{http://jazz.net/xmlns/alm/v0.1/}state"/>
 *         &lt;element name="tags" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="testscript">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="href" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                 &lt;attribute ref="{http://schema.ibm.com/vega/2008/}id"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="remotescript" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="href" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                 &lt;attribute ref="{http://schema.ibm.com/vega/2008/}id"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="defaultscript" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="href" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                 &lt;attribute ref="{http://schema.ibm.com/vega/2008/}id"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"webId", "title", "updated", "state", "tags", "testscript", "remotescript", "defaultscript"})
@XmlRootElement(name = "keyword")
public class Keyword extends ReportableArtifact
{
    
    protected Integer                    webId;
    
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/", required = true)
    protected String                     title;
    
    @XmlElement(namespace = "http://jazz.net/xmlns/alm/v0.1/", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar       updated;
    
    @XmlElement(namespace = "http://jazz.net/xmlns/alm/v0.1/", required = true)
    protected State                      state;
    
    @XmlElement(required = true)
    protected String                     tags;
    
    @XmlElement(required = true)
    protected Keyword.Testscript         testscript;
    
    protected List<Keyword.Remotescript> remotescript;
    
    protected Keyword.Defaultscript      defaultscript;
    
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
     * A name given to the keyword.
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
     * [READ-ONLY] XML dateTime of the last update of the keyword.
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
     * [READ-ONLY] An ID or name of the current state of the keyword.
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
     * Gets the value of the tags property.
     * 
     * @return possible object is {@link String }
     */
    public String getTags()
    {
        return tags;
    }
    
    /**
     * Sets the value of the tags property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setTags(String value)
    {
        this.tags = value;
    }
    
    /**
     * Gets the value of the testscript property.
     * 
     * @return possible object is {@link Keyword.Testscript }
     */
    public Keyword.Testscript getTestscript()
    {
        return testscript;
    }
    
    /**
     * Sets the value of the testscript property.
     * 
     * @param value
     *            allowed object is {@link Keyword.Testscript }
     */
    public void setTestscript(Keyword.Testscript value)
    {
        this.testscript = value;
    }
    
    /**
     * Gets the value of the remotescript property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the remotescript property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getRemotescript().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Keyword.Remotescript }
     */
    public List<Keyword.Remotescript> getRemotescript()
    {
        if (remotescript == null)
        {
            remotescript = new ArrayList<Keyword.Remotescript>();
        }
        return this.remotescript;
    }
    
    /**
     * Gets the value of the defaultscript property.
     * 
     * @return possible object is {@link Keyword.Defaultscript }
     */
    public Keyword.Defaultscript getDefaultscript()
    {
        return defaultscript;
    }
    
    /**
     * Sets the value of the defaultscript property.
     * 
     * @param value
     *            allowed object is {@link Keyword.Defaultscript }
     */
    public void setDefaultscript(Keyword.Defaultscript value)
    {
        this.defaultscript = value;
    }
    
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
     *       &lt;attribute name="href" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *       &lt;attribute ref="{http://schema.ibm.com/vega/2008/}id"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Defaultscript
    {
        
        @XmlAttribute(required = true)
        @XmlSchemaType(name = "anyURI")
        protected String href;
        
        @XmlAttribute(namespace = "http://schema.ibm.com/vega/2008/")
        protected String id;
        
        /**
         * Gets the value of the href property.
         * 
         * @return possible object is {@link String }
         */
        public String getHref()
        {
            return href;
        }
        
        /**
         * Sets the value of the href property.
         * 
         * @param value
         *            allowed object is {@link String }
         */
        public void setHref(String value)
        {
            this.href = value;
        }
        
        /**
         * [READ-ONLY] The UUID of the default script.
         * 
         * @return possible object is {@link String }
         */
        public String getId()
        {
            return id;
        }
        
        /**
         * Sets the value of the id property.
         * 
         * @param value
         *            allowed object is {@link String }
         */
        public void setId(String value)
        {
            this.id = value;
        }
        
    }
    
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
     *       &lt;attribute name="href" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *       &lt;attribute ref="{http://schema.ibm.com/vega/2008/}id"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Remotescript
    {
        
        @XmlAttribute(required = true)
        @XmlSchemaType(name = "anyURI")
        protected String href;
        
        @XmlAttribute(namespace = "http://schema.ibm.com/vega/2008/")
        protected String id;
        
        /**
         * Gets the value of the href property.
         * 
         * @return possible object is {@link String }
         */
        public String getHref()
        {
            return href;
        }
        
        /**
         * Sets the value of the href property.
         * 
         * @param value
         *            allowed object is {@link String }
         */
        public void setHref(String value)
        {
            this.href = value;
        }
        
        /**
         * [READ-ONLY] The UUID of the remote test script.
         * 
         * @return possible object is {@link String }
         */
        public String getId()
        {
            return id;
        }
        
        /**
         * Sets the value of the id property.
         * 
         * @param value
         *            allowed object is {@link String }
         */
        public void setId(String value)
        {
            this.id = value;
        }
        
    }
    
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
     *       &lt;attribute name="href" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *       &lt;attribute ref="{http://schema.ibm.com/vega/2008/}id"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Testscript
    {
        
        @XmlAttribute(required = true)
        @XmlSchemaType(name = "anyURI")
        protected String href;
        
        @XmlAttribute(namespace = "http://schema.ibm.com/vega/2008/")
        protected String id;
        
        /**
         * Gets the value of the href property.
         * 
         * @return possible object is {@link String }
         */
        public String getHref()
        {
            return href;
        }
        
        /**
         * Sets the value of the href property.
         * 
         * @param value
         *            allowed object is {@link String }
         */
        public void setHref(String value)
        {
            this.href = value;
        }
        
        /**
         * [READ-ONLY] The UUID of the test script.
         * 
         * @return possible object is {@link String }
         */
        public String getId()
        {
            return id;
        }
        
        /**
         * Sets the value of the id property.
         * 
         * @param value
         *            allowed object is {@link String }
         */
        public void setId(String value)
        {
            this.id = value;
        }
        
    }
    
}
