/**
 * GetAllTables1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetAllTables1Response  implements java.io.Serializable {
    private org.tempuri.GetAllTables1ResponseGetAllTables1Result getAllTables1Result;

    public GetAllTables1Response() {
    }

    public GetAllTables1Response(
           org.tempuri.GetAllTables1ResponseGetAllTables1Result getAllTables1Result) {
           this.getAllTables1Result = getAllTables1Result;
    }


    /**
     * Gets the getAllTables1Result value for this GetAllTables1Response.
     * 
     * @return getAllTables1Result
     */
    public org.tempuri.GetAllTables1ResponseGetAllTables1Result getGetAllTables1Result() {
        return getAllTables1Result;
    }


    /**
     * Sets the getAllTables1Result value for this GetAllTables1Response.
     * 
     * @param getAllTables1Result
     */
    public void setGetAllTables1Result(org.tempuri.GetAllTables1ResponseGetAllTables1Result getAllTables1Result) {
        this.getAllTables1Result = getAllTables1Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllTables1Response)) return false;
        GetAllTables1Response other = (GetAllTables1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAllTables1Result==null && other.getGetAllTables1Result()==null) || 
             (this.getAllTables1Result!=null &&
              this.getAllTables1Result.equals(other.getGetAllTables1Result())));
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
        if (getGetAllTables1Result() != null) {
            _hashCode += getGetAllTables1Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAllTables1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAllTables1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAllTables1Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAllTables1Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetAllTables1Response>GetAllTables1Result"));
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
