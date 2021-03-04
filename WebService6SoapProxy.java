package org.tempuri;

public class WebService6SoapProxy implements org.tempuri.WebService6Soap {
  private String _endpoint = null;
  private org.tempuri.WebService6Soap webService6Soap = null;
  
  public WebService6SoapProxy() {
    _initWebService6SoapProxy();
  }
  
  public WebService6SoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWebService6SoapProxy();
  }
  
  private void _initWebService6SoapProxy() {
    try {
      webService6Soap = (new org.tempuri.WebService6Locator()).getWebService6Soap();
      if (webService6Soap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)webService6Soap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)webService6Soap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (webService6Soap != null)
      ((javax.xml.rpc.Stub)webService6Soap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.WebService6Soap getWebService6Soap() {
    if (webService6Soap == null)
      _initWebService6SoapProxy();
    return webService6Soap;
  }
  
  public org.tempuri.GetAllEmployeesResponseGetAllEmployeesResult getAllEmployees() throws java.rmi.RemoteException{
    if (webService6Soap == null)
      _initWebService6SoapProxy();
    return webService6Soap.getAllEmployees();
  }
  
  public org.tempuri.GetAllEmployeesRelativesResponseGetAllEmployeesRelativesResult getAllEmployeesRelatives() throws java.rmi.RemoteException{
    if (webService6Soap == null)
      _initWebService6SoapProxy();
    return webService6Soap.getAllEmployeesRelatives();
  }
  
  public org.tempuri.GetAllSickEmployees2004ResponseGetAllSickEmployees2004Result getAllSickEmployees2004() throws java.rmi.RemoteException{
    if (webService6Soap == null)
      _initWebService6SoapProxy();
    return webService6Soap.getAllSickEmployees2004();
  }
  
  public org.tempuri.GetMostAbsentEmployeeResponseGetMostAbsentEmployeeResult getMostAbsentEmployee() throws java.rmi.RemoteException{
    if (webService6Soap == null)
      _initWebService6SoapProxy();
    return webService6Soap.getMostAbsentEmployee();
  }
  
  public org.tempuri.GetAllKeysResponseGetAllKeysResult getAllKeys() throws java.rmi.RemoteException{
    if (webService6Soap == null)
      _initWebService6SoapProxy();
    return webService6Soap.getAllKeys();
  }
  
  public org.tempuri.GetAllIndexResponseGetAllIndexResult getAllIndex() throws java.rmi.RemoteException{
    if (webService6Soap == null)
      _initWebService6SoapProxy();
    return webService6Soap.getAllIndex();
  }
  
  public org.tempuri.GetAllTableConstraintsResponseGetAllTableConstraintsResult getAllTableConstraints() throws java.rmi.RemoteException{
    if (webService6Soap == null)
      _initWebService6SoapProxy();
    return webService6Soap.getAllTableConstraints();
  }
  
  public org.tempuri.GetAllTables1ResponseGetAllTables1Result getAllTables1() throws java.rmi.RemoteException{
    if (webService6Soap == null)
      _initWebService6SoapProxy();
    return webService6Soap.getAllTables1();
  }
  
  public org.tempuri.GetAllTables2ResponseGetAllTables2Result getAllTables2() throws java.rmi.RemoteException{
    if (webService6Soap == null)
      _initWebService6SoapProxy();
    return webService6Soap.getAllTables2();
  }
  
  public org.tempuri.GetAllColumnsEmployees1ResponseGetAllColumnsEmployees1Result getAllColumnsEmployees1() throws java.rmi.RemoteException{
    if (webService6Soap == null)
      _initWebService6SoapProxy();
    return webService6Soap.getAllColumnsEmployees1();
  }
  
  public org.tempuri.GetAllColumnsEmployees2ResponseGetAllColumnsEmployees2Result getAllColumnsEmployees2() throws java.rmi.RemoteException{
    if (webService6Soap == null)
      _initWebService6SoapProxy();
    return webService6Soap.getAllColumnsEmployees2();
  }
  
  public java.lang.String[] convertToString(org.tempuri.ConvertToStringDataTable dataTable) throws java.rmi.RemoteException{
    if (webService6Soap == null)
      _initWebService6SoapProxy();
    return webService6Soap.convertToString(dataTable);
  }
  
  public java.lang.String[] getAllEmployeesJava() throws java.rmi.RemoteException{
    if (webService6Soap == null)
      _initWebService6SoapProxy();
    return webService6Soap.getAllEmployeesJava();
  }
  
  public java.lang.String[] getAllEmployeesRelativesJava() throws java.rmi.RemoteException{
    if (webService6Soap == null)
      _initWebService6SoapProxy();
    return webService6Soap.getAllEmployeesRelativesJava();
  }
  
  public java.lang.String[] getAllSickEmployees2004Java() throws java.rmi.RemoteException{
    if (webService6Soap == null)
      _initWebService6SoapProxy();
    return webService6Soap.getAllSickEmployees2004Java();
  }
  
  public java.lang.String[] getMostAbsentEmployeeJava() throws java.rmi.RemoteException{
    if (webService6Soap == null)
      _initWebService6SoapProxy();
    return webService6Soap.getMostAbsentEmployeeJava();
  }
  
  public java.lang.String[] getAllKeysJava() throws java.rmi.RemoteException{
    if (webService6Soap == null)
      _initWebService6SoapProxy();
    return webService6Soap.getAllKeysJava();
  }
  
  public java.lang.String[] getAllIndexJava() throws java.rmi.RemoteException{
    if (webService6Soap == null)
      _initWebService6SoapProxy();
    return webService6Soap.getAllIndexJava();
  }
  
  public java.lang.String[] getAllTableConstraintsJava() throws java.rmi.RemoteException{
    if (webService6Soap == null)
      _initWebService6SoapProxy();
    return webService6Soap.getAllTableConstraintsJava();
  }
  
  public java.lang.String[] getAllTables1Java() throws java.rmi.RemoteException{
    if (webService6Soap == null)
      _initWebService6SoapProxy();
    return webService6Soap.getAllTables1Java();
  }
  
  public java.lang.String[] getAllTables2Java() throws java.rmi.RemoteException{
    if (webService6Soap == null)
      _initWebService6SoapProxy();
    return webService6Soap.getAllTables2Java();
  }
  
  public java.lang.String[] getAllColumnsEmployees1Java() throws java.rmi.RemoteException{
    if (webService6Soap == null)
      _initWebService6SoapProxy();
    return webService6Soap.getAllColumnsEmployees1Java();
  }
  
  public java.lang.String[] getAllColumnsEmployees2Java() throws java.rmi.RemoteException{
    if (webService6Soap == null)
      _initWebService6SoapProxy();
    return webService6Soap.getAllColumnsEmployees2Java();
  }
  
  
}