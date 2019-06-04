/**
 * OrderingRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities;

public class OrderingRequest  extends org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.UserRequest  implements java.io.Serializable {
    private java.lang.String AMPurchaseOrderNumber;

    private java.lang.String contactName;

    private org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.OrderCopyMethodType copyMethod;

    private java.lang.String emailAddress;

    private java.lang.String faxNumber;

    private java.math.BigDecimal freightCharges;

    private org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.KeyTrackOrderInfo keyTrackInfo;

    private java.lang.Boolean liftgateRequired;

    private org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.OrderPartType lineItemTypes;

    private org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.OrderLineItem[] lineItems;

    private java.lang.String partnerCode;

    private java.lang.String repairOrderNumber;

    private java.lang.Boolean residentialDelivery;

    private org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.SalvagePaymentInformation salvagePaymentInformation;

    private java.lang.String salvagePurchaseOrderNumber;

    private java.lang.Boolean saturdayDelivery;

    private java.lang.String shipFromWarehouse;

    private org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.OrderShipToAddress shipToAddress;

    private java.lang.Boolean signatureRequired;

    private java.lang.String specialInstructions;

    private java.lang.String writtenBy;

    public OrderingRequest() {
    }

    public OrderingRequest(
           org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.UserInformation userRequestInfo,
           java.lang.String AMPurchaseOrderNumber,
           java.lang.String contactName,
           org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.OrderCopyMethodType copyMethod,
           java.lang.String emailAddress,
           java.lang.String faxNumber,
           java.math.BigDecimal freightCharges,
           org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.KeyTrackOrderInfo keyTrackInfo,
           java.lang.Boolean liftgateRequired,
           org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.OrderPartType lineItemTypes,
           org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.OrderLineItem[] lineItems,
           java.lang.String partnerCode,
           java.lang.String repairOrderNumber,
           java.lang.Boolean residentialDelivery,
           org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.SalvagePaymentInformation salvagePaymentInformation,
           java.lang.String salvagePurchaseOrderNumber,
           java.lang.Boolean saturdayDelivery,
           java.lang.String shipFromWarehouse,
           org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.OrderShipToAddress shipToAddress,
           java.lang.Boolean signatureRequired,
           java.lang.String specialInstructions,
           java.lang.String writtenBy) {
        super(
            userRequestInfo);
        this.AMPurchaseOrderNumber = AMPurchaseOrderNumber;
        this.contactName = contactName;
        this.copyMethod = copyMethod;
        this.emailAddress = emailAddress;
        this.faxNumber = faxNumber;
        this.freightCharges = freightCharges;
        this.keyTrackInfo = keyTrackInfo;
        this.liftgateRequired = liftgateRequired;
        this.lineItemTypes = lineItemTypes;
        this.lineItems = lineItems;
        this.partnerCode = partnerCode;
        this.repairOrderNumber = repairOrderNumber;
        this.residentialDelivery = residentialDelivery;
        this.salvagePaymentInformation = salvagePaymentInformation;
        this.salvagePurchaseOrderNumber = salvagePurchaseOrderNumber;
        this.saturdayDelivery = saturdayDelivery;
        this.shipFromWarehouse = shipFromWarehouse;
        this.shipToAddress = shipToAddress;
        this.signatureRequired = signatureRequired;
        this.specialInstructions = specialInstructions;
        this.writtenBy = writtenBy;
    }


    /**
     * Gets the AMPurchaseOrderNumber value for this OrderingRequest.
     * 
     * @return AMPurchaseOrderNumber
     */
    public java.lang.String getAMPurchaseOrderNumber() {
        return AMPurchaseOrderNumber;
    }


    /**
     * Sets the AMPurchaseOrderNumber value for this OrderingRequest.
     * 
     * @param AMPurchaseOrderNumber
     */
    public void setAMPurchaseOrderNumber(java.lang.String AMPurchaseOrderNumber) {
        this.AMPurchaseOrderNumber = AMPurchaseOrderNumber;
    }


    /**
     * Gets the contactName value for this OrderingRequest.
     * 
     * @return contactName
     */
    public java.lang.String getContactName() {
        return contactName;
    }


    /**
     * Sets the contactName value for this OrderingRequest.
     * 
     * @param contactName
     */
    public void setContactName(java.lang.String contactName) {
        this.contactName = contactName;
    }


    /**
     * Gets the copyMethod value for this OrderingRequest.
     * 
     * @return copyMethod
     */
    public org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.OrderCopyMethodType getCopyMethod() {
        return copyMethod;
    }


    /**
     * Sets the copyMethod value for this OrderingRequest.
     * 
     * @param copyMethod
     */
    public void setCopyMethod(org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.OrderCopyMethodType copyMethod) {
        this.copyMethod = copyMethod;
    }


    /**
     * Gets the emailAddress value for this OrderingRequest.
     * 
     * @return emailAddress
     */
    public java.lang.String getEmailAddress() {
        return emailAddress;
    }


    /**
     * Sets the emailAddress value for this OrderingRequest.
     * 
     * @param emailAddress
     */
    public void setEmailAddress(java.lang.String emailAddress) {
        this.emailAddress = emailAddress;
    }


    /**
     * Gets the faxNumber value for this OrderingRequest.
     * 
     * @return faxNumber
     */
    public java.lang.String getFaxNumber() {
        return faxNumber;
    }


    /**
     * Sets the faxNumber value for this OrderingRequest.
     * 
     * @param faxNumber
     */
    public void setFaxNumber(java.lang.String faxNumber) {
        this.faxNumber = faxNumber;
    }


    /**
     * Gets the freightCharges value for this OrderingRequest.
     * 
     * @return freightCharges
     */
    public java.math.BigDecimal getFreightCharges() {
        return freightCharges;
    }


    /**
     * Sets the freightCharges value for this OrderingRequest.
     * 
     * @param freightCharges
     */
    public void setFreightCharges(java.math.BigDecimal freightCharges) {
        this.freightCharges = freightCharges;
    }


    /**
     * Gets the keyTrackInfo value for this OrderingRequest.
     * 
     * @return keyTrackInfo
     */
    public org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.KeyTrackOrderInfo getKeyTrackInfo() {
        return keyTrackInfo;
    }


    /**
     * Sets the keyTrackInfo value for this OrderingRequest.
     * 
     * @param keyTrackInfo
     */
    public void setKeyTrackInfo(org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.KeyTrackOrderInfo keyTrackInfo) {
        this.keyTrackInfo = keyTrackInfo;
    }


    /**
     * Gets the liftgateRequired value for this OrderingRequest.
     * 
     * @return liftgateRequired
     */
    public java.lang.Boolean getLiftgateRequired() {
        return liftgateRequired;
    }


    /**
     * Sets the liftgateRequired value for this OrderingRequest.
     * 
     * @param liftgateRequired
     */
    public void setLiftgateRequired(java.lang.Boolean liftgateRequired) {
        this.liftgateRequired = liftgateRequired;
    }


    /**
     * Gets the lineItemTypes value for this OrderingRequest.
     * 
     * @return lineItemTypes
     */
    public org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.OrderPartType getLineItemTypes() {
        return lineItemTypes;
    }


    /**
     * Sets the lineItemTypes value for this OrderingRequest.
     * 
     * @param lineItemTypes
     */
    public void setLineItemTypes(org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.OrderPartType lineItemTypes) {
        this.lineItemTypes = lineItemTypes;
    }


    /**
     * Gets the lineItems value for this OrderingRequest.
     * 
     * @return lineItems
     */
    public org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.OrderLineItem[] getLineItems() {
        return lineItems;
    }


    /**
     * Sets the lineItems value for this OrderingRequest.
     * 
     * @param lineItems
     */
    public void setLineItems(org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.OrderLineItem[] lineItems) {
        this.lineItems = lineItems;
    }


    /**
     * Gets the partnerCode value for this OrderingRequest.
     * 
     * @return partnerCode
     */
    public java.lang.String getPartnerCode() {
        return partnerCode;
    }


    /**
     * Sets the partnerCode value for this OrderingRequest.
     * 
     * @param partnerCode
     */
    public void setPartnerCode(java.lang.String partnerCode) {
        this.partnerCode = partnerCode;
    }


    /**
     * Gets the repairOrderNumber value for this OrderingRequest.
     * 
     * @return repairOrderNumber
     */
    public java.lang.String getRepairOrderNumber() {
        return repairOrderNumber;
    }


    /**
     * Sets the repairOrderNumber value for this OrderingRequest.
     * 
     * @param repairOrderNumber
     */
    public void setRepairOrderNumber(java.lang.String repairOrderNumber) {
        this.repairOrderNumber = repairOrderNumber;
    }


    /**
     * Gets the residentialDelivery value for this OrderingRequest.
     * 
     * @return residentialDelivery
     */
    public java.lang.Boolean getResidentialDelivery() {
        return residentialDelivery;
    }


    /**
     * Sets the residentialDelivery value for this OrderingRequest.
     * 
     * @param residentialDelivery
     */
    public void setResidentialDelivery(java.lang.Boolean residentialDelivery) {
        this.residentialDelivery = residentialDelivery;
    }


    /**
     * Gets the salvagePaymentInformation value for this OrderingRequest.
     * 
     * @return salvagePaymentInformation
     */
    public org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.SalvagePaymentInformation getSalvagePaymentInformation() {
        return salvagePaymentInformation;
    }


    /**
     * Sets the salvagePaymentInformation value for this OrderingRequest.
     * 
     * @param salvagePaymentInformation
     */
    public void setSalvagePaymentInformation(org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.SalvagePaymentInformation salvagePaymentInformation) {
        this.salvagePaymentInformation = salvagePaymentInformation;
    }


    /**
     * Gets the salvagePurchaseOrderNumber value for this OrderingRequest.
     * 
     * @return salvagePurchaseOrderNumber
     */
    public java.lang.String getSalvagePurchaseOrderNumber() {
        return salvagePurchaseOrderNumber;
    }


    /**
     * Sets the salvagePurchaseOrderNumber value for this OrderingRequest.
     * 
     * @param salvagePurchaseOrderNumber
     */
    public void setSalvagePurchaseOrderNumber(java.lang.String salvagePurchaseOrderNumber) {
        this.salvagePurchaseOrderNumber = salvagePurchaseOrderNumber;
    }


    /**
     * Gets the saturdayDelivery value for this OrderingRequest.
     * 
     * @return saturdayDelivery
     */
    public java.lang.Boolean getSaturdayDelivery() {
        return saturdayDelivery;
    }


    /**
     * Sets the saturdayDelivery value for this OrderingRequest.
     * 
     * @param saturdayDelivery
     */
    public void setSaturdayDelivery(java.lang.Boolean saturdayDelivery) {
        this.saturdayDelivery = saturdayDelivery;
    }


    /**
     * Gets the shipFromWarehouse value for this OrderingRequest.
     * 
     * @return shipFromWarehouse
     */
    public java.lang.String getShipFromWarehouse() {
        return shipFromWarehouse;
    }


    /**
     * Sets the shipFromWarehouse value for this OrderingRequest.
     * 
     * @param shipFromWarehouse
     */
    public void setShipFromWarehouse(java.lang.String shipFromWarehouse) {
        this.shipFromWarehouse = shipFromWarehouse;
    }


    /**
     * Gets the shipToAddress value for this OrderingRequest.
     * 
     * @return shipToAddress
     */
    public org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.OrderShipToAddress getShipToAddress() {
        return shipToAddress;
    }


    /**
     * Sets the shipToAddress value for this OrderingRequest.
     * 
     * @param shipToAddress
     */
    public void setShipToAddress(org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.OrderShipToAddress shipToAddress) {
        this.shipToAddress = shipToAddress;
    }


    /**
     * Gets the signatureRequired value for this OrderingRequest.
     * 
     * @return signatureRequired
     */
    public java.lang.Boolean getSignatureRequired() {
        return signatureRequired;
    }


    /**
     * Sets the signatureRequired value for this OrderingRequest.
     * 
     * @param signatureRequired
     */
    public void setSignatureRequired(java.lang.Boolean signatureRequired) {
        this.signatureRequired = signatureRequired;
    }


    /**
     * Gets the specialInstructions value for this OrderingRequest.
     * 
     * @return specialInstructions
     */
    public java.lang.String getSpecialInstructions() {
        return specialInstructions;
    }


    /**
     * Sets the specialInstructions value for this OrderingRequest.
     * 
     * @param specialInstructions
     */
    public void setSpecialInstructions(java.lang.String specialInstructions) {
        this.specialInstructions = specialInstructions;
    }


    /**
     * Gets the writtenBy value for this OrderingRequest.
     * 
     * @return writtenBy
     */
    public java.lang.String getWrittenBy() {
        return writtenBy;
    }


    /**
     * Sets the writtenBy value for this OrderingRequest.
     * 
     * @param writtenBy
     */
    public void setWrittenBy(java.lang.String writtenBy) {
        this.writtenBy = writtenBy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderingRequest)) return false;
        OrderingRequest other = (OrderingRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.AMPurchaseOrderNumber==null && other.getAMPurchaseOrderNumber()==null) || 
             (this.AMPurchaseOrderNumber!=null &&
              this.AMPurchaseOrderNumber.equals(other.getAMPurchaseOrderNumber()))) &&
            ((this.contactName==null && other.getContactName()==null) || 
             (this.contactName!=null &&
              this.contactName.equals(other.getContactName()))) &&
            ((this.copyMethod==null && other.getCopyMethod()==null) || 
             (this.copyMethod!=null &&
              this.copyMethod.equals(other.getCopyMethod()))) &&
            ((this.emailAddress==null && other.getEmailAddress()==null) || 
             (this.emailAddress!=null &&
              this.emailAddress.equals(other.getEmailAddress()))) &&
            ((this.faxNumber==null && other.getFaxNumber()==null) || 
             (this.faxNumber!=null &&
              this.faxNumber.equals(other.getFaxNumber()))) &&
            ((this.freightCharges==null && other.getFreightCharges()==null) || 
             (this.freightCharges!=null &&
              this.freightCharges.equals(other.getFreightCharges()))) &&
            ((this.keyTrackInfo==null && other.getKeyTrackInfo()==null) || 
             (this.keyTrackInfo!=null &&
              this.keyTrackInfo.equals(other.getKeyTrackInfo()))) &&
            ((this.liftgateRequired==null && other.getLiftgateRequired()==null) || 
             (this.liftgateRequired!=null &&
              this.liftgateRequired.equals(other.getLiftgateRequired()))) &&
            ((this.lineItemTypes==null && other.getLineItemTypes()==null) || 
             (this.lineItemTypes!=null &&
              this.lineItemTypes.equals(other.getLineItemTypes()))) &&
            ((this.lineItems==null && other.getLineItems()==null) || 
             (this.lineItems!=null &&
              java.util.Arrays.equals(this.lineItems, other.getLineItems()))) &&
            ((this.partnerCode==null && other.getPartnerCode()==null) || 
             (this.partnerCode!=null &&
              this.partnerCode.equals(other.getPartnerCode()))) &&
            ((this.repairOrderNumber==null && other.getRepairOrderNumber()==null) || 
             (this.repairOrderNumber!=null &&
              this.repairOrderNumber.equals(other.getRepairOrderNumber()))) &&
            ((this.residentialDelivery==null && other.getResidentialDelivery()==null) || 
             (this.residentialDelivery!=null &&
              this.residentialDelivery.equals(other.getResidentialDelivery()))) &&
            ((this.salvagePaymentInformation==null && other.getSalvagePaymentInformation()==null) || 
             (this.salvagePaymentInformation!=null &&
              this.salvagePaymentInformation.equals(other.getSalvagePaymentInformation()))) &&
            ((this.salvagePurchaseOrderNumber==null && other.getSalvagePurchaseOrderNumber()==null) || 
             (this.salvagePurchaseOrderNumber!=null &&
              this.salvagePurchaseOrderNumber.equals(other.getSalvagePurchaseOrderNumber()))) &&
            ((this.saturdayDelivery==null && other.getSaturdayDelivery()==null) || 
             (this.saturdayDelivery!=null &&
              this.saturdayDelivery.equals(other.getSaturdayDelivery()))) &&
            ((this.shipFromWarehouse==null && other.getShipFromWarehouse()==null) || 
             (this.shipFromWarehouse!=null &&
              this.shipFromWarehouse.equals(other.getShipFromWarehouse()))) &&
            ((this.shipToAddress==null && other.getShipToAddress()==null) || 
             (this.shipToAddress!=null &&
              this.shipToAddress.equals(other.getShipToAddress()))) &&
            ((this.signatureRequired==null && other.getSignatureRequired()==null) || 
             (this.signatureRequired!=null &&
              this.signatureRequired.equals(other.getSignatureRequired()))) &&
            ((this.specialInstructions==null && other.getSpecialInstructions()==null) || 
             (this.specialInstructions!=null &&
              this.specialInstructions.equals(other.getSpecialInstructions()))) &&
            ((this.writtenBy==null && other.getWrittenBy()==null) || 
             (this.writtenBy!=null &&
              this.writtenBy.equals(other.getWrittenBy())));
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
        if (getAMPurchaseOrderNumber() != null) {
            _hashCode += getAMPurchaseOrderNumber().hashCode();
        }
        if (getContactName() != null) {
            _hashCode += getContactName().hashCode();
        }
        if (getCopyMethod() != null) {
            _hashCode += getCopyMethod().hashCode();
        }
        if (getEmailAddress() != null) {
            _hashCode += getEmailAddress().hashCode();
        }
        if (getFaxNumber() != null) {
            _hashCode += getFaxNumber().hashCode();
        }
        if (getFreightCharges() != null) {
            _hashCode += getFreightCharges().hashCode();
        }
        if (getKeyTrackInfo() != null) {
            _hashCode += getKeyTrackInfo().hashCode();
        }
        if (getLiftgateRequired() != null) {
            _hashCode += getLiftgateRequired().hashCode();
        }
        if (getLineItemTypes() != null) {
            _hashCode += getLineItemTypes().hashCode();
        }
        if (getLineItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLineItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLineItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPartnerCode() != null) {
            _hashCode += getPartnerCode().hashCode();
        }
        if (getRepairOrderNumber() != null) {
            _hashCode += getRepairOrderNumber().hashCode();
        }
        if (getResidentialDelivery() != null) {
            _hashCode += getResidentialDelivery().hashCode();
        }
        if (getSalvagePaymentInformation() != null) {
            _hashCode += getSalvagePaymentInformation().hashCode();
        }
        if (getSalvagePurchaseOrderNumber() != null) {
            _hashCode += getSalvagePurchaseOrderNumber().hashCode();
        }
        if (getSaturdayDelivery() != null) {
            _hashCode += getSaturdayDelivery().hashCode();
        }
        if (getShipFromWarehouse() != null) {
            _hashCode += getShipFromWarehouse().hashCode();
        }
        if (getShipToAddress() != null) {
            _hashCode += getShipToAddress().hashCode();
        }
        if (getSignatureRequired() != null) {
            _hashCode += getSignatureRequired().hashCode();
        }
        if (getSpecialInstructions() != null) {
            _hashCode += getSpecialInstructions().hashCode();
        }
        if (getWrittenBy() != null) {
            _hashCode += getWrittenBy().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderingRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "OrderingRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AMPurchaseOrderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "AMPurchaseOrderNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "ContactName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copyMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "CopyMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "OrderCopyMethodType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "EmailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faxNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "FaxNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freightCharges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "FreightCharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyTrackInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "KeyTrackInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "KeyTrackOrderInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("liftgateRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "LiftgateRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "LineItemTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "OrderPartType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "LineItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "OrderLineItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "OrderLineItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "PartnerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repairOrderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "RepairOrderNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residentialDelivery");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "ResidentialDelivery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salvagePaymentInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "SalvagePaymentInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "SalvagePaymentInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salvagePurchaseOrderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "SalvagePurchaseOrderNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saturdayDelivery");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "SaturdayDelivery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipFromWarehouse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "ShipFromWarehouse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipToAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "ShipToAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "OrderShipToAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signatureRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "SignatureRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialInstructions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "SpecialInstructions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("writtenBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "WrittenBy"));
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
