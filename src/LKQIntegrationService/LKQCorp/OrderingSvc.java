/**
 * OrderingSvc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package LKQIntegrationService.LKQCorp;

public interface OrderingSvc extends java.rmi.Remote {
    public org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.CallResponseOfOrderingResponse4MCb5AyH createOrder(org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.OrderingRequest request) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.CallResponseOfArrayOfPartWithQuantityResult4MCb5AyH checkDropShipAvailability(org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.CheckDropShipAvailabilityRequest request) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.CallResponse reserveParts(org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.ReservePartsRequest request) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.CallResponseOfPartsWithQuantityResultSet4MCb5AyH checkDropShipAvailabilityWithFreight(org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.CheckDropShipAvailabilityRequest request) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.CallResponseOfArrayOfOutOfStockNationalAvailabilityResult4MCb5AyH checkOutOfStockNationalAvailability(org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.CheckOutOfStockNationalAvailabilityRequest request) throws java.rmi.RemoteException;
}
