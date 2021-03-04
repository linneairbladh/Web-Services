/**
 * GetAllTableConstraintsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetAllTableConstraintsResponse  implements java.io.Serializable {
    private org.tempuri.GetAllTableConstraintsResponseGetAllTableConstraintsResult getAllTableConstraintsResult;

    public GetAllTableConstraintsResponse() {
    }

    public GetAllTableConstraintsResponse(
           org.tempuri.GetAllTableConstraintsResponseGetAllTableConstraintsResult getAllTableConstraintsResult) {
           this.getAllTableConstraintsResult = getAllTableConstraintsResult;
    }


    /**
     * Gets the getAllTableConstraintsResult value for this GetAllTableConstraintsResponse.
     * 
     * @return getAllTableConstraintsResult
     */
    public org.tempuri.GetAllTableConstraintsResponseGetAllTableConstraintsResult getGetAllTableConstraintsResult() {
        return getAllTableConstraintsResult;
    }


    /**
     * Sets the getAllTableConstraintsResult value for this GetAllTableConstraintsResponse.
     * 
     * @param getAllTableConstraintsResult
     */
    public void setGetAllTableConstraintsResult(org.tempuri.GetAllTableConstraintsResponseGetAllTableConstraintsResult getAllTableConstraintsResult) {
        this.getAllTableConstraintsResult = getAllTableConstraintsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllTableConstraintsResponse)) return false;
        GetAllTableConstraintsResponse other = (GetAllTableConstraintsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAllTableConstraintsResult==null && other.getGetAllTableConstraintsResult()==null) || 
             (this.getAllTableConstraintsResult!=null &&
              this.getAllTableConstraintsResult.equals(other.getGetAllTableConstraintsResult())));
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
        if (getGetAllTableConstraintsResult() != null) {
            _hashCode += getGetAllTableConstraintsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAllTableConstraintsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAllTableConstraintsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAllTableConstraintsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAllTableConstraintsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetAllTableConstraintsResponse>GetAllTableConstraintsResult"));
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
