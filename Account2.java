package pATMAcc;
import pMDAEFSM.*;
import pGeneral.DriverFunction;
import pDataStorage.Acc2_Data;

/**
 * @author Brinda Rao
 *
 */
public class Account2 {

	/**
	 * This class has all the function related to Account2
	 */
	
	//Create an object for MDAEFSM
	MDAEFSM mda = new MDAEFSM();
	//Create an object for DataStorage
	Acc2_Data data2;
	//Define any of the declarations and values to be defined
	private static final int Max_Attempts = 2; // A maximum of 2 attempts can be made for Account1
	public static final int Min_Balance = 0; // A minimum balance of 0 is required.
	
	
	//Defining the functions:
	public void OPEN(int p,int y,int a){
		//initialise all the values passed into the temporary variables - for pin,userID and balance
		DriverFunction.tmp_pin2 = p;
		DriverFunction.tmp_userID2 = y;
		DriverFunction.tmp_balance2 = a;
		mda.Open();
	};
	
	public void PIN(int x){
		//create the object of Account2 DataObject
		data2 = DriverFunction.d2;
		if(x == data2.pin)
		{
			//check if the pin matches with the pin intialised
				mda.CorrectPinAboveMin();
			
		}
		else
		{
			//else, invoke IncorrectPin with max attempts
			mda.IncorrectPin(Max_Attempts);
		}
	};
	
	public void DEPOSIT(int d){
		//store the value passed into the deposit function into a temporary value
		DriverFunction.tmp_deposit2 = d;
		mda.Deposit();
	};
	
	public void WITHDRAW(int w){
		//Create the Account2 dataobject
		data2 = DriverFunction.d2;
		//store the value passed into the withdraw into a temporary value
		DriverFunction.tmp_withdraw2 = w;
		
		if(data2.balance > Min_Balance)
		{
			//if balance is greater than Minimum balance
			mda.withdraw();
			
		}
		else
		{
			mda.NoFunds();
		}
		
	};
	
	public void BALANCE(){
		//inovoke the balance method
		mda.Balance();
	};
	
	public void LOGIN(int y){
		//create the Account2 data object
		data2 = DriverFunction.d2;
		if(y == data2.ID)
		{
			//check if the id matches with the one that is passed
			mda.Login();
		}
		else
		{
			//else incorrectlogin
			mda.IncorrectLogin();
		}
	};
	
	public void LOGOUT(){
		//call logout function
		mda.Logout();
	};
	
	public void suspend(){
		//call suspend method
		mda.Suspend();
	};
	
	public void activate(){
		//call activate function
		mda.Activate();
	};
	
	public void close(){
		//call close function
		mda.Close();
	};
}
