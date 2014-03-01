//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.04.28 at 12:49:50 PM EDT
//

package com.ibm.rqm.xml.bind.adapter;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the com.ibm.rqm.xml.bind.adapter package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation for XML content. The Java representation of XML content can consist of schema derived interfaces and classes representing the binding of schema type definitions, element declarations and model groups. Factory methods for each of these are provided in this class.
 */
@XmlRegistry
public class ObjectFactory
{
    
    private final static QName _Ipaddress_QNAME       = new QName("http://jazz.net/xmlns/alm/qm/qmadapter/v0.1", "ipaddress");
    
    private final static QName _Type_QNAME            = new QName("http://jazz.net/xmlns/alm/qm/qmadapter/v0.1", "type");
    
    private final static QName _Capability_QNAME      = new QName("http://jazz.net/xmlns/alm/qm/qmadapter/v0.1", "capability");
    
    private final static QName _Fqdn_QNAME            = new QName("http://jazz.net/xmlns/alm/qm/qmadapter/v0.1", "fqdn");
    
    private final static QName _Hostname_QNAME        = new QName("http://jazz.net/xmlns/alm/qm/qmadapter/v0.1", "hostname");
    
    private final static QName _Lastheartbeat_QNAME   = new QName("http://jazz.net/xmlns/alm/qm/qmadapter/v0.1", "lastheartbeat");
    
    private final static QName _Workavailable_QNAME   = new QName("http://jazz.net/xmlns/alm/qm/qmadapter/v0.1", "workavailable");
    
    private final static QName _Macaddress_QNAME      = new QName("http://jazz.net/xmlns/alm/qm/qmadapter/v0.1", "macaddress");
    
    private final static QName _Pollinginterval_QNAME = new QName("http://jazz.net/xmlns/alm/qm/qmadapter/v0.1", "pollinginterval");
    
    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ibm.rqm.xml.bind.adapter
     */
    public ObjectFactory()
    {
    }
    
    /**
     * Create an instance of {@link Instruction }
     */
    public Instruction createInstruction()
    {
        return new Instruction();
    }
    
    /**
     * Create an instance of {@link Tasks }
     */
    public Tasks createTasks()
    {
        return new Tasks();
    }
    
    /**
     * Create an instance of {@link Task }
     */
    public Task createTask()
    {
        return new Task();
    }
    
    /**
     * Create an instance of {@link Instructions }
     */
    public Instructions createInstructions()
    {
        return new Instructions();
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://jazz.net/xmlns/alm/qm/qmadapter/v0.1", name = "ipaddress")
    public JAXBElement<String> createIpaddress(String value)
    {
        return new JAXBElement<String>(_Ipaddress_QNAME, String.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://jazz.net/xmlns/alm/qm/qmadapter/v0.1", name = "type")
    public JAXBElement<String> createType(String value)
    {
        return new JAXBElement<String>(_Type_QNAME, String.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://jazz.net/xmlns/alm/qm/qmadapter/v0.1", name = "capability")
    public JAXBElement<String> createCapability(String value)
    {
        return new JAXBElement<String>(_Capability_QNAME, String.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://jazz.net/xmlns/alm/qm/qmadapter/v0.1", name = "fqdn")
    public JAXBElement<String> createFqdn(String value)
    {
        return new JAXBElement<String>(_Fqdn_QNAME, String.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://jazz.net/xmlns/alm/qm/qmadapter/v0.1", name = "hostname")
    public JAXBElement<String> createHostname(String value)
    {
        return new JAXBElement<String>(_Hostname_QNAME, String.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://jazz.net/xmlns/alm/qm/qmadapter/v0.1", name = "lastheartbeat")
    public JAXBElement<Long> createLastheartbeat(Long value)
    {
        return new JAXBElement<Long>(_Lastheartbeat_QNAME, Long.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://jazz.net/xmlns/alm/qm/qmadapter/v0.1", name = "workavailable")
    public JAXBElement<Boolean> createWorkavailable(Boolean value)
    {
        return new JAXBElement<Boolean>(_Workavailable_QNAME, Boolean.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://jazz.net/xmlns/alm/qm/qmadapter/v0.1", name = "macaddress")
    public JAXBElement<String> createMacaddress(String value)
    {
        return new JAXBElement<String>(_Macaddress_QNAME, String.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://jazz.net/xmlns/alm/qm/qmadapter/v0.1", name = "pollinginterval")
    public JAXBElement<Integer> createPollinginterval(Integer value)
    {
        return new JAXBElement<Integer>(_Pollinginterval_QNAME, Integer.class, null, value);
    }
    
}
