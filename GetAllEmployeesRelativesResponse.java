/**
 * GetAllEmployeesRelativesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetAllEmployeesRelativesResponse  implements java.io.Serializable {
    private org.tempuri.GetAllEmployeesRelativesResponseGetAllEmployeesRelativesResult getAllEmployeesRelativesResult;

    public GetAllEmployeesRelativesResponse() {
    }

    public GetAllEmployeesRelativesResponse(
           org.tempuri.GetAllEmployeesRelativesResponseGetAllEmployeesRelativesResult getAllEmployeesRelativesResult) {
           this.getAllEmployeesRelativesResult = getAllEmployeesRelativesResult;
    }


    /**
     * Gets the getAllEmployeesRelativesResult value for this GetAllEmployeesRelativesResponse.
     * 
     * @return getAllEmployeesRelativesResult
     */
    public org.tempuri.GetAllEmployeesRelativesResponseGetAllEmployeesRelativesResult getGetAllEmployeesRelativesResult() {
        return getAllEmployeesRelativesResult;
    }


    /**
     * Sets the getAllEmployeesRelativesResult value for this GetAllEmployeesRelativesResponse.
     * 
     * @param getAllEmployeesRelativesResult
     */
    public void setGetAllEmployeesRelativesResult(org.tempuri.GetAllEmployeesRelativesResponseGetAllEmployeesRelativesResult getAllEmployeesRelativesResult) {
        this.getAllEmployeesRelativesResult = getAllEmployeesRelativesResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllEmployeesRelativesResponse)) return false;
        GetAllEmployeesRelativesResponse other = (GetAllEmployeesRelativesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAllEmployeesRelativesResult==null && other.getGetAllEmployeesRelativesResult()==null) || 
             (this.getAllEmployeesRelativesResult!=null &&
              this.getAllEmployeesRelativesResult.equals(other.getGetAllEmployeesRelativesResult())));
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
        if (getGetAllEmployeesRelativesResult() != null) {
            _hashCode += getGetAllEmployeesRelativesResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAllEmployeesRelativesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAllEmployeesRelativesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAllEmployeesRelativesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAllEmployeesRelativesResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetAllEmployeesRelativesResponse>GetAllEmployeesRelativesResult"));
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
