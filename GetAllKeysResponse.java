/**
 * GetAllKeysResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetAllKeysResponse  implements java.io.Serializable {
    private org.tempuri.GetAllKeysResponseGetAllKeysResult getAllKeysResult;

    public GetAllKeysResponse() {
    }

    public GetAllKeysResponse(
           org.tempuri.GetAllKeysResponseGetAllKeysResult getAllKeysResult) {
           this.getAllKeysResult = getAllKeysResult;
    }


    /**
     * Gets the getAllKeysResult value for this GetAllKeysResponse.
     * 
     * @return getAllKeysResult
     */
    public org.tempuri.GetAllKeysResponseGetAllKeysResult getGetAllKeysResult() {
        return getAllKeysResult;
    }


    /**
     * Sets the getAllKeysResult value for this GetAllKeysResponse.
     * 
     * @param getAllKeysResult
     */
    public void setGetAllKeysResult(org.tempuri.GetAllKeysResponseGetAllKeysResult getAllKeysResult) {
        this.getAllKeysResult = getAllKeysResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllKeysResponse)) return false;
        GetAllKeysResponse other = (GetAllKeysResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAllKeysResult==null && other.getGetAllKeysResult()==null) || 
             (this.getAllKeysResult!=null &&
              this.getAllKeysResult.equals(other.getGetAllKeysResult())));
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
        if (getGetAllKeysResult() != null) {
            _hashCode += getGetAllKeysResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAllKeysResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAllKeysResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAllKeysResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAllKeysResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetAllKeysResponse>GetAllKeysResult"));
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
