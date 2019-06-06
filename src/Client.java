import java.rmi.RemoteException; 
import LKQIntegrationService.LKQCorp.OrderingSvcProxy;
import org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.*;
import org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Ordering_Entities.*;

public class Client {
	private LKQIntegrationService.LKQCorp.OrderingSvcProxy proxy = new LKQIntegrationService.LKQCorp.OrderingSvcProxy();

	//User credential
	private String AccountNumber = "804970", UserName = "804970.pdiautoparts", UserPassword  = "pdiap", VerificationCode  = "a1f8e53a-6614-4c59-96e9-93932b79f015";
	private UserInformation userInfo = new UserInformation();
	
	//Part to order
	private PartWithQuantityRequest[] partList = new PartWithQuantityRequest[1]; 
	
	public Client(String partNumber, int qty) {
		//set up user info and part to order
		this.partList[0] = new PartWithQuantityRequest();
		this.partList[0].setPartNumber(partNumber);
		this.partList[0].setQuantity(qty);
		this.userInfo.setAccountNumber(this.AccountNumber);
		this.userInfo.setUserName(this.UserName);
		this.userInfo.setUserPassword(this.UserPassword);
		this.userInfo.setVerificationCode(this.VerificationCode);
	}
	
	public CallResponseOfPartsWithQuantityResultSet4MCb5AyH checkDropShipAvailability() {
			
		//set up request
		CheckDropShipAvailabilityRequest request = new CheckDropShipAvailabilityRequest();
		request.setPartsWithQuantity(partList);
		request.setUserRequestInfo(this.userInfo);
		
		//set response
		CallResponseOfPartsWithQuantityResultSet4MCb5AyH res = new CallResponseOfPartsWithQuantityResultSet4MCb5AyH();
		try {
			proxy.checkDropShipAvailability(request);
		}
		catch(RemoteException e){
			e.printStackTrace();  
		}
		return res;
	}
	
}
