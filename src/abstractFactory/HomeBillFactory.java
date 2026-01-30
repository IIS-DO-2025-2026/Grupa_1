package abstractFactory;

import simpleFactory.Bill;
import simpleFactory.ElectricityBill;
import simpleFactory.GasBill;
import simpleFactory.UtilityBill;

public class HomeBillFactory extends BillFactory{

	@Override
	public Bill createBill(String type) {
		if(type.equals("kindergarten"))
			return new KindergartenBill();
		else if(type.equals("housecleaning"))
			return new HousecleaningBill();
		else
			return null;
	}

}
