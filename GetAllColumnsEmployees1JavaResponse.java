/**
 * GetAllColumnsEmployees1JavaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetAllColumnsEmployees1JavaResponse  implements java.io.Serializable {
    private java.lang.String[] getAllColumnsEmployees1JavaResult;

    public GetAllColumnsEmployees1JavaResponse() {
    }

    public GetAllColumnsEmployees1JavaResponse(
           java.lang.String[] getAllColumnsEmployees1JavaResult) {
           this.getAllColumnsEmployees1JavaResult = getAllColumnsEmployees1JavaResult;
    }


    /**
     * Gets the getAllColumnsEmployees1JavaResult value for this GetAllColumnsEmployees1JavaResponse.
     * 
     * @return getAllColumnsEmployees1JavaResult
     */
    public java.lang.String[] getGetAllColumnsEmployees1JavaResult() {
        return getAllColumnsEmployees1JavaResult;
    }


    /**
     * Sets the getAllColumnsEmployees1JavaResult value for this GetAllColumnsEmployees1JavaResponse.
     * 
     * @param getAllColumnsEmployees1JavaResult
     */
    public void setGetAllColumnsEmployees1JavaResult(java.lang.String[] getAllColumnsEmployees1JavaResult) {
        this.getAllColumnsEmployees1JavaResult = getAllColumnsEmployees1JavaResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllColumnsEmployees1JavaResponse)) return false;
        GetAllColumnsEmployees1JavaResponse other = (GetAllColumnsEmployees1JavaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAllColumnsEmployees1JavaResult==null && other.getGetAllColumnsEmployees1JavaResult()==null) || 
             (this.getAllColumnsEmployees1JavaResult!=null &&
              java.util.Arrays.equals(this.getAllColumnsEmployees1JavaResult, other.getGetAllColumnsEmployees1JavaResult())));
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
        if (getGetAllColumnsEmployees1JavaResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetAllColumnsEmployees1JavaResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetAllColumnsEmployees1JavaResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetAllColumnsEmployees1JavaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAllColumnsEmployees1JavaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAllColumnsEmployees1JavaResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAllColumnsEmployees1JavaResult"));
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
