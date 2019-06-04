/**
 * OrderLineItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities;

public class OrderLineItem  implements java.io.Serializable {
    private java.lang.String commentForPart;

    private java.lang.String commentForPickTicket;

    private java.math.BigDecimal customerCost;

    private java.math.BigDecimal freight;

    private java.lang.String lineComment;

    private java.lang.String partNumber;

    private java.lang.Integer quantity;

    private java.lang.String unitOfMeasure;

    private java.lang.Boolean usedPart;

    public OrderLineItem() {
    }

    public OrderLineItem(
           java.lang.String commentForPart,
           java.lang.String commentForPickTicket,
           java.math.BigDecimal customerCost,
           java.math.BigDecimal freight,
           java.lang.String lineComment,
           java.lang.String partNumber,
           java.lang.Integer quantity,
           java.lang.String unitOfMeasure,
           java.lang.Boolean usedPart) {
           this.commentForPart = commentForPart;
           this.commentForPickTicket = commentForPickTicket;
           this.customerCost = customerCost;
           this.freight = freight;
           this.lineComment = lineComment;
           this.partNumber = partNumber;
           this.quantity = quantity;
           this.unitOfMeasure = unitOfMeasure;
           this.usedPart = usedPart;
    }


    /**
     * Gets the commentForPart value for this OrderLineItem.
     * 
     * @return commentForPart
     */
    public java.lang.String getCommentForPart() {
        return commentForPart;
    }


    /**
     * Sets the commentForPart value for this OrderLineItem.
     * 
     * @param commentForPart
     */
    public void setCommentForPart(java.lang.String commentForPart) {
        this.commentForPart = commentForPart;
    }


    /**
     * Gets the commentForPickTicket value for this OrderLineItem.
     * 
     * @return commentForPickTicket
     */
    public java.lang.String getCommentForPickTicket() {
        return commentForPickTicket;
    }


    /**
     * Sets the commentForPickTicket value for this OrderLineItem.
     * 
     * @param commentForPickTicket
     */
    public void setCommentForPickTicket(java.lang.String commentForPickTicket) {
        this.commentForPickTicket = commentForPickTicket;
    }


    /**
     * Gets the customerCost value for this OrderLineItem.
     * 
     * @return customerCost
     */
    public java.math.BigDecimal getCustomerCost() {
        return customerCost;
    }


    /**
     * Sets the customerCost value for this OrderLineItem.
     * 
     * @param customerCost
     */
    public void setCustomerCost(java.math.BigDecimal customerCost) {
        this.customerCost = customerCost;
    }


    /**
     * Gets the freight value for this OrderLineItem.
     * 
     * @return freight
     */
    public java.math.BigDecimal getFreight() {
        return freight;
    }


    /**
     * Sets the freight value for this OrderLineItem.
     * 
     * @param freight
     */
    public void setFreight(java.math.BigDecimal freight) {
        this.freight = freight;
    }


    /**
     * Gets the lineComment value for this OrderLineItem.
     * 
     * @return lineComment
     */
    public java.lang.String getLineComment() {
        return lineComment;
    }


    /**
     * Sets the lineComment value for this OrderLineItem.
     * 
     * @param lineComment
     */
    public void setLineComment(java.lang.String lineComment) {
        this.lineComment = lineComment;
    }


    /**
     * Gets the partNumber value for this OrderLineItem.
     * 
     * @return partNumber
     */
    public java.lang.String getPartNumber() {
        return partNumber;
    }


    /**
     * Sets the partNumber value for this OrderLineItem.
     * 
     * @param partNumber
     */
    public void setPartNumber(java.lang.String partNumber) {
        this.partNumber = partNumber;
    }


    /**
     * Gets the quantity value for this OrderLineItem.
     * 
     * @return quantity
     */
    public java.lang.Integer getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this OrderLineItem.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.Integer quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the unitOfMeasure value for this OrderLineItem.
     * 
     * @return unitOfMeasure
     */
    public java.lang.String getUnitOfMeasure() {
        return unitOfMeasure;
    }


    /**
     * Sets the unitOfMeasure value for this OrderLineItem.
     * 
     * @param unitOfMeasure
     */
    public void setUnitOfMeasure(java.lang.String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }


    /**
     * Gets the usedPart value for this OrderLineItem.
     * 
     * @return usedPart
     */
    public java.lang.Boolean getUsedPart() {
        return usedPart;
    }


    /**
     * Sets the usedPart value for this OrderLineItem.
     * 
     * @param usedPart
     */
    public void setUsedPart(java.lang.Boolean usedPart) {
        this.usedPart = usedPart;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderLineItem)) return false;
        OrderLineItem other = (OrderLineItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.commentForPart==null && other.getCommentForPart()==null) || 
             (this.commentForPart!=null &&
              this.commentForPart.equals(other.getCommentForPart()))) &&
            ((this.commentForPickTicket==null && other.getCommentForPickTicket()==null) || 
             (this.commentForPickTicket!=null &&
              this.commentForPickTicket.equals(other.getCommentForPickTicket()))) &&
            ((this.customerCost==null && other.getCustomerCost()==null) || 
             (this.customerCost!=null &&
              this.customerCost.equals(other.getCustomerCost()))) &&
            ((this.freight==null && other.getFreight()==null) || 
             (this.freight!=null &&
              this.freight.equals(other.getFreight()))) &&
            ((this.lineComment==null && other.getLineComment()==null) || 
             (this.lineComment!=null &&
              this.lineComment.equals(other.getLineComment()))) &&
            ((this.partNumber==null && other.getPartNumber()==null) || 
             (this.partNumber!=null &&
              this.partNumber.equals(other.getPartNumber()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.unitOfMeasure==null && other.getUnitOfMeasure()==null) || 
             (this.unitOfMeasure!=null &&
              this.unitOfMeasure.equals(other.getUnitOfMeasure()))) &&
            ((this.usedPart==null && other.getUsedPart()==null) || 
             (this.usedPart!=null &&
              this.usedPart.equals(other.getUsedPart())));
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
        if (getCommentForPart() != null) {
            _hashCode += getCommentForPart().hashCode();
        }
        if (getCommentForPickTicket() != null) {
            _hashCode += getCommentForPickTicket().hashCode();
        }
        if (getCustomerCost() != null) {
            _hashCode += getCustomerCost().hashCode();
        }
        if (getFreight() != null) {
            _hashCode += getFreight().hashCode();
        }
        if (getLineComment() != null) {
            _hashCode += getLineComment().hashCode();
        }
        if (getPartNumber() != null) {
            _hashCode += getPartNumber().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getUnitOfMeasure() != null) {
            _hashCode += getUnitOfMeasure().hashCode();
        }
        if (getUsedPart() != null) {
            _hashCode += getUsedPart().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderLineItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "OrderLineItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commentForPart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "CommentForPart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commentForPickTicket");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "CommentForPickTicket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "CustomerCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "Freight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineComment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "LineComment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "PartNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "Quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitOfMeasure");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "UnitOfMeasure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usedPart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "UsedPart"));
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
