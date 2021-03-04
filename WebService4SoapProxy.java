package org.tempuri;

public class WebService4SoapProxy implements org.tempuri.WebService4Soap {
  private String _endpoint = null;
  private org.tempuri.WebService4Soap webService4Soap = null;
  
  public WebService4SoapProxy() {
    _initWebService4SoapProxy();
  }
  
  public WebService4SoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWebService4SoapProxy();
  }
  
  private void _initWebService4SoapProxy() {
    try {
      webService4Soap = (new org.tempuri.WebService4Locator()).getWebService4Soap();
      if (webService4Soap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)webService4Soap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)webService4Soap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (webService4Soap != null)
      ((javax.xml.rpc.Stub)webService4Soap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.WebService4Soap getWebService4Soap() {
    if (webService4Soap == null)
      _initWebService4SoapProxy();
    return webService4Soap;
  }
  
  public org.tempuri.User[] readUsers() throws java.rmi.RemoteException{
    if (webService4Soap == null)
      _initWebService4SoapProxy();
    return webService4Soap.readUsers();
  }
  
  public org.tempuri.Workout[] readWorkout() throws java.rmi.RemoteException{
    if (webService4Soap == null)
      _initWebService4SoapProxy();
    return webService4Soap.readWorkout();
  }
  
  
}