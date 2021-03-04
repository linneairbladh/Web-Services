/**
 * GetAllTables2JavaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetAllTables2JavaResponse  implements java.io.Serializable {
    private java.lang.String[] getAllTables2JavaResult;

    public GetAllTables2JavaResponse() {
    }

    public GetAllTables2JavaResponse(
           java.lang.String[] getAllTables2JavaResult) {
           this.getAllTables2JavaResult = getAllTables2JavaResult;
    }


    /**
     * Gets the getAllTables2JavaResult value for this GetAllTables2JavaResponse.
     * 
     * @return getAllTables2JavaResult
     */
    public java.lang.String[] getGetAllTables2JavaResult() {
        return getAllTables2JavaResult;
    }


    /**
     * Sets the getAllTables2JavaResult value for this GetAllTables2JavaResponse.
     * 
     * @param getAllTables2JavaResult
     */
    public void setGetAllTables2JavaResult(java.lang.String[] getAllTables2JavaResult) {
        this.getAllTables2JavaResult = getAllTables2JavaResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllTables2JavaResponse)) return false;
        GetAllTables2JavaResponse other = (GetAllTables2JavaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAllTables2JavaResult==null && other.getGetAllTables2JavaResult()==null) || 
             (this.getAllTables2JavaResult!=null &&
              java.util.Arrays.equals(this.getAllTables2JavaResult, other.getGetAllTables2JavaResult())));
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
        if (getGetAllTables2JavaResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetAllTables2JavaResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetAllTables2JavaResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetAllTables2JavaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAllTables2JavaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAllTables2JavaResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAllTables2JavaResult"));
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
