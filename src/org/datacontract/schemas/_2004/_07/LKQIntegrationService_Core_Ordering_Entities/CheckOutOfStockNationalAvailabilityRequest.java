/**
 * CheckOutOfStockNationalAvailabilityRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities;

public class CheckOutOfStockNationalAvailabilityRequest  extends org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.UserRequest  implements java.io.Serializable {
    private java.lang.String companyCode;

    private org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.PartWithQuantityRequest[] partsWithQuantity;

    private java.lang.String postalCode;

    public CheckOutOfStockNationalAvailabilityRequest() {
    }

    public CheckOutOfStockNationalAvailabilityRequest(
           org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.UserInformation userRequestInfo,
           java.lang.String companyCode,
           org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.PartWithQuantityRequest[] partsWithQuantity,
           java.lang.String postalCode) {
        super(
            userRequestInfo);
        this.companyCode = companyCode;
        this.partsWithQuantity = partsWithQuantity;
        this.postalCode = postalCode;
    }


    /**
     * Gets the companyCode value for this CheckOutOfStockNationalAvailabilityRequest.
     * 
     * @return companyCode
     */
    public java.lang.String getCompanyCode() {
        return companyCode;
    }


    /**
     * Sets the companyCode value for this CheckOutOfStockNationalAvailabilityRequest.
     * 
     * @param companyCode
     */
    public void setCompanyCode(java.lang.String companyCode) {
        this.companyCode = companyCode;
    }


    /**
     * Gets the partsWithQuantity value for this CheckOutOfStockNationalAvailabilityRequest.
     * 
     * @return partsWithQuantity
     */
    public org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.PartWithQuantityRequest[] getPartsWithQuantity() {
        return partsWithQuantity;
    }


    /**
     * Sets the partsWithQuantity value for this CheckOutOfStockNationalAvailabilityRequest.
     * 
     * @param partsWithQuantity
     */
    public void setPartsWithQuantity(org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.PartWithQuantityRequest[] partsWithQuantity) {
        this.partsWithQuantity = partsWithQuantity;
    }


    /**
     * Gets the postalCode value for this CheckOutOfStockNationalAvailabilityRequest.
     * 
     * @return postalCode
     */
    public java.lang.String getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this CheckOutOfStockNationalAvailabilityRequest.
     * 
     * @param postalCode
     */
    public void setPostalCode(java.lang.String postalCode) {
        this.postalCode = postalCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckOutOfStockNationalAvailabilityRequest)) return false;
        CheckOutOfStockNationalAvailabilityRequest other = (CheckOutOfStockNationalAvailabilityRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.companyCode==null && other.getCompanyCode()==null) || 
             (this.companyCode!=null &&
              this.companyCode.equals(other.getCompanyCode()))) &&
            ((this.partsWithQuantity==null && other.getPartsWithQuantity()==null) || 
             (this.partsWithQuantity!=null &&
              java.util.Arrays.equals(this.partsWithQuantity, other.getPartsWithQuantity()))) &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode())));
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
        if (getCompanyCode() != null) {
            _hashCode += getCompanyCode().hashCode();
        }
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
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CheckOutOfStockNationalAvailabilityRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "CheckOutOfStockNationalAvailabilityRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "CompanyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partsWithQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "PartsWithQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "PartWithQuantityRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "PartWithQuantityRequest"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "PostalCode"));
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
