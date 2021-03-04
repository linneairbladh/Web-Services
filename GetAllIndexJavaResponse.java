/**
 * GetAllIndexJavaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetAllIndexJavaResponse  implements java.io.Serializable {
    private java.lang.String[] getAllIndexJavaResult;

    public GetAllIndexJavaResponse() {
    }

    public GetAllIndexJavaResponse(
           java.lang.String[] getAllIndexJavaResult) {
           this.getAllIndexJavaResult = getAllIndexJavaResult;
    }


    /**
     * Gets the getAllIndexJavaResult value for this GetAllIndexJavaResponse.
     * 
     * @return getAllIndexJavaResult
     */
    public java.lang.String[] getGetAllIndexJavaResult() {
        return getAllIndexJavaResult;
    }


    /**
     * Sets the getAllIndexJavaResult value for this GetAllIndexJavaResponse.
     * 
     * @param getAllIndexJavaResult
     */
    public void setGetAllIndexJavaResult(java.lang.String[] getAllIndexJavaResult) {
        this.getAllIndexJavaResult = getAllIndexJavaResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllIndexJavaResponse)) return false;
        GetAllIndexJavaResponse other = (GetAllIndexJavaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAllIndexJavaResult==null && other.getGetAllIndexJavaResult()==null) || 
             (this.getAllIndexJavaResult!=null &&
              java.util.Arrays.equals(this.getAllIndexJavaResult, other.getGetAllIndexJavaResult())));
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
        if (getGetAllIndexJavaResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetAllIndexJavaResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetAllIndexJavaResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetAllIndexJavaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAllIndexJavaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAllIndexJavaResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAllIndexJavaResult"));
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
