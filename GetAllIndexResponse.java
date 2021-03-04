/**
 * GetAllIndexResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetAllIndexResponse  implements java.io.Serializable {
    private org.tempuri.GetAllIndexResponseGetAllIndexResult getAllIndexResult;

    public GetAllIndexResponse() {
    }

    public GetAllIndexResponse(
           org.tempuri.GetAllIndexResponseGetAllIndexResult getAllIndexResult) {
           this.getAllIndexResult = getAllIndexResult;
    }


    /**
     * Gets the getAllIndexResult value for this GetAllIndexResponse.
     * 
     * @return getAllIndexResult
     */
    public org.tempuri.GetAllIndexResponseGetAllIndexResult getGetAllIndexResult() {
        return getAllIndexResult;
    }


    /**
     * Sets the getAllIndexResult value for this GetAllIndexResponse.
     * 
     * @param getAllIndexResult
     */
    public void setGetAllIndexResult(org.tempuri.GetAllIndexResponseGetAllIndexResult getAllIndexResult) {
        this.getAllIndexResult = getAllIndexResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllIndexResponse)) return false;
        GetAllIndexResponse other = (GetAllIndexResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAllIndexResult==null && other.getGetAllIndexResult()==null) || 
             (this.getAllIndexResult!=null &&
              this.getAllIndexResult.equals(other.getGetAllIndexResult())));
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
        if (getGetAllIndexResult() != null) {
            _hashCode += getGetAllIndexResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAllIndexResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAllIndexResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAllIndexResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAllIndexResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetAllIndexResponse>GetAllIndexResult"));
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
