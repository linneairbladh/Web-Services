/**
 * GetAllSickEmployees2004Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetAllSickEmployees2004Response  implements java.io.Serializable {
    private org.tempuri.GetAllSickEmployees2004ResponseGetAllSickEmployees2004Result getAllSickEmployees2004Result;

    public GetAllSickEmployees2004Response() {
    }

    public GetAllSickEmployees2004Response(
           org.tempuri.GetAllSickEmployees2004ResponseGetAllSickEmployees2004Result getAllSickEmployees2004Result) {
           this.getAllSickEmployees2004Result = getAllSickEmployees2004Result;
    }


    /**
     * Gets the getAllSickEmployees2004Result value for this GetAllSickEmployees2004Response.
     * 
     * @return getAllSickEmployees2004Result
     */
    public org.tempuri.GetAllSickEmployees2004ResponseGetAllSickEmployees2004Result getGetAllSickEmployees2004Result() {
        return getAllSickEmployees2004Result;
    }


    /**
     * Sets the getAllSickEmployees2004Result value for this GetAllSickEmployees2004Response.
     * 
     * @param getAllSickEmployees2004Result
     */
    public void setGetAllSickEmployees2004Result(org.tempuri.GetAllSickEmployees2004ResponseGetAllSickEmployees2004Result getAllSickEmployees2004Result) {
        this.getAllSickEmployees2004Result = getAllSickEmployees2004Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllSickEmployees2004Response)) return false;
        GetAllSickEmployees2004Response other = (GetAllSickEmployees2004Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAllSickEmployees2004Result==null && other.getGetAllSickEmployees2004Result()==null) || 
             (this.getAllSickEmployees2004Result!=null &&
              this.getAllSickEmployees2004Result.equals(other.getGetAllSickEmployees2004Result())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getGetAllSickEmployees2004Result() != null) {
            _hashCode += getGetAllSickEmployees2004Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAllSickEmployees2004Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAllSickEmployees2004Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAllSickEmployees2004Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAllSickEmployees2004Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetAllSickEmployees2004Response>GetAllSickEmployees2004Result"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
