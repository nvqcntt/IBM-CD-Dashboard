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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.ibm.rqm.xml.bind.adapter.Instructions;
import com.ibm.rqm.xml.bind.adapter.Tasks;

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
 *         &lt;element ref="{http://purl.org/dc/elements/1.1/}creator"/>
 *         &lt;element ref="{http://jazz.net/xmlns/alm/qm/qmadapter/v0.1}type"/>
 *         &lt;element ref="{http://jazz.net/xmlns/alm/qm/qmadapter/v0.1}pollinginterval" minOccurs="0"/>
 *         &lt;element ref="{http://jazz.net/xmlns/alm/qm/qmadapter/v0.1}lastheartbeat" minOccurs="0"/>
 *         &lt;element ref="{http://jazz.net/xmlns/alm/qm/qmadapter/v0.1}hostname"/>
 *         &lt;element ref="{http://jazz.net/xmlns/alm/qm/qmadapter/v0.1}ipaddress"/>
 *         &lt;element ref="{http://jazz.net/xmlns/alm/qm/qmadapter/v0.1}macaddress"/>
 *         &lt;element ref="{http://jazz.net/xmlns/alm/qm/qmadapter/v0.1}fqdn"/>
 *         &lt;element ref="{http://jazz.net/xmlns/alm/qm/qmadapter/v0.1}capability" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://jazz.net/xmlns/alm/qm/qmadapter/v0.1}instructions" minOccurs="0"/>
 *         &lt;element ref="{http://jazz.net/xmlns/alm/qm/qmadapter/v0.1}tasks" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"webId", "title", "description", "creator", "type", "pollinginterval", "lastheartbeat", "hostname", "ipaddress", "macaddress", "fqdn", "capability", "instructions", "tasks"})
@XmlRootElement(name = "tooladapter")
public class Tooladapter extends ReportableArtifact
{
    
    protected Integer      webId;
    
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/", required = true)
    protected String       title;
    
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/", required = true)
    protected String       description;
    
    @XmlElement(namespace = "http://purl.org/dc/elements/1.1/", required = true)
    protected Creator      creator;
    
    @XmlElement(namespace = "http://jazz.net/xmlns/alm/qm/qmadapter/v0.1", required = true)
    protected String       type;
    
    @XmlElement(namespace = "http://jazz.net/xmlns/alm/qm/qmadapter/v0.1")
    protected Integer      pollinginterval;
    
    @XmlElement(namespace = "http://jazz.net/xmlns/alm/qm/qmadapter/v0.1")
    protected Long         lastheartbeat;
    
    @XmlElement(namespace = "http://jazz.net/xmlns/alm/qm/qmadapter/v0.1", required = true)
    protected String       hostname;
    
    @XmlElement(namespace = "http://jazz.net/xmlns/alm/qm/qmadapter/v0.1", required = true)
    protected String       ipaddress;
    
    @XmlElement(namespace = "http://jazz.net/xmlns/alm/qm/qmadapter/v0.1", required = true)
    protected String       macaddress;
    
    @XmlElement(namespace = "http://jazz.net/xmlns/alm/qm/qmadapter/v0.1", required = true)
    protected String       fqdn;
    
    @XmlElement(namespace = "http://jazz.net/xmlns/alm/qm/qmadapter/v0.1")
    protected List<String> capability;
    
    @XmlElement(namespace = "http://jazz.net/xmlns/alm/qm/qmadapter/v0.1")
    protected Instructions instructions;
    
    @XmlElement(namespace = "http://jazz.net/xmlns/alm/qm/qmadapter/v0.1")
    protected Tasks        tasks;
    
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
     * A name given to the tooladapter.
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
     * An account of the tooladapter.
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
     * [READ-ONLY] The contributor that created the tool adapter.
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
     * The type of this adapter that binds it to a specific test execution tool.
     * 
     * @return possible object is {@link String }
     */
    public String getType()
    {
        return type;
    }
    
    /**
     * Sets the value of the type property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setType(String value)
    {
        this.type = value;
    }
    
    /**
     * The number of seconds stating how frequently the adapter will poll the test management server for instructions.
     * 
     * @return possible object is {@link Integer }
     */
    public Integer getPollinginterval()
    {
        return pollinginterval;
    }
    
    /**
     * Sets the value of the pollinginterval property.
     * 
     * @param value
     *            allowed object is {@link Integer }
     */
    public void setPollinginterval(Integer value)
    {
        this.pollinginterval = value;
    }
    
    /**
     * [READ-ONLY] Time in milliseconds since the last interaction with the adapter.
     * 
     * @return possible object is {@link Long }
     */
    public Long getLastheartbeat()
    {
        return lastheartbeat;
    }
    
    /**
     * Sets the value of the lastheartbeat property.
     * 
     * @param value
     *            allowed object is {@link Long }
     */
    public void setLastheartbeat(Long value)
    {
        this.lastheartbeat = value;
    }
    
    /**
     * The hostname of the machine that the adapter is currently running on.
     * 
     * @return possible object is {@link String }
     */
    public String getHostname()
    {
        return hostname;
    }
    
    /**
     * Sets the value of the hostname property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setHostname(String value)
    {
        this.hostname = value;
    }
    
    /**
     * The IP Address of the machine that the adapter is running on.
     * 
     * @return possible object is {@link String }
     */
    public String getIpaddress()
    {
        return ipaddress;
    }
    
    /**
     * Sets the value of the ipaddress property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setIpaddress(String value)
    {
        this.ipaddress = value;
    }
    
    /**
     * The physical address of the machine that the adapter is running on.
     * 
     * @return possible object is {@link String }
     */
    public String getMacaddress()
    {
        return macaddress;
    }
    
    /**
     * Sets the value of the macaddress property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setMacaddress(String value)
    {
        this.macaddress = value;
    }
    
    /**
     * Fully Qualified Domaion Name of the machine that theadapter is running on.
     * 
     * @return possible object is {@link String }
     */
    public String getFqdn()
    {
        return fqdn;
    }
    
    /**
     * Sets the value of the fqdn property.
     * 
     * @param value
     *            allowed object is {@link String }
     */
    public void setFqdn(String value)
    {
        this.fqdn = value;
    }
    
    /**
     * Capabilty of the adapter - permissible values are EXECUTE, IMPORT, RECORD Gets the value of the capability property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the capability property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getCapability().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link String }
     */
    public List<String> getCapability()
    {
        if (capability == null)
        {
            capability = new ArrayList<String>();
        }
        return this.capability;
    }
    
    /**
     * [READ-ONLY] URL that the adapter can invoke to retrieve instructions for that adapter to handle.
     * 
     * @return possible object is {@link Instructions }
     */
    public Instructions getInstructions()
    {
        return instructions;
    }
    
    /**
     * Sets the value of the instructions property.
     * 
     * @param value
     *            allowed object is {@link Instructions }
     */
    public void setInstructions(Instructions value)
    {
        this.instructions = value;
    }
    
    /**
     * [READ-ONLY] URL that the adapter can invoke to retrieve tasks for that adapter to handle.
     * 
     * @return possible object is {@link Tasks }
     */
    public Tasks getTasks()
    {
        return tasks;
    }
    
    /**
     * Sets the value of the tasks property.
     * 
     * @param value
     *            allowed object is {@link Tasks }
     */
    public void setTasks(Tasks value)
    {
        this.tasks = value;
    }
    
}
