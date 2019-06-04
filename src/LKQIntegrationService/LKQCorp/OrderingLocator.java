/**
 * OrderingLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package LKQIntegrationService.LKQCorp;

public class OrderingLocator extends org.apache.axis.client.Service implements LKQIntegrationService.LKQCorp.Ordering {

    public OrderingLocator() {
    }


    public OrderingLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public OrderingLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_OrderingSvc
    private java.lang.String BasicHttpBinding_OrderingSvc_address = "https://lkqintegrationqc.ekeyconnect.com/Ordering.svc";

    public java.lang.String getBasicHttpBinding_OrderingSvcAddress() {
        return BasicHttpBinding_OrderingSvc_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_OrderingSvcWSDDServiceName = "BasicHttpBinding_Ordering.svc";

    public java.lang.String getBasicHttpBinding_OrderingSvcWSDDServiceName() {
        return BasicHttpBinding_OrderingSvcWSDDServiceName;
    }

    public void setBasicHttpBinding_OrderingSvcWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_OrderingSvcWSDDServiceName = name;
    }

    public LKQIntegrationService.LKQCorp.OrderingSvc getBasicHttpBinding_OrderingSvc() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_OrderingSvc_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_OrderingSvc(endpoint);
    }

    public LKQIntegrationService.LKQCorp.OrderingSvc getBasicHttpBinding_OrderingSvc(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            LKQIntegrationService.LKQCorp.BasicHttpBinding_OrderingSvcStub _stub = new LKQIntegrationService.LKQCorp.BasicHttpBinding_OrderingSvcStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_OrderingSvcWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_OrderingSvcEndpointAddress(java.lang.String address) {
        BasicHttpBinding_OrderingSvc_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (LKQIntegrationService.LKQCorp.OrderingSvc.class.isAssignableFrom(serviceEndpointInterface)) {
                LKQIntegrationService.LKQCorp.BasicHttpBinding_OrderingSvcStub _stub = new LKQIntegrationService.LKQCorp.BasicHttpBinding_OrderingSvcStub(new java.net.URL(BasicHttpBinding_OrderingSvc_address), this);
                _stub.setPortName(getBasicHttpBinding_OrderingSvcWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BasicHttpBinding_Ordering.svc".equals(inputPortName)) {
            return getBasicHttpBinding_OrderingSvc();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("LKQCorp.LKQIntegrationService", "Ordering");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("LKQCorp.LKQIntegrationService", "BasicHttpBinding_Ordering.svc"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_OrderingSvc".equals(portName)) {
            setBasicHttpBinding_OrderingSvcEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
