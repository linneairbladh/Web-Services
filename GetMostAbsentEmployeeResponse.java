/**
 * GetMostAbsentEmployeeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetMostAbsentEmployeeResponse  implements java.io.Serializable {
    private org.tempuri.GetMostAbsentEmployeeResponseGetMostAbsentEmployeeResult getMostAbsentEmployeeResult;

    public GetMostAbsentEmployeeResponse() {
    }

    public GetMostAbsentEmployeeResponse(
           org.tempuri.GetMostAbsentEmployeeResponseGetMostAbsentEmployeeResult getMostAbsentEmployeeResult) {
           this.getMostAbsentEmployeeResult = getMostAbsentEmployeeResult;
    }


    /**
     * Gets the getMostAbsentEmployeeResult value for this GetMostAbsentEmployeeResponse.
     * 
     * @return getMostAbsentEmployeeResult
     */
    public org.tempuri.GetMostAbsentEmployeeResponseGetMostAbsentEmployeeResult getGetMostAbsentEmployeeResult() {
        return getMostAbsentEmployeeResult;
    }


    /**
     * Sets the getMostAbsentEmployeeResult value for this GetMostAbsentEmployeeResponse.
     * 
     * @param getMostAbsentEmployeeResult
     */
    public void setGetMostAbsentEmployeeResult(org.tempuri.GetMostAbsentEmployeeResponseGetMostAbsentEmployeeResult getMostAbsentEmployeeResult) {
        this.getMostAbsentEmployeeResult = getMostAbsentEmployeeResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMostAbsentEmployeeResponse)) return false;
        GetMostAbsentEmployeeResponse other = (GetMostAbsentEmployeeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getMostAbsentEmployeeResult==null && other.getGetMostAbsentEmployeeResult()==null) || 
             (this.getMostAbsentEmployeeResult!=null &&
              this.getMostAbsentEmployeeResult.equals(other.getGetMostAbsentEmployeeResult())));
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
        if (getGetMostAbsentEmployeeResult() != null) {
            _hashCode += getGetMostAbsentEmployeeResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMostAbsentEmployeeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetMostAbsentEmployeeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getMostAbsentEmployeeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetMostAbsentEmployeeResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetMostAbsentEmployeeResponse>GetMostAbsentEmployeeResult"));
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
