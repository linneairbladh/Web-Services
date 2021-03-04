/**
 * Workout.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Workout  implements java.io.Serializable {
    private int workoutID;

    private java.lang.String workoutType;

    private java.lang.Integer sets;

    private java.lang.Integer reps;

    private java.lang.String email;

    private org.tempuri.User user;

    public Workout() {
    }

    public Workout(
           int workoutID,
           java.lang.String workoutType,
           java.lang.Integer sets,
           java.lang.Integer reps,
           java.lang.String email,
           org.tempuri.User user) {
           this.workoutID = workoutID;
           this.workoutType = workoutType;
           this.sets = sets;
           this.reps = reps;
           this.email = email;
           this.user = user;
    }


    /**
     * Gets the workoutID value for this Workout.
     * 
     * @return workoutID
     */
    public int getWorkoutID() {
        return workoutID;
    }


    /**
     * Sets the workoutID value for this Workout.
     * 
     * @param workoutID
     */
    public void setWorkoutID(int workoutID) {
        this.workoutID = workoutID;
    }


    /**
     * Gets the workoutType value for this Workout.
     * 
     * @return workoutType
     */
    public java.lang.String getWorkoutType() {
        return workoutType;
    }


    /**
     * Sets the workoutType value for this Workout.
     * 
     * @param workoutType
     */
    public void setWorkoutType(java.lang.String workoutType) {
        this.workoutType = workoutType;
    }


    /**
     * Gets the sets value for this Workout.
     * 
     * @return sets
     */
    public java.lang.Integer getSets() {
        return sets;
    }


    /**
     * Sets the sets value for this Workout.
     * 
     * @param sets
     */
    public void setSets(java.lang.Integer sets) {
        this.sets = sets;
    }


    /**
     * Gets the reps value for this Workout.
     * 
     * @return reps
     */
    public java.lang.Integer getReps() {
        return reps;
    }


    /**
     * Sets the reps value for this Workout.
     * 
     * @param reps
     */
    public void setReps(java.lang.Integer reps) {
        this.reps = reps;
    }


    /**
     * Gets the email value for this Workout.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Workout.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the user value for this Workout.
     * 
     * @return user
     */
    public org.tempuri.User getUser() {
        return user;
    }


    /**
     * Sets the user value for this Workout.
     * 
     * @param user
     */
    public void setUser(org.tempuri.User user) {
        this.user = user;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Workout)) return false;
        Workout other = (Workout) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.workoutID == other.getWorkoutID() &&
            ((this.workoutType==null && other.getWorkoutType()==null) || 
             (this.workoutType!=null &&
              this.workoutType.equals(other.getWorkoutType()))) &&
            ((this.sets==null && other.getSets()==null) || 
             (this.sets!=null &&
              this.sets.equals(other.getSets()))) &&
            ((this.reps==null && other.getReps()==null) || 
             (this.reps!=null &&
              this.reps.equals(other.getReps()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser())));
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
        _hashCode += getWorkoutID();
        if (getWorkoutType() != null) {
            _hashCode += getWorkoutType().hashCode();
        }
        if (getSets() != null) {
            _hashCode += getSets().hashCode();
        }
        if (getReps() != null) {
            _hashCode += getReps().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Workout.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Workout"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workoutID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "workoutID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workoutType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "workoutType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reps");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "reps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "User"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "User"));
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
