package org.tempuri;

public class WebService5SoapProxy implements org.tempuri.WebService5Soap {
  private String _endpoint = null;
  private org.tempuri.WebService5Soap webService5Soap = null;
  
  public WebService5SoapProxy() {
    _initWebService5SoapProxy();
  }
  
  public WebService5SoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWebService5SoapProxy();
  }
  
  private void _initWebService5SoapProxy() {
    try {
      webService5Soap = (new org.tempuri.WebService5Locator()).getWebService5Soap();
      if (webService5Soap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)webService5Soap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)webService5Soap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (webService5Soap != null)
      ((javax.xml.rpc.Stub)webService5Soap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.WebService5Soap getWebService5Soap() {
    if (webService5Soap == null)
      _initWebService5SoapProxy();
    return webService5Soap;
  }
  
  public org.tempuri.CRONUS_Sverige_AB_Employee[] read() throws java.rmi.RemoteException{
    if (webService5Soap == null)
      _initWebService5SoapProxy();
    return webService5Soap.read();
  }
  
  public org.tempuri.CRONUS_Sverige_AB_Employee find(java.lang.String no) throws java.rmi.RemoteException{
    if (webService5Soap == null)
      _initWebService5SoapProxy();
    return webService5Soap.find(no);
  }
  
  public org.tempuri.CRONUS_Sverige_AB_Employee update(java.lang.String no_, java.lang.String firstname, java.lang.String lastname, java.lang.String jobtitle, java.lang.String address, java.lang.String email) throws java.rmi.RemoteException{
    if (webService5Soap == null)
      _initWebService5SoapProxy();
    return webService5Soap.update(no_, firstname, lastname, jobtitle, address, email);
  }
  
  public org.tempuri.CRONUS_Sverige_AB_Employee delete(java.lang.String no) throws java.rmi.RemoteException{
    if (webService5Soap == null)
      _initWebService5SoapProxy();
    return webService5Soap.delete(no);
  }
  
  public org.tempuri.CRONUS_Sverige_AB_Employee add(java.lang.String firstname, java.lang.String lastname, java.lang.String jobtitle, java.lang.String address, java.lang.String email) throws java.rmi.RemoteException{
    if (webService5Soap == null)
      _initWebService5SoapProxy();
    return webService5Soap.add(firstname, lastname, jobtitle, address, email);
  }
  
  
}