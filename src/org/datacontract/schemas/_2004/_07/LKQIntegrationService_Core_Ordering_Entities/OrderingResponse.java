/**
 * OrderingResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities;

public class OrderingResponse  implements java.io.Serializable {
    private java.lang.String aftermarketOrderNumber;

    private java.lang.String salvageOrderNumber;

    public OrderingResponse() {
    }

    public OrderingResponse(
           java.lang.String aftermarketOrderNumber,
           java.lang.String salvageOrderNumber) {
           this.aftermarketOrderNumber = aftermarketOrderNumber;
           this.salvageOrderNumber = salvageOrderNumber;
    }


    /**
     * Gets the aftermarketOrderNumber value for this OrderingResponse.
     * 
     * @return aftermarketOrderNumber
     */
    public java.lang.String getAftermarketOrderNumber() {
        return aftermarketOrderNumber;
    }


    /**
     * Sets the aftermarketOrderNumber value for this OrderingResponse.
     * 
     * @param aftermarketOrderNumber
     */
    public void setAftermarketOrderNumber(java.lang.String aftermarketOrderNumber) {
        this.aftermarketOrderNumber = aftermarketOrderNumber;
    }


    /**
     * Gets the salvageOrderNumber value for this OrderingResponse.
     * 
     * @return salvageOrderNumber
     */
    public java.lang.String getSalvageOrderNumber() {
        return salvageOrderNumber;
    }


    /**
     * Sets the salvageOrderNumber value for this OrderingResponse.
     * 
     * @param salvageOrderNumber
     */
    public void setSalvageOrderNumber(java.lang.String salvageOrderNumber) {
        this.salvageOrderNumber = salvageOrderNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderingResponse)) return false;
        OrderingResponse other = (OrderingResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.aftermarketOrderNumber==null && other.getAftermarketOrderNumber()==null) || 
             (this.aftermarketOrderNumber!=null &&
              this.aftermarketOrderNumber.equals(other.getAftermarketOrderNumber()))) &&
            ((this.salvageOrderNumber==null && other.getSalvageOrderNumber()==null) || 
             (this.salvageOrderNumber!=null &&
              this.salvageOrderNumber.equals(other.getSalvageOrderNumber())));
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
        if (getAftermarketOrderNumber() != null) {
            _hashCode += getAftermarketOrderNumber().hashCode();
        }
        if (getSalvageOrderNumber() != null) {
            _hashCode += getSalvageOrderNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderingResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "OrderingResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aftermarketOrderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "AftermarketOrderNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salvageOrderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "SalvageOrderNumber"));
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
