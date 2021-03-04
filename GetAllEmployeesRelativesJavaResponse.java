/**
 * GetAllEmployeesRelativesJavaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetAllEmployeesRelativesJavaResponse  implements java.io.Serializable {
    private java.lang.String[] getAllEmployeesRelativesJavaResult;

    public GetAllEmployeesRelativesJavaResponse() {
    }

    public GetAllEmployeesRelativesJavaResponse(
           java.lang.String[] getAllEmployeesRelativesJavaResult) {
           this.getAllEmployeesRelativesJavaResult = getAllEmployeesRelativesJavaResult;
    }


    /**
     * Gets the getAllEmployeesRelativesJavaResult value for this GetAllEmployeesRelativesJavaResponse.
     * 
     * @return getAllEmployeesRelativesJavaResult
     */
    public java.lang.String[] getGetAllEmployeesRelativesJavaResult() {
        return getAllEmployeesRelativesJavaResult;
    }


    /**
     * Sets the getAllEmployeesRelativesJavaResult value for this GetAllEmployeesRelativesJavaResponse.
     * 
     * @param getAllEmployeesRelativesJavaResult
     */
    public void setGetAllEmployeesRelativesJavaResult(java.lang.String[] getAllEmployeesRelativesJavaResult) {
        this.getAllEmployeesRelativesJavaResult = getAllEmployeesRelativesJavaResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllEmployeesRelativesJavaResponse)) return false;
        GetAllEmployeesRelativesJavaResponse other = (GetAllEmployeesRelativesJavaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAllEmployeesRelativesJavaResult==null && other.getGetAllEmployeesRelativesJavaResult()==null) || 
             (this.getAllEmployeesRelativesJavaResult!=null &&
              java.util.Arrays.equals(this.getAllEmployeesRelativesJavaResult, other.getGetAllEmployeesRelativesJavaResult())));
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
        if (getGetAllEmployeesRelativesJavaResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetAllEmployeesRelativesJavaResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetAllEmployeesRelativesJavaResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetAllEmployeesRelativesJavaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAllEmployeesRelativesJavaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAllEmployeesRelativesJavaResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAllEmployeesRelativesJavaResult"));
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
