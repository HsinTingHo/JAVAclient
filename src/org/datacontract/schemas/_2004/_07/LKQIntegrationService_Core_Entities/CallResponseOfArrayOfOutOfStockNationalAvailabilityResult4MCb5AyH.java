/**
 * CallResponseOfArrayOfOutOfStockNationalAvailabilityResult4MCb5AyH.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities;

public class CallResponseOfArrayOfOutOfStockNationalAvailabilityResult4MCb5AyH  extends org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.CallResponse  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.OutOfStockNationalAvailabilityResult[] value;

    public CallResponseOfArrayOfOutOfStockNationalAvailabilityResult4MCb5AyH() {
    }

    public CallResponseOfArrayOfOutOfStockNationalAvailabilityResult4MCb5AyH(
           java.lang.String[] errorMessages,
           java.lang.Boolean isSuccessful,
           org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.OutOfStockNationalAvailabilityResult[] value) {
        super(
            errorMessages,
            isSuccessful);
        this.value = value;
    }


    /**
     * Gets the value value for this CallResponseOfArrayOfOutOfStockNationalAvailabilityResult4MCb5AyH.
     * 
     * @return value
     */
    public org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.OutOfStockNationalAvailabilityResult[] getValue() {
        return value;
    }


    /**
     * Sets the value value for this CallResponseOfArrayOfOutOfStockNationalAvailabilityResult4MCb5AyH.
     * 
     * @param value
     */
    public void setValue(org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.OutOfStockNationalAvailabilityResult[] value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CallResponseOfArrayOfOutOfStockNationalAvailabilityResult4MCb5AyH)) return false;
        CallResponseOfArrayOfOutOfStockNationalAvailabilityResult4MCb5AyH other = (CallResponseOfArrayOfOutOfStockNationalAvailabilityResult4MCb5AyH) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              java.util.Arrays.equals(this.value, other.getValue())));
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
        if (getValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValue(), i);
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
        new org.apache.axis.description.TypeDesc(CallResponseOfArrayOfOutOfStockNationalAvailabilityResult4MCb5AyH.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Entities", "CallResponseOfArrayOfOutOfStockNationalAvailabilityResult4MCb5AyH"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Entities", "Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "OutOfStockNationalAvailabilityResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "OutOfStockNationalAvailabilityResult"));
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
