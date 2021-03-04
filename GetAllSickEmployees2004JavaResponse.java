/**
 * GetAllSickEmployees2004JavaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetAllSickEmployees2004JavaResponse  implements java.io.Serializable {
    private java.lang.String[] getAllSickEmployees2004JavaResult;

    public GetAllSickEmployees2004JavaResponse() {
    }

    public GetAllSickEmployees2004JavaResponse(
           java.lang.String[] getAllSickEmployees2004JavaResult) {
           this.getAllSickEmployees2004JavaResult = getAllSickEmployees2004JavaResult;
    }


    /**
     * Gets the getAllSickEmployees2004JavaResult value for this GetAllSickEmployees2004JavaResponse.
     * 
     * @return getAllSickEmployees2004JavaResult
     */
    public java.lang.String[] getGetAllSickEmployees2004JavaResult() {
        return getAllSickEmployees2004JavaResult;
    }


    /**
     * Sets the getAllSickEmployees2004JavaResult value for this GetAllSickEmployees2004JavaResponse.
     * 
     * @param getAllSickEmployees2004JavaResult
     */
    public void setGetAllSickEmployees2004JavaResult(java.lang.String[] getAllSickEmployees2004JavaResult) {
        this.getAllSickEmployees2004JavaResult = getAllSickEmployees2004JavaResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllSickEmployees2004JavaResponse)) return false;
        GetAllSickEmployees2004JavaResponse other = (GetAllSickEmployees2004JavaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAllSickEmployees2004JavaResult==null && other.getGetAllSickEmployees2004JavaResult()==null) || 
             (this.getAllSickEmployees2004JavaResult!=null &&
              java.util.Arrays.equals(this.getAllSickEmployees2004JavaResult, other.getGetAllSickEmployees2004JavaResult())));
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
        if (getGetAllSickEmployees2004JavaResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetAllSickEmployees2004JavaResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetAllSickEmployees2004JavaResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetAllSickEmployees2004JavaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAllSickEmployees2004JavaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAllSickEmployees2004JavaResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAllSickEmployees2004JavaResult"));
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
