/**
 * CheckDropShipAvailabilityRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities;

public class CheckDropShipAvailabilityRequest  extends org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.UserRequest  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.PartWithQuantityRequest[] partsWithQuantity;

    public CheckDropShipAvailabilityRequest() {
    }

    public CheckDropShipAvailabilityRequest(
           org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.UserInformation userRequestInfo,
           org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.PartWithQuantityRequest[] partsWithQuantity) {
        super(
            userRequestInfo);
        this.partsWithQuantity = partsWithQuantity;
    }


    /**
     * Gets the partsWithQuantity value for this CheckDropShipAvailabilityRequest.
     * 
     * @return partsWithQuantity
     */
    public org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.PartWithQuantityRequest[] getPartsWithQuantity() {
        return partsWithQuantity;
    }


    /**
     * Sets the partsWithQuantity value for this CheckDropShipAvailabilityRequest.
     * 
     * @param partsWithQuantity
     */
    public void setPartsWithQuantity(org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.PartWithQuantityRequest[] partsWithQuantity) {
        this.partsWithQuantity = partsWithQuantity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckDropShipAvailabilityRequest)) return false;
        CheckDropShipAvailabilityRequest other = (CheckDropShipAvailabilityRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.partsWithQuantity==null && other.getPartsWithQuantity()==null) || 
             (this.partsWithQuantity!=null &&
              java.util.Arrays.equals(this.partsWithQuantity, other.getPartsWithQuantity())));
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
        if (getPartsWithQuantity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartsWithQuantity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartsWithQuantity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CheckDropShipAvailabilityRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "CheckDropShipAvailabilityRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partsWithQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "PartsWithQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "PartWithQuantityRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "PartWithQuantityRequest"));
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
