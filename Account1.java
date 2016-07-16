package pATMAcc;
import pMDAEFSM.*;
import pGeneral.DriverFunction;
import pDataStorage.Acc1_Data;

/**
 * @author Brinda Rao
 *
 */
public class Account1 {

	/**
	 * This class has all the function related to Account1
	 */
	
	
		//Create an object for MDAEFSM
	MDAEFSM mda = new MDAEFSM();
		//Create an object for DataStorage
	Acc1_Data data1 ;
	//Define any of the declarations and values to be defined
	private static final int Max_Attempts = 3; // A maximum of 3 attempts can be made for Account1
	public static final float Min_Balance = 500; // A minimum balance of 500 is required.
	public static final float Penalty = 20; // An amount of 20 is considered as penalty
	
	//Function definitions
	public void open(String p,String y,float a)
	{
		//initialise all the values passed into the temporary variables - for pin,userID and balance
		DriverFunction.tmp_pin1 = p;
		DriverFunction.tmp_userID1 = y;
		DriverFunction.tmp_balance1 = a;
		//invoke Open() function of MDAEFSM
		mda.Open();
		
	};
	
	public void pin(String x){
		//create the object of Account1 DataObject
		data1 = DriverFunction.d1;
		//check if the pin passed and initialised matches
		if(x.equals(data1.pin))
		{
			//check if the balance is above the minimum balance defined for Account1 (i.e., $500)
			if(data1.balance > Min_Balance)
			{
				mda.CorrectPinAboveMin();
			}
			else
			{
				mda.CorrectPinBelowMin();
			}
		}
		else
		{
			//if pin dont match,invoke incorretpin method of MDAEDSM by passing the Max attempts (3)
			mda.IncorrectPin(Max_Attempts);
		}
	};
	
	public void deposit(float d){
		
		data1= DriverFunction.d1;
		//initialise the value sent to deposit into temporary variable
		DriverFunction.tmp_deposit1 = d;
		mda.Deposit();
		//if the balance is above min balance invoke the below function, if not execute the function in else part
		if(data1.balance > Min_Balance)
		{
			mda.AboveMinBalance();
		}
		else
		{
			mda.BelowMinBalance();
		}
		
	};
	
	public void withdraw(float w){
		data1 = DriverFunction.d1;
		//save the data sent to withdraw function into a temporary variable
		DriverFunction.tmp_withdraw1 = w;
		mda.Withdraw();
		//check if the balance is greater than min balance,if yes execute the function AboveMinBalance else invoke WithdrawBelowMinBalance
		if(data1.balance > Min_Balance)
		{
			mda.AboveMinBalance();
		}
		else
		{
			mda.WithdrawBelowMinBalance();
		}
	};
	
	public void balance(){
		//invoke the balance to display the amount
		mda.Balance();
	};
	
	public void login(String y){
		data1 = DriverFunction.d1;
		//check if the user input value is equal to the value intitalised
		if( y.equals(data1.ID))
		{
			//if valid, login
			mda.Login();
		}
		else
		{
			//else, invoke incorrectLogin
			mda.IncorrectLogin();
		}
	};
	
	public void logout(){
		//invoke logout function
		mda.Logout();
	};
	
	public void lock(String x){
		data1 = DriverFunction.d1;
		//check if the pin entered and initialised value is same
		if(x.equals(data1.pin))
		{
			//if true, invoke lock
			mda.Lock();
		}
		else
		{
			//if not invoke incorrectLock
			mda.IncorrectLock();
		}
	};
	
	public void unlock(String x){
		data1 = DriverFunction.d1;
		//check if the pin matches with the entered value and the one that is initialised
		if(x.equals(data1.pin))
		{
			//if equal, unlock the card
			mda.Unlock();
			if(data1.balance > Min_Balance)
			{
				//if the balance is greater than minimum balance
				mda.AboveMinBalance();
			}
			else
			{
				//if balance is below the minimum balance
				mda.BelowMinBalance();
			}
		}
		else
		{
			//if pin dont match
			mda.IncorrectUnlock();
		}
	};
}
