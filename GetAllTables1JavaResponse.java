/**
 * GetAllTables1JavaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetAllTables1JavaResponse  implements java.io.Serializable {
    private java.lang.String[] getAllTables1JavaResult;

    public GetAllTables1JavaResponse() {
    }

    public GetAllTables1JavaResponse(
           java.lang.String[] getAllTables1JavaResult) {
           this.getAllTables1JavaResult = getAllTables1JavaResult;
    }


    /**
     * Gets the getAllTables1JavaResult value for this GetAllTables1JavaResponse.
     * 
     * @return getAllTables1JavaResult
     */
    public java.lang.String[] getGetAllTables1JavaResult() {
        return getAllTables1JavaResult;
    }


    /**
     * Sets the getAllTables1JavaResult value for this GetAllTables1JavaResponse.
     * 
     * @param getAllTables1JavaResult
     */
    public void setGetAllTables1JavaResult(java.lang.String[] getAllTables1JavaResult) {
        this.getAllTables1JavaResult = getAllTables1JavaResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllTables1JavaResponse)) return false;
        GetAllTables1JavaResponse other = (GetAllTables1JavaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAllTables1JavaResult==null && other.getGetAllTables1JavaResult()==null) || 
             (this.getAllTables1JavaResult!=null &&
              java.util.Arrays.equals(this.getAllTables1JavaResult, other.getGetAllTables1JavaResult())));
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
        if (getGetAllTables1JavaResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetAllTables1JavaResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetAllTables1JavaResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetAllTables1JavaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAllTables1JavaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAllTables1JavaResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAllTables1JavaResult"));
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
