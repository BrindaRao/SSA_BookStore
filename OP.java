package pGeneral;
import pGeneral.DriverFunction;
import pAbstractFactory.AccountFactory;

/**
 * @author Brinda Rao
 *
 */
public class OP {

	//Define the abstract class object
	 public AccountFactory af;
	
	 public void StoreData()
	 {
		 //invocation of the corresponding functions
		 af = DriverFunction.af;
		 af.storeAccountData().storeAccountValues();
		 
	 }
	 
	 public void IncorrectIDMsg(){
		//invocation of the corresponding functions
		 af = DriverFunction.af;
		 af.showIncorrectIDMsg().showIncorrectIDMsg();
	 }
	 
	 public void IncorrectPinMsg()
	 {
		//invocation of the corresponding functions
		 af = DriverFunction.af;
		 af.showIncorectPinMsg().incorrectPinMsg();
	 }
	 
	 public void TooManyAttemptsMsg()
	 {
		//invocation of the corresponding functions
		 af = DriverFunction.af;
		 af.showManyAttemptsMsg().tooManyAttemptsMsg();
	 }
	 
	 public void DisplayMenu()
	 {
		//invocation of the corresponding functions
		 af = DriverFunction.af;
		 af.displayMenu().displayMenu();
	 }
	 
	 public void MakeDeposit()
	 {
		//invocation of the corresponding functions
		 af = DriverFunction.af;
		 af.makeDeposit().makeDeposit();
	 }
	 
	 public void DisplayBalance()
	 {
		//invocation of the corresponding functions
		 af = DriverFunction.af;
		 af.displayBalance().displayBalance();
	 }
	 
	 public void PromptForPin()
	 {
		//invocation of the corresponding functions
		 af = DriverFunction.af;
		 af.promptForPin().promptForPin();
	 }
	 
	 public void MakeWithdraw()
	 {
		//invocation of the corresponding functions
		 af = DriverFunction.af; 
		 af.withdraw().withdraw();
	 }
	 
	 public void Penalty()
	 {
		//invocation of the corresponding functions
		 af = DriverFunction.af;
		 af.chargePenalty().chargePenalty();
	 }
	 
	 public void IncorrectLockMsg()
	 {
		//invocation of the corresponding functions
		 af = DriverFunction.af;
		 af.showIncorrectLockMsg().incorrectLockMsg();
	 }
	 
	 public void IncorrectUnlockMsg()
	 {
		//invocation of the corresponding functions
		 af = DriverFunction.af;
		 af.showIncorrectUnlockMsg().incorrectUnlockMsg();
	 }
	 
	 public void NoFundsMsg()
	 {
		//invocation of the corresponding functions
		 af = DriverFunction.af;
		 af.showNoFundsMsg().noFundsMsg();
	 }
}

