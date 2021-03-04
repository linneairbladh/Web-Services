/**
 * GetMostAbsentEmployeeJavaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetMostAbsentEmployeeJavaResponse  implements java.io.Serializable {
    private java.lang.String[] getMostAbsentEmployeeJavaResult;

    public GetMostAbsentEmployeeJavaResponse() {
    }

    public GetMostAbsentEmployeeJavaResponse(
           java.lang.String[] getMostAbsentEmployeeJavaResult) {
           this.getMostAbsentEmployeeJavaResult = getMostAbsentEmployeeJavaResult;
    }


    /**
     * Gets the getMostAbsentEmployeeJavaResult value for this GetMostAbsentEmployeeJavaResponse.
     * 
     * @return getMostAbsentEmployeeJavaResult
     */
    public java.lang.String[] getGetMostAbsentEmployeeJavaResult() {
        return getMostAbsentEmployeeJavaResult;
    }


    /**
     * Sets the getMostAbsentEmployeeJavaResult value for this GetMostAbsentEmployeeJavaResponse.
     * 
     * @param getMostAbsentEmployeeJavaResult
     */
    public void setGetMostAbsentEmployeeJavaResult(java.lang.String[] getMostAbsentEmployeeJavaResult) {
        this.getMostAbsentEmployeeJavaResult = getMostAbsentEmployeeJavaResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMostAbsentEmployeeJavaResponse)) return false;
        GetMostAbsentEmployeeJavaResponse other = (GetMostAbsentEmployeeJavaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getMostAbsentEmployeeJavaResult==null && other.getGetMostAbsentEmployeeJavaResult()==null) || 
             (this.getMostAbsentEmployeeJavaResult!=null &&
              java.util.Arrays.equals(this.getMostAbsentEmployeeJavaResult, other.getGetMostAbsentEmployeeJavaResult())));
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
        if (getGetMostAbsentEmployeeJavaResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetMostAbsentEmployeeJavaResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetMostAbsentEmployeeJavaResult(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMostAbsentEmployeeJavaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetMostAbsentEmployeeJavaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getMostAbsentEmployeeJavaResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetMostAbsentEmployeeJavaResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "string"));
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
