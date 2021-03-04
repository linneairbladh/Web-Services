/**
 * WebService5Soap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface WebService5Soap extends java.rmi.Remote {
    public org.tempuri.CRONUS_Sverige_AB_Employee[] read() throws java.rmi.RemoteException;
    public org.tempuri.CRONUS_Sverige_AB_Employee find(java.lang.String no) throws java.rmi.RemoteException;
    public org.tempuri.CRONUS_Sverige_AB_Employee update(java.lang.String no_, java.lang.String firstname, java.lang.String lastname, java.lang.String jobtitle, java.lang.String address, java.lang.String email) throws java.rmi.RemoteException;
    public org.tempuri.CRONUS_Sverige_AB_Employee delete(java.lang.String no) throws java.rmi.RemoteException;
    public org.tempuri.CRONUS_Sverige_AB_Employee add(java.lang.String firstname, java.lang.String lastname, java.lang.String jobtitle, java.lang.String address, java.lang.String email) throws java.rmi.RemoteException;
}
