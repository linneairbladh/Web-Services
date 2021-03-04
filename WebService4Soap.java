/**
 * WebService4Soap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface WebService4Soap extends java.rmi.Remote {
    public org.tempuri.User[] readUsers() throws java.rmi.RemoteException;
    public org.tempuri.Workout[] readWorkout() throws java.rmi.RemoteException;
}
