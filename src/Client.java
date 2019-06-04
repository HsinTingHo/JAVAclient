import java.rmi.RemoteException; 
import LKQIntegrationService.LKQCorp.OrderingSvcProxy;

public class Client {
	LKQIntegrationService.LKQCorp.OrderingSvcProxy proxy = new LKQIntegrationService.LKQCorp.OrderingSvcProxy();
	try {
		proxy.checkDropShipAvailability(request);
	}
	catch(RemoteException e){
		e.printStackTrace();  
	}
}
