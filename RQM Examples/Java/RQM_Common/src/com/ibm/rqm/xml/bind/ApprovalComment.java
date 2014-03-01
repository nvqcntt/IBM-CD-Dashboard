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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://purl.org/dc/elements/1.1/}creator"/>
 *         &lt;element name="commentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="comment" type="{http://jazz.net/xmlns/alm/qm/v0.1/}richtext"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"creator", "commentDate", "comment"})
@XmlRootElement(name = "approvalComment")
public class ApprovalComment
{
    
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/", required = true)
    protected Creator              creator;
    
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar commentDate;
    
    @XmlElement(required = true)
    protected Richtext             comment;
    
    /**
     * The contributor that wrote a comment.
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
     * Gets the value of the commentDate property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getCommentDate()
    {
        return commentDate;
    }
    
    /**
     * Sets the value of the commentDate property.
     * 
     * @param value
     *            allowed object is {@link XMLGregorianCalendar }
     */
    public void setCommentDate(XMLGregorianCalendar value)
    {
        this.commentDate = value;
    }
    
    /**
     * Gets the value of the comment property.
     * 
     * @return possible object is {@link Richtext }
     */
    public Richtext getComment()
    {
        return comment;
    }
    
    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *            allowed object is {@link Richtext }
     */
    public void setComment(Richtext value)
    {
        this.comment = value;
    }
    
}
