/**
 * 
 */
package pStrategy.storedata;
import pGeneral.DriverFunction;

/**
 * @author Brinda Rao
 *
 */
public class StoreData_Acc1 implements StoreData {

	@Override
	public void storeAccountValues() {
		// TODO Auto-generated method stub
		DriverFunction.d1.pin = DriverFunction.tmp_pin1;
		DriverFunction.d1.balance = DriverFunction.tmp_balance1;
		DriverFunction.d1.ID = DriverFunction.tmp_userID1;
         System.out.println();
         System.out.println("ACCOUNT DATA STORED SUCCESSFULLY.");
         System.out.println();
		
	}

}
