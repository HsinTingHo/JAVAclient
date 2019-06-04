/**
 * OutOfStockNationalAvailabilityResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities;

public class OutOfStockNationalAvailabilityResult  extends org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.PartWithQuantityResult  implements java.io.Serializable {
    private java.lang.String warehouse;

    public OutOfStockNationalAvailabilityResult() {
    }

    public OutOfStockNationalAvailabilityResult(
           java.lang.String partNumber,
           java.lang.Integer quantity,
           java.lang.Boolean isAvailable,
           java.lang.String warehouse) {
        super(
            partNumber,
            quantity,
            isAvailable);
        this.warehouse = warehouse;
    }


    /**
     * Gets the warehouse value for this OutOfStockNationalAvailabilityResult.
     * 
     * @return warehouse
     */
    public java.lang.String getWarehouse() {
        return warehouse;
    }


    /**
     * Sets the warehouse value for this OutOfStockNationalAvailabilityResult.
     * 
     * @param warehouse
     */
    public void setWarehouse(java.lang.String warehouse) {
        this.warehouse = warehouse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OutOfStockNationalAvailabilityResult)) return false;
        OutOfStockNationalAvailabilityResult other = (OutOfStockNationalAvailabilityResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.warehouse==null && other.getWarehouse()==null) || 
             (this.warehouse!=null &&
              this.warehouse.equals(other.getWarehouse())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getWarehouse() != null) {
            _hashCode += getWarehouse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OutOfStockNationalAvailabilityResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "OutOfStockNationalAvailabilityResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warehouse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "Warehouse"));
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
