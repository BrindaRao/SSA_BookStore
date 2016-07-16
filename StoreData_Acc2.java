/**
 * 
 */
package pStrategy.storedata;

import pGeneral.DriverFunction;

/**
 * @author Brinda Rao
 *
 */
public class StoreData_Acc2 implements StoreData {

	/* (non-Javadoc)
	 * @see pStrategy.storedata.StoreData#storeAccountValues()
	 */
	@Override
	public void storeAccountValues() {
		// TODO Auto-generated method stub
		DriverFunction.d2.pin = DriverFunction.tmp_pin2;
		DriverFunction.d2.balance = DriverFunction.tmp_balance2;
		DriverFunction.d2.ID = DriverFunction.tmp_userID2;
         System.out.println();
         System.out.println("ACCOUNT DATA STORED SUCCESSFULLY.");
         System.out.println();

	}

}
