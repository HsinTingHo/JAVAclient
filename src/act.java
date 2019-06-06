import org.datacontract.schemas._2004._07.LKQIntegrationService_Core_Entities.CallResponseOfPartsWithQuantityResultSet4MCb5AyH;

public class act {

	public static void main(String[] args) {
	
		System.out.println("ya");
		String partNum = "";
		Integer qty = 2;
		Client c = new Client(partNum, qty);
		CallResponseOfPartsWithQuantityResultSet4MCb5AyH checkDropShipAvaRes = new CallResponseOfPartsWithQuantityResultSet4MCb5AyH();
		checkDropShipAvaRes = c.checkDropShipAvailability();
		System.out.println("Successful: "+checkDropShipAvaRes.getIsSuccessful());
		System.out.println("Value:" + checkDropShipAvaRes.getValue());
	}

}
