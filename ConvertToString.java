/**
 * ConvertToString.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ConvertToString  implements java.io.Serializable {
    private org.tempuri.ConvertToStringDataTable dataTable;

    public ConvertToString() {
    }

    public ConvertToString(
           org.tempuri.ConvertToStringDataTable dataTable) {
           this.dataTable = dataTable;
    }


    /**
     * Gets the dataTable value for this ConvertToString.
     * 
     * @return dataTable
     */
    public org.tempuri.ConvertToStringDataTable getDataTable() {
        return dataTable;
    }


    /**
     * Sets the dataTable value for this ConvertToString.
     * 
     * @param dataTable
     */
    public void setDataTable(org.tempuri.ConvertToStringDataTable dataTable) {
        this.dataTable = dataTable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConvertToString)) return false;
        ConvertToString other = (ConvertToString) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dataTable==null && other.getDataTable()==null) || 
             (this.dataTable!=null &&
              this.dataTable.equals(other.getDataTable())));
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
        if (getDataTable() != null) {
            _hashCode += getDataTable().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConvertToString.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ConvertToString"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataTable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "dataTable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ConvertToString>dataTable"));
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
