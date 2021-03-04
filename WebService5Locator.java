/**
 * WebService5Locator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class WebService5Locator extends org.apache.axis.client.Service implements org.tempuri.WebService5 {

    public WebService5Locator() {
    }


    public WebService5Locator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WebService5Locator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WebService5Soap
    private java.lang.String WebService5Soap_address = "http://localhost/Uppgift5Service/WebService5.asmx";

    public java.lang.String getWebService5SoapAddress() {
        return WebService5Soap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WebService5SoapWSDDServiceName = "WebService5Soap";

    public java.lang.String getWebService5SoapWSDDServiceName() {
        return WebService5SoapWSDDServiceName;
    }

    public void setWebService5SoapWSDDServiceName(java.lang.String name) {
        WebService5SoapWSDDServiceName = name;
    }

    public org.tempuri.WebService5Soap getWebService5Soap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WebService5Soap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWebService5Soap(endpoint);
    }

    public org.tempuri.WebService5Soap getWebService5Soap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.WebService5SoapStub _stub = new org.tempuri.WebService5SoapStub(portAddress, this);
            _stub.setPortName(getWebService5SoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWebService5SoapEndpointAddress(java.lang.String address) {
        WebService5Soap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.WebService5Soap.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.WebService5SoapStub _stub = new org.tempuri.WebService5SoapStub(new java.net.URL(WebService5Soap_address), this);
                _stub.setPortName(getWebService5SoapWSDDServiceName());
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
        if ("WebService5Soap".equals(inputPortName)) {
            return getWebService5Soap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "WebService5");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "WebService5Soap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WebService5Soap".equals(portName)) {
            setWebService5SoapEndpointAddress(address);
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
