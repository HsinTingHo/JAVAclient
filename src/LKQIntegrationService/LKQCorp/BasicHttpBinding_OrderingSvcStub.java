/**
 * BasicHttpBinding_OrderingSvcStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package LKQIntegrationService.LKQCorp;

public class BasicHttpBinding_OrderingSvcStub extends org.apache.axis.client.Stub implements LKQIntegrationService.LKQCorp.OrderingSvc {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[5];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("LKQCorp.LKQIntegrationService", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "OrderingRequest"), org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.OrderingRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Entities", "CallResponseOfOrderingResponse4MCb5AyH"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.CallResponseOfOrderingResponse4MCb5AyH.class);
        oper.setReturnQName(new javax.xml.namespace.QName("LKQCorp.LKQIntegrationService", "CreateOrderResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CheckDropShipAvailability");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("LKQCorp.LKQIntegrationService", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "CheckDropShipAvailabilityRequest"), org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.CheckDropShipAvailabilityRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Entities", "CallResponseOfArrayOfPartWithQuantityResult4MCb5AyH"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.CallResponseOfArrayOfPartWithQuantityResult4MCb5AyH.class);
        oper.setReturnQName(new javax.xml.namespace.QName("LKQCorp.LKQIntegrationService", "CheckDropShipAvailabilityResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReserveParts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("LKQCorp.LKQIntegrationService", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "ReservePartsRequest"), org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.ReservePartsRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Entities", "CallResponse"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.CallResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("LKQCorp.LKQIntegrationService", "ReservePartsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CheckDropShipAvailabilityWithFreight");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("LKQCorp.LKQIntegrationService", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "CheckDropShipAvailabilityRequest"), org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.CheckDropShipAvailabilityRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Entities", "CallResponseOfPartsWithQuantityResultSet4MCb5AyH"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.CallResponseOfPartsWithQuantityResultSet4MCb5AyH.class);
        oper.setReturnQName(new javax.xml.namespace.QName("LKQCorp.LKQIntegrationService", "CheckDropShipAvailabilityWithFreightResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CheckOutOfStockNationalAvailability");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("LKQCorp.LKQIntegrationService", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "CheckOutOfStockNationalAvailabilityRequest"), org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.CheckOutOfStockNationalAvailabilityRequest.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Entities", "CallResponseOfArrayOfOutOfStockNationalAvailabilityResult4MCb5AyH"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.CallResponseOfArrayOfOutOfStockNationalAvailabilityResult4MCb5AyH.class);
        oper.setReturnQName(new javax.xml.namespace.QName("LKQCorp.LKQIntegrationService", "CheckOutOfStockNationalAvailabilityResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

    }

    public BasicHttpBinding_OrderingSvcStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public BasicHttpBinding_OrderingSvcStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public BasicHttpBinding_OrderingSvcStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Entities", "AccountNumberBusinessType");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.AccountNumberBusinessType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Entities", "CallResponse");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.CallResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Entities", "CallResponseOfArrayOfOutOfStockNationalAvailabilityResult4MCb5AyH");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.CallResponseOfArrayOfOutOfStockNationalAvailabilityResult4MCb5AyH.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Entities", "CallResponseOfArrayOfPartWithQuantityResult4MCb5AyH");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.CallResponseOfArrayOfPartWithQuantityResult4MCb5AyH.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Entities", "CallResponseOfOrderingResponse4MCb5AyH");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.CallResponseOfOrderingResponse4MCb5AyH.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Entities", "CallResponseOfPartsWithQuantityResultSet4MCb5AyH");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.CallResponseOfPartsWithQuantityResultSet4MCb5AyH.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Entities", "UserInformation");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.UserInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Entities", "UserRequest");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.UserRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "ArrayOfOrderLineItem");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.OrderLineItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "OrderLineItem");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "OrderLineItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "ArrayOfOutOfStockNationalAvailabilityResult");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.OutOfStockNationalAvailabilityResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "OutOfStockNationalAvailabilityResult");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "OutOfStockNationalAvailabilityResult");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "ArrayOfPartWithFreight");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.PartWithFreight[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "PartWithFreight");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "PartWithFreight");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "ArrayOfPartWithQuantityRequest");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.PartWithQuantityRequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "PartWithQuantityRequest");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "PartWithQuantityRequest");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "ArrayOfPartWithQuantityResult");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.PartWithQuantityResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "PartWithQuantityResult");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "PartWithQuantityResult");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "CheckDropShipAvailabilityRequest");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.CheckDropShipAvailabilityRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "CheckOutOfStockNationalAvailabilityRequest");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.CheckOutOfStockNationalAvailabilityRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "KeyTrackOrderInfo");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.KeyTrackOrderInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "OrderCopyMethodType");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.OrderCopyMethodType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "OrderingRequest");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.OrderingRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "OrderingResponse");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.OrderingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "OrderLineItem");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.OrderLineItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "OrderPartType");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.OrderPartType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "OrderShipToAddress");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.OrderShipToAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "OutOfStockNationalAvailabilityResult");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.OutOfStockNationalAvailabilityResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "PartsWithQuantityResultSet");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.PartsWithQuantityResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "PartWithFreight");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.PartWithFreight.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "PartWithQuantityRequest");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.PartWithQuantityRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "PartWithQuantityResult");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.PartWithQuantityResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "ReservePartsRequest");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.ReservePartsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "SalvagePaymentInformation");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.SalvagePaymentInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/LKQIntegrationService.Core.Ordering.Entities", "ShippingAddressType");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.ShippingAddressType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.CallResponseOfOrderingResponse4MCb5AyH createOrder(org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.OrderingRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("LKQCorp.LKQIntegrationService/Ordering.svc/CreateOrder");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("LKQCorp.LKQIntegrationService", "CreateOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.CallResponseOfOrderingResponse4MCb5AyH) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.CallResponseOfOrderingResponse4MCb5AyH) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.CallResponseOfOrderingResponse4MCb5AyH.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.CallResponseOfArrayOfPartWithQuantityResult4MCb5AyH checkDropShipAvailability(org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.CheckDropShipAvailabilityRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("LKQCorp.LKQIntegrationService/Ordering.svc/CheckDropShipAvailability");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("LKQCorp.LKQIntegrationService", "CheckDropShipAvailability"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.CallResponseOfArrayOfPartWithQuantityResult4MCb5AyH) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.CallResponseOfArrayOfPartWithQuantityResult4MCb5AyH) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.CallResponseOfArrayOfPartWithQuantityResult4MCb5AyH.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.CallResponse reserveParts(org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.ReservePartsRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("LKQCorp.LKQIntegrationService/Ordering.svc/ReserveParts");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("LKQCorp.LKQIntegrationService", "ReserveParts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.CallResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.CallResponse) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.CallResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.CallResponseOfPartsWithQuantityResultSet4MCb5AyH checkDropShipAvailabilityWithFreight(org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.CheckDropShipAvailabilityRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("LKQCorp.LKQIntegrationService/Ordering.svc/CheckDropShipAvailabilityWithFreight");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("LKQCorp.LKQIntegrationService", "CheckDropShipAvailabilityWithFreight"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.CallResponseOfPartsWithQuantityResultSet4MCb5AyH) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.CallResponseOfPartsWithQuantityResultSet4MCb5AyH) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.CallResponseOfPartsWithQuantityResultSet4MCb5AyH.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.CallResponseOfArrayOfOutOfStockNationalAvailabilityResult4MCb5AyH checkOutOfStockNationalAvailability(org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.CheckOutOfStockNationalAvailabilityRequest request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("LKQCorp.LKQIntegrationService/Ordering.svc/CheckOutOfStockNationalAvailability");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("LKQCorp.LKQIntegrationService", "CheckOutOfStockNationalAvailability"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.CallResponseOfArrayOfOutOfStockNationalAvailabilityResult4MCb5AyH) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.CallResponseOfArrayOfOutOfStockNationalAvailabilityResult4MCb5AyH) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.CallResponseOfArrayOfOutOfStockNationalAvailabilityResult4MCb5AyH.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
