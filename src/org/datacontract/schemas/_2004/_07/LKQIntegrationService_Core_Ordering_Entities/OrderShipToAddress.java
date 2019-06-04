/**
 * OrderShipToAddress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities;

public class OrderShipToAddress  implements java.io.Serializable {
    private java.lang.String addressLine1;

    private java.lang.String addressLine2;

    private java.lang.String addressLine3;

    private java.lang.String city;

    private java.lang.String country;

    private java.lang.String phoneNumber;

    private java.lang.String postalCode;

    private java.lang.String shipToCode;

    private org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.ShippingAddressType shipToCodeType;

    private java.lang.String shipToName;

    private java.lang.String shipVia;

    private java.lang.String stateProvince;

    public OrderShipToAddress() {
    }

    public OrderShipToAddress(
           java.lang.String addressLine1,
           java.lang.String addressLine2,
           java.lang.String addressLine3,
           java.lang.String city,
           java.lang.String country,
           java.lang.String phoneNumber,
           java.lang.String postalCode,
           java.lang.String shipToCode,
           org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.ShippingAddressType shipToCodeType,
           java.lang.String shipToName,
           java.lang.String shipVia,
           java.lang.String stateProvince) {
           this.addressLine1 = addressLine1;
           this.addressLine2 = addressLine2;
           this.addressLine3 = addressLine3;
           this.city = city;
           this.country = country;
           this.phoneNumber = phoneNumber;
           this.postalCode = postalCode;
           this.shipToCode = shipToCode;
           this.shipToCodeType = shipToCodeType;
           this.shipToName = shipToName;
           this.shipVia = shipVia;
           this.stateProvince = stateProvince;
    }


    /**
     * Gets the addressLine1 value for this OrderShipToAddress.
     * 
     * @return addressLine1
     */
    public java.lang.String getAddressLine1() {
        return addressLine1;
    }


    /**
     * Sets the addressLine1 value for this OrderShipToAddress.
     * 
     * @param addressLine1
     */
    public void setAddressLine1(java.lang.String addressLine1) {
        this.addressLine1 = addressLine1;
    }


    /**
     * Gets the addressLine2 value for this OrderShipToAddress.
     * 
     * @return addressLine2
     */
    public java.lang.String getAddressLine2() {
        return addressLine2;
    }


    /**
     * Sets the addressLine2 value for this OrderShipToAddress.
     * 
     * @param addressLine2
     */
    public void setAddressLine2(java.lang.String addressLine2) {
        this.addressLine2 = addressLine2;
    }


    /**
     * Gets the addressLine3 value for this OrderShipToAddress.
     * 
     * @return addressLine3
     */
    public java.lang.String getAddressLine3() {
        return addressLine3;
    }


    /**
     * Sets the addressLine3 value for this OrderShipToAddress.
     * 
     * @param addressLine3
     */
    public void setAddressLine3(java.lang.String addressLine3) {
        this.addressLine3 = addressLine3;
    }


    /**
     * Gets the city value for this OrderShipToAddress.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this OrderShipToAddress.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the country value for this OrderShipToAddress.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this OrderShipToAddress.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the phoneNumber value for this OrderShipToAddress.
     * 
     * @return phoneNumber
     */
    public java.lang.String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this OrderShipToAddress.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the postalCode value for this OrderShipToAddress.
     * 
     * @return postalCode
     */
    public java.lang.String getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this OrderShipToAddress.
     * 
     * @param postalCode
     */
    public void setPostalCode(java.lang.String postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the shipToCode value for this OrderShipToAddress.
     * 
     * @return shipToCode
     */
    public java.lang.String getShipToCode() {
        return shipToCode;
    }


    /**
     * Sets the shipToCode value for this OrderShipToAddress.
     * 
     * @param shipToCode
     */
    public void setShipToCode(java.lang.String shipToCode) {
        this.shipToCode = shipToCode;
    }


    /**
     * Gets the shipToCodeType value for this OrderShipToAddress.
     * 
     * @return shipToCodeType
     */
    public org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.ShippingAddressType getShipToCodeType() {
        return shipToCodeType;
    }


    /**
     * Sets the shipToCodeType value for this OrderShipToAddress.
     * 
     * @param shipToCodeType
     */
    public void setShipToCodeType(org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.ShippingAddressType shipToCodeType) {
        this.shipToCodeType = shipToCodeType;
    }


    /**
     * Gets the shipToName value for this OrderShipToAddress.
     * 
     * @return shipToName
     */
    public java.lang.String getShipToName() {
        return shipToName;
    }


    /**
     * Sets the shipToName value for this OrderShipToAddress.
     * 
     * @param shipToName
     */
    public void setShipToName(java.lang.String shipToName) {
        this.shipToName = shipToName;
    }


    /**
     * Gets the shipVia value for this OrderShipToAddress.
     * 
     * @return shipVia
     */
    public java.lang.String getShipVia() {
        return shipVia;
    }


    /**
     * Sets the shipVia value for this OrderShipToAddress.
     * 
     * @param shipVia
     */
    public void setShipVia(java.lang.String shipVia) {
        this.shipVia = shipVia;
    }


    /**
     * Gets the stateProvince value for this OrderShipToAddress.
     * 
     * @return stateProvince
     */
    public java.lang.String getStateProvince() {
        return stateProvince;
    }


    /**
     * Sets the stateProvince value for this OrderShipToAddress.
     * 
     * @param stateProvince
     */
    public void setStateProvince(java.lang.String stateProvince) {
        this.stateProvince = stateProvince;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderShipToAddress)) return false;
        OrderShipToAddress other = (OrderShipToAddress) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addressLine1==null && other.getAddressLine1()==null) || 
             (this.addressLine1!=null &&
              this.addressLine1.equals(other.getAddressLine1()))) &&
            ((this.addressLine2==null && other.getAddressLine2()==null) || 
             (this.addressLine2!=null &&
              this.addressLine2.equals(other.getAddressLine2()))) &&
            ((this.addressLine3==null && other.getAddressLine3()==null) || 
             (this.addressLine3!=null &&
              this.addressLine3.equals(other.getAddressLine3()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode()))) &&
            ((this.shipToCode==null && other.getShipToCode()==null) || 
             (this.shipToCode!=null &&
              this.shipToCode.equals(other.getShipToCode()))) &&
            ((this.shipToCodeType==null && other.getShipToCodeType()==null) || 
             (this.shipToCodeType!=null &&
              this.shipToCodeType.equals(other.getShipToCodeType()))) &&
            ((this.shipToName==null && other.getShipToName()==null) || 
             (this.shipToName!=null &&
              this.shipToName.equals(other.getShipToName()))) &&
            ((this.shipVia==null && other.getShipVia()==null) || 
             (this.shipVia!=null &&
              this.shipVia.equals(other.getShipVia()))) &&
            ((this.stateProvince==null && other.getStateProvince()==null) || 
             (this.stateProvince!=null &&
              this.stateProvince.equals(other.getStateProvince())));
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
        if (getAddressLine1() != null) {
            _hashCode += getAddressLine1().hashCode();
        }
        if (getAddressLine2() != null) {
            _hashCode += getAddressLine2().hashCode();
        }
        if (getAddressLine3() != null) {
            _hashCode += getAddressLine3().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        if (getShipToCode() != null) {
            _hashCode += getShipToCode().hashCode();
        }
        if (getShipToCodeType() != null) {
            _hashCode += getShipToCodeType().hashCode();
        }
        if (getShipToName() != null) {
            _hashCode += getShipToName().hashCode();
        }
        if (getShipVia() != null) {
            _hashCode += getShipVia().hashCode();
        }
        if (getStateProvince() != null) {
            _hashCode += getStateProvince().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderShipToAddress.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "OrderShipToAddress"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLine1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "AddressLine1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLine2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "AddressLine2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLine3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "AddressLine3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "City"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "Country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "PhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "PostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipToCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "ShipToCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipToCodeType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "ShipToCodeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "ShippingAddressType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipToName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "ShipToName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipVia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "ShipVia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateProvince");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "StateProvince"));
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
