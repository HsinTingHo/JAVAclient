package LKQIntegrationService.LKQCorp;

public class OrderingSvcProxy implements LKQIntegrationService.LKQCorp.OrderingSvc {
  private String _endpoint = null;
  private LKQIntegrationService.LKQCorp.OrderingSvc orderingSvc = null;
  
  public OrderingSvcProxy() {
    _initOrderingSvcProxy();
  }
  
  public OrderingSvcProxy(String endpoint) {
    _endpoint = endpoint;
    _initOrderingSvcProxy();
  }
  
  private void _initOrderingSvcProxy() {
    try {
      orderingSvc = (new LKQIntegrationService.LKQCorp.OrderingLocator()).getBasicHttpBinding_OrderingSvc();
      if (orderingSvc != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)orderingSvc)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)orderingSvc)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (orderingSvc != null)
      ((javax.xml.rpc.Stub)orderingSvc)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public LKQIntegrationService.LKQCorp.OrderingSvc getOrderingSvc() {
    if (orderingSvc == null)
      _initOrderingSvcProxy();
    return orderingSvc;
  }
  
  public org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.CallResponseOfOrderingResponse4MCb5AyH createOrder(org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.OrderingRequest request) throws java.rmi.RemoteException{
    if (orderingSvc == null)
      _initOrderingSvcProxy();
    return orderingSvc.createOrder(request);
  }
  
  public org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.CallResponseOfArrayOfPartWithQuantityResult4MCb5AyH checkDropShipAvailability(org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.CheckDropShipAvailabilityRequest request) throws java.rmi.RemoteException{
    if (orderingSvc == null)
      _initOrderingSvcProxy();
    return orderingSvc.checkDropShipAvailability(request);
  }
  
  public org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.CallResponse reserveParts(org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.ReservePartsRequest request) throws java.rmi.RemoteException{
    if (orderingSvc == null)
      _initOrderingSvcProxy();
    return orderingSvc.reserveParts(request);
  }
  
  public org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.CallResponseOfPartsWithQuantityResultSet4MCb5AyH checkDropShipAvailabilityWithFreight(org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.CheckDropShipAvailabilityRequest request) throws java.rmi.RemoteException{
    if (orderingSvc == null)
      _initOrderingSvcProxy();
    return orderingSvc.checkDropShipAvailabilityWithFreight(request);
  }
  
  public org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.CallResponseOfArrayOfOutOfStockNationalAvailabilityResult4MCb5AyH checkOutOfStockNationalAvailability(org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.CheckOutOfStockNationalAvailabilityRequest request) throws java.rmi.RemoteException{
    if (orderingSvc == null)
      _initOrderingSvcProxy();
    return orderingSvc.checkOutOfStockNationalAvailability(request);
  }
  
  
}