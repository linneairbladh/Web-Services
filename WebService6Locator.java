/**
 * WebService6Locator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class WebService6Locator extends org.apache.axis.client.Service implements org.tempuri.WebService6 {

    public WebService6Locator() {
    }


    public WebService6Locator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WebService6Locator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WebService6Soap
    private java.lang.String WebService6Soap_address = "http://localhost/WebService%206/WebService6.asmx";

    public java.lang.String getWebService6SoapAddress() {
        return WebService6Soap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WebService6SoapWSDDServiceName = "WebService6Soap";

    public java.lang.String getWebService6SoapWSDDServiceName() {
        return WebService6SoapWSDDServiceName;
    }

    public void setWebService6SoapWSDDServiceName(java.lang.String name) {
        WebService6SoapWSDDServiceName = name;
    }

    public org.tempuri.WebService6Soap getWebService6Soap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WebService6Soap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWebService6Soap(endpoint);
    }

    public org.tempuri.WebService6Soap getWebService6Soap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.WebService6SoapStub _stub = new org.tempuri.WebService6SoapStub(portAddress, this);
            _stub.setPortName(getWebService6SoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWebService6SoapEndpointAddress(java.lang.String address) {
        WebService6Soap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.WebService6Soap.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.WebService6SoapStub _stub = new org.tempuri.WebService6SoapStub(new java.net.URL(WebService6Soap_address), this);
                _stub.setPortName(getWebService6SoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WebService6Soap".equals(inputPortName)) {
            return getWebService6Soap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "WebService6");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "WebService6Soap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WebService6Soap".equals(portName)) {
            setWebService6SoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
