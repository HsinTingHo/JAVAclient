/**
 * PartWithQuantityResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities;

public class PartWithQuantityResult  extends org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.PartWithQuantityRequest  implements java.io.Serializable {
    private java.lang.Boolean isAvailable;

    public PartWithQuantityResult() {
    }

    public PartWithQuantityResult(
           java.lang.String partNumber,
           java.lang.Integer quantity,
           java.lang.Boolean isAvailable) {
        super(
            partNumber,
            quantity);
        this.isAvailable = isAvailable;
    }


    /**
     * Gets the isAvailable value for this PartWithQuantityResult.
     * 
     * @return isAvailable
     */
    public java.lang.Boolean getIsAvailable() {
        return isAvailable;
    }


    /**
     * Sets the isAvailable value for this PartWithQuantityResult.
     * 
     * @param isAvailable
     */
    public void setIsAvailable(java.lang.Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PartWithQuantityResult)) return false;
        PartWithQuantityResult other = (PartWithQuantityResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.isAvailable==null && other.getIsAvailable()==null) || 
             (this.isAvailable!=null &&
              this.isAvailable.equals(other.getIsAvailable())));
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
        if (getIsAvailable() != null) {
            _hashCode += getIsAvailable().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PartWithQuantityResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "PartWithQuantityResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "IsAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
