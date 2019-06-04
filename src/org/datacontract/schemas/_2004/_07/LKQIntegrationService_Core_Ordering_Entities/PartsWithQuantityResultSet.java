/**
 * PartsWithQuantityResultSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities;

public class PartsWithQuantityResultSet  implements java.io.Serializable {
    private java.lang.Boolean freightRulesFound;

    private org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.PartWithFreight[] parts;

    private java.math.BigDecimal totalFreightCharge;

    public PartsWithQuantityResultSet() {
    }

    public PartsWithQuantityResultSet(
           java.lang.Boolean freightRulesFound,
           org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.PartWithFreight[] parts,
           java.math.BigDecimal totalFreightCharge) {
           this.freightRulesFound = freightRulesFound;
           this.parts = parts;
           this.totalFreightCharge = totalFreightCharge;
    }


    /**
     * Gets the freightRulesFound value for this PartsWithQuantityResultSet.
     * 
     * @return freightRulesFound
     */
    public java.lang.Boolean getFreightRulesFound() {
        return freightRulesFound;
    }


    /**
     * Sets the freightRulesFound value for this PartsWithQuantityResultSet.
     * 
     * @param freightRulesFound
     */
    public void setFreightRulesFound(java.lang.Boolean freightRulesFound) {
        this.freightRulesFound = freightRulesFound;
    }


    /**
     * Gets the parts value for this PartsWithQuantityResultSet.
     * 
     * @return parts
     */
    public org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.PartWithFreight[] getParts() {
        return parts;
    }


    /**
     * Sets the parts value for this PartsWithQuantityResultSet.
     * 
     * @param parts
     */
    public void setParts(org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.PartWithFreight[] parts) {
        this.parts = parts;
    }


    /**
     * Gets the totalFreightCharge value for this PartsWithQuantityResultSet.
     * 
     * @return totalFreightCharge
     */
    public java.math.BigDecimal getTotalFreightCharge() {
        return totalFreightCharge;
    }


    /**
     * Sets the totalFreightCharge value for this PartsWithQuantityResultSet.
     * 
     * @param totalFreightCharge
     */
    public void setTotalFreightCharge(java.math.BigDecimal totalFreightCharge) {
        this.totalFreightCharge = totalFreightCharge;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PartsWithQuantityResultSet)) return false;
        PartsWithQuantityResultSet other = (PartsWithQuantityResultSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.freightRulesFound==null && other.getFreightRulesFound()==null) || 
             (this.freightRulesFound!=null &&
              this.freightRulesFound.equals(other.getFreightRulesFound()))) &&
            ((this.parts==null && other.getParts()==null) || 
             (this.parts!=null &&
              java.util.Arrays.equals(this.parts, other.getParts()))) &&
            ((this.totalFreightCharge==null && other.getTotalFreightCharge()==null) || 
             (this.totalFreightCharge!=null &&
              this.totalFreightCharge.equals(other.getTotalFreightCharge())));
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
        if (getFreightRulesFound() != null) {
            _hashCode += getFreightRulesFound().hashCode();
        }
        if (getParts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotalFreightCharge() != null) {
            _hashCode += getTotalFreightCharge().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PartsWithQuantityResultSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "PartsWithQuantityResultSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freightRulesFound");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "FreightRulesFound"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "Parts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "PartWithFreight"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "PartWithFreight"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalFreightCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "TotalFreightCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
