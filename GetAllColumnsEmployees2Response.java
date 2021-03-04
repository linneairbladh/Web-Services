/**
 * GetAllColumnsEmployees2Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetAllColumnsEmployees2Response  implements java.io.Serializable {
    private org.tempuri.GetAllColumnsEmployees2ResponseGetAllColumnsEmployees2Result getAllColumnsEmployees2Result;

    public GetAllColumnsEmployees2Response() {
    }

    public GetAllColumnsEmployees2Response(
           org.tempuri.GetAllColumnsEmployees2ResponseGetAllColumnsEmployees2Result getAllColumnsEmployees2Result) {
           this.getAllColumnsEmployees2Result = getAllColumnsEmployees2Result;
    }


    /**
     * Gets the getAllColumnsEmployees2Result value for this GetAllColumnsEmployees2Response.
     * 
     * @return getAllColumnsEmployees2Result
     */
    public org.tempuri.GetAllColumnsEmployees2ResponseGetAllColumnsEmployees2Result getGetAllColumnsEmployees2Result() {
        return getAllColumnsEmployees2Result;
    }


    /**
     * Sets the getAllColumnsEmployees2Result value for this GetAllColumnsEmployees2Response.
     * 
     * @param getAllColumnsEmployees2Result
     */
    public void setGetAllColumnsEmployees2Result(org.tempuri.GetAllColumnsEmployees2ResponseGetAllColumnsEmployees2Result getAllColumnsEmployees2Result) {
        this.getAllColumnsEmployees2Result = getAllColumnsEmployees2Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllColumnsEmployees2Response)) return false;
        GetAllColumnsEmployees2Response other = (GetAllColumnsEmployees2Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAllColumnsEmployees2Result==null && other.getGetAllColumnsEmployees2Result()==null) || 
             (this.getAllColumnsEmployees2Result!=null &&
              this.getAllColumnsEmployees2Result.equals(other.getGetAllColumnsEmployees2Result())));
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
        if (getGetAllColumnsEmployees2Result() != null) {
            _hashCode += getGetAllColumnsEmployees2Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAllColumnsEmployees2Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAllColumnsEmployees2Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAllColumnsEmployees2Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAllColumnsEmployees2Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetAllColumnsEmployees2Response>GetAllColumnsEmployees2Result"));
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
