/**
 * GetAllTables2Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetAllTables2Response  implements java.io.Serializable {
    private org.tempuri.GetAllTables2ResponseGetAllTables2Result getAllTables2Result;

    public GetAllTables2Response() {
    }

    public GetAllTables2Response(
           org.tempuri.GetAllTables2ResponseGetAllTables2Result getAllTables2Result) {
           this.getAllTables2Result = getAllTables2Result;
    }


    /**
     * Gets the getAllTables2Result value for this GetAllTables2Response.
     * 
     * @return getAllTables2Result
     */
    public org.tempuri.GetAllTables2ResponseGetAllTables2Result getGetAllTables2Result() {
        return getAllTables2Result;
    }


    /**
     * Sets the getAllTables2Result value for this GetAllTables2Response.
     * 
     * @param getAllTables2Result
     */
    public void setGetAllTables2Result(org.tempuri.GetAllTables2ResponseGetAllTables2Result getAllTables2Result) {
        this.getAllTables2Result = getAllTables2Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllTables2Response)) return false;
        GetAllTables2Response other = (GetAllTables2Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAllTables2Result==null && other.getGetAllTables2Result()==null) || 
             (this.getAllTables2Result!=null &&
              this.getAllTables2Result.equals(other.getGetAllTables2Result())));
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
        if (getGetAllTables2Result() != null) {
            _hashCode += getGetAllTables2Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAllTables2Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAllTables2Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAllTables2Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAllTables2Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetAllTables2Response>GetAllTables2Result"));
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
