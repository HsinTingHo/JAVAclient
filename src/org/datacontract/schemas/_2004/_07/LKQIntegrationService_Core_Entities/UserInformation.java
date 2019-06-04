/**
 * UserInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities;

public class UserInformation  implements java.io.Serializable {
    private java.lang.String accountNumber;

    private org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.AccountNumberBusinessType businessTypeForAccountNumber;

    private java.lang.String userName;

    private java.lang.String userPassword;

    private java.lang.String verificationCode;

    public UserInformation() {
    }

    public UserInformation(
           java.lang.String accountNumber,
           org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.AccountNumberBusinessType businessTypeForAccountNumber,
           java.lang.String userName,
           java.lang.String userPassword,
           java.lang.String verificationCode) {
           this.accountNumber = accountNumber;
           this.businessTypeForAccountNumber = businessTypeForAccountNumber;
           this.userName = userName;
           this.userPassword = userPassword;
           this.verificationCode = verificationCode;
    }


    /**
     * Gets the accountNumber value for this UserInformation.
     * 
     * @return accountNumber
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this UserInformation.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the businessTypeForAccountNumber value for this UserInformation.
     * 
     * @return businessTypeForAccountNumber
     */
    public org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.AccountNumberBusinessType getBusinessTypeForAccountNumber() {
        return businessTypeForAccountNumber;
    }


    /**
     * Sets the businessTypeForAccountNumber value for this UserInformation.
     * 
     * @param businessTypeForAccountNumber
     */
    public void setBusinessTypeForAccountNumber(org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.AccountNumberBusinessType businessTypeForAccountNumber) {
        this.businessTypeForAccountNumber = businessTypeForAccountNumber;
    }


    /**
     * Gets the userName value for this UserInformation.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this UserInformation.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the userPassword value for this UserInformation.
     * 
     * @return userPassword
     */
    public java.lang.String getUserPassword() {
        return userPassword;
    }


    /**
     * Sets the userPassword value for this UserInformation.
     * 
     * @param userPassword
     */
    public void setUserPassword(java.lang.String userPassword) {
        this.userPassword = userPassword;
    }


    /**
     * Gets the verificationCode value for this UserInformation.
     * 
     * @return verificationCode
     */
    public java.lang.String getVerificationCode() {
        return verificationCode;
    }


    /**
     * Sets the verificationCode value for this UserInformation.
     * 
     * @param verificationCode
     */
    public void setVerificationCode(java.lang.String verificationCode) {
        this.verificationCode = verificationCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserInformation)) return false;
        UserInformation other = (UserInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.businessTypeForAccountNumber==null && other.getBusinessTypeForAccountNumber()==null) || 
             (this.businessTypeForAccountNumber!=null &&
              this.businessTypeForAccountNumber.equals(other.getBusinessTypeForAccountNumber()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.userPassword==null && other.getUserPassword()==null) || 
             (this.userPassword!=null &&
              this.userPassword.equals(other.getUserPassword()))) &&
            ((this.verificationCode==null && other.getVerificationCode()==null) || 
             (this.verificationCode!=null &&
              this.verificationCode.equals(other.getVerificationCode())));
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
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getBusinessTypeForAccountNumber() != null) {
            _hashCode += getBusinessTypeForAccountNumber().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getUserPassword() != null) {
            _hashCode += getUserPassword().hashCode();
        }
        if (getVerificationCode() != null) {
            _hashCode += getVerificationCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Entities", "UserInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Entities", "AccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessTypeForAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Entities", "BusinessTypeForAccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Entities", "AccountNumberBusinessType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Entities", "UserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Entities", "UserPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verificationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Entities", "VerificationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
