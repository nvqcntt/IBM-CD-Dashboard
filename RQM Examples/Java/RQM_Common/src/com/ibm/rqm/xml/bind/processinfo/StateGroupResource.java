//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.04.28 at 12:49:50 PM EDT
//

package com.ibm.rqm.xml.bind.processinfo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * [READ-ONLY] Group definition of workflow states. States are members of state groups.
 * <p>
 * Java class for StateGroup element declaration.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="StateGroup">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;choice maxOccurs="4">
 *           &lt;element ref="{http://purl.org/dc/elements/1.1/}identifier"/>
 *           &lt;element ref="{http://purl.org/dc/elements/1.1/}title"/>
 *           &lt;element ref="{http://jazz.net/xmlns/prod/jazz/rqm/process/1.0/}category"/>
 *           &lt;element ref="{http://jazz.net/xmlns/prod/jazz/rqm/process/1.0/}projectArea"/>
 *         &lt;/choice>
 *         &lt;attribute ref="{http://www.w3.org/1999/02/22-rdf-syntax-ns#}about use="required""/>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"identifierOrTitleOrCategory"})
@XmlRootElement(name = "StateGroup")
public class StateGroupResource
{
    
    @XmlElementRefs({@XmlElementRef(name = "category", namespace = "http://jazz.net/xmlns/prod/jazz/rqm/process/1.0/", type = Category.class), @XmlElementRef(name = "projectArea", namespace = "http://jazz.net/xmlns/prod/jazz/rqm/process/1.0/", type = ProjectArea.class), @XmlElementRef(name = "identifier", namespace = "http://purl.org/dc/elements/1.1/", type = JAXBElement.class), @XmlElementRef(name = "title", namespace = "http://purl.org/dc/elements/1.1/", type = JAXBElement.class)})
    protected List<Object> identifierOrTitleOrCategory;
    
    @XmlAttribute(namespace = "http://www.w3.org/1999/02/22-rdf-syntax-ns#", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String       about;
    
    /**
     * Gets the value of the identifierOrTitleOrCategory property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the identifierOrTitleOrCategory property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getIdentifierOrTitleOrCategory().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link JAXBElement }{@code <}{@link String }{@code >} {@link Category } {@link ProjectArea } {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public List<Object> getIdentifierOrTitleOrCategory()
    {
        if (identifierOrTitleOrCategory == null)
        {
            identifierOrTitleOrCategory = new ArrayList<Object>();
        }
        return this.identifierOrTitleOrCategory;
    }
    
    /**
     * Gets the value of the about property.
     * 
     * @return possible object is {@link String }
     */
    public String getAbout()
    {
        return about;
    }
    
    /**
     * Sets the value of the about property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setAbout(String value)
    {
        this.about = value;
    }
    
}
