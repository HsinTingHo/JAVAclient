/**
 * KeyTrackOrderInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities;

public class KeyTrackOrderInfo  implements java.io.Serializable {
    private java.lang.String claimNumber;

    private java.lang.String insuranceCompanyName;

    private java.lang.String keyTrackRepairOrderNumber;

    private java.lang.String VINNumber;

    public KeyTrackOrderInfo() {
    }

    public KeyTrackOrderInfo(
           java.lang.String claimNumber,
           java.lang.String insuranceCompanyName,
           java.lang.String keyTrackRepairOrderNumber,
           java.lang.String VINNumber) {
           this.claimNumber = claimNumber;
           this.insuranceCompanyName = insuranceCompanyName;
           this.keyTrackRepairOrderNumber = keyTrackRepairOrderNumber;
           this.VINNumber = VINNumber;
    }


    /**
     * Gets the claimNumber value for this KeyTrackOrderInfo.
     * 
     * @return claimNumber
     */
    public java.lang.String getClaimNumber() {
        return claimNumber;
    }


    /**
     * Sets the claimNumber value for this KeyTrackOrderInfo.
     * 
     * @param claimNumber
     */
    public void setClaimNumber(java.lang.String claimNumber) {
        this.claimNumber = claimNumber;
    }


    /**
     * Gets the insuranceCompanyName value for this KeyTrackOrderInfo.
     * 
     * @return insuranceCompanyName
     */
    public java.lang.String getInsuranceCompanyName() {
        return insuranceCompanyName;
    }


    /**
     * Sets the insuranceCompanyName value for this KeyTrackOrderInfo.
     * 
     * @param insuranceCompanyName
     */
    public void setInsuranceCompanyName(java.lang.String insuranceCompanyName) {
        this.insuranceCompanyName = insuranceCompanyName;
    }


    /**
     * Gets the keyTrackRepairOrderNumber value for this KeyTrackOrderInfo.
     * 
     * @return keyTrackRepairOrderNumber
     */
    public java.lang.String getKeyTrackRepairOrderNumber() {
        return keyTrackRepairOrderNumber;
    }


    /**
     * Sets the keyTrackRepairOrderNumber value for this KeyTrackOrderInfo.
     * 
     * @param keyTrackRepairOrderNumber
     */
    public void setKeyTrackRepairOrderNumber(java.lang.String keyTrackRepairOrderNumber) {
        this.keyTrackRepairOrderNumber = keyTrackRepairOrderNumber;
    }


    /**
     * Gets the VINNumber value for this KeyTrackOrderInfo.
     * 
     * @return VINNumber
     */
    public java.lang.String getVINNumber() {
        return VINNumber;
    }


    /**
     * Sets the VINNumber value for this KeyTrackOrderInfo.
     * 
     * @param VINNumber
     */
    public void setVINNumber(java.lang.String VINNumber) {
        this.VINNumber = VINNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KeyTrackOrderInfo)) return false;
        KeyTrackOrderInfo other = (KeyTrackOrderInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.claimNumber==null && other.getClaimNumber()==null) || 
             (this.claimNumber!=null &&
              this.claimNumber.equals(other.getClaimNumber()))) &&
            ((this.insuranceCompanyName==null && other.getInsuranceCompanyName()==null) || 
             (this.insuranceCompanyName!=null &&
              this.insuranceCompanyName.equals(other.getInsuranceCompanyName()))) &&
            ((this.keyTrackRepairOrderNumber==null && other.getKeyTrackRepairOrderNumber()==null) || 
             (this.keyTrackRepairOrderNumber!=null &&
              this.keyTrackRepairOrderNumber.equals(other.getKeyTrackRepairOrderNumber()))) &&
            ((this.VINNumber==null && other.getVINNumber()==null) || 
             (this.VINNumber!=null &&
              this.VINNumber.equals(other.getVINNumber())));
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
        if (getClaimNumber() != null) {
            _hashCode += getClaimNumber().hashCode();
        }
        if (getInsuranceCompanyName() != null) {
            _hashCode += getInsuranceCompanyName().hashCode();
        }
        if (getKeyTrackRepairOrderNumber() != null) {
            _hashCode += getKeyTrackRepairOrderNumber().hashCode();
        }
        if (getVINNumber() != null) {
            _hashCode += getVINNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KeyTrackOrderInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "KeyTrackOrderInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("claimNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "ClaimNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insuranceCompanyName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "InsuranceCompanyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyTrackRepairOrderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "KeyTrackRepairOrderNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VINNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "VINNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
