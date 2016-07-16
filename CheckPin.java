package pStates;
import pMDAEFSM.*;
/**
 * @author Brinda Rao
 *
 */
public class CheckPin extends State {
	
	public CheckPin(MDAEFSM m)
	{
		//Construct method
		mda = m;
	}

	//The function definitions along with their respective implementations
	@Override
	public void Open(){
		
		System.out.println();
		System.out.println("Operation open is not available. You already opened the account.");
		System.out.println();
	};
	
	@Override
	public void Login(){
		
		System.out.println();
		System.out.println("Operation Login is not available. You already Logged into the account.");
		System.out.println();
	};
	
	@Override
	public void IncorrectLogin(){
		
		System.out.println();
		System.out.println("Operation is not available.");
		System.out.println();
		
	};
	
	@Override
	public void IncorrectPin(int max){
		//check if the attempts made is less than max
		if (mda.attempts < max)
		{
			//if less, increment the attemps
			mda.attempts++;
			mda.op.IncorrectPinMsg();
		}
		else if(mda.attempts == max)
		{
			//if its equal
			mda.ChangeState(1); //Change to Idle state
			mda.op.IncorrectPinMsg();
			mda.op.TooManyAttemptsMsg();
			//reinitialise the value of attempts to 0
			mda.attempts = 0;
		}
		
	};
	
	@Override
	public void CorrectPinAboveMin(){
		
		mda.ChangeState(3); //Change to Ready state
		mda.op.DisplayMenu();
	};
	
	@Override
	public void CorrectPinBelowMin(){
		
		mda.ChangeState(4); //Change to OverDrawn State
		mda.op.DisplayMenu();
	};
	
	@Override
	public void Deposit(){
		
		System.out.println();
		System.out.println("PIN is not entered. Operation deposit is not available");
		System.out.println();
	};
	
	@Override
	public void BelowMinBalance(){
		System.out.println();
		System.out.println("Operation is not available.");
		System.out.println();
	};
	
	@Override
	public void AboveMinBalance(){
		
		System.out.println();
		System.out.println("Operation is not available. in checkpin");
		System.out.println();
	};
	
	@Override
	public void Logout(){
		
		mda.ChangeState(1); //change to Idle state
		//mda.Logout();
	};
	
	@Override
	public void Balance(){
		
		System.out.println();
		System.out.println("PIN is not entered. Operation Balance is not available");
		System.out.println();
	};
	
	@Override
	public void Withdraw(){
		
		System.out.println();
		System.out.println("PIN is not entered. Operation Withdraw is not available");
		System.out.println();
	};
	
	@Override
	public void WithdrawBelowMinBalance(){
		
		System.out.println();
		System.out.println("Operation is not available.");
		System.out.println();
	};
	
	@Override
	public void NoFunds(){
		
		System.out.println();
		System.out.println("Operation is not available.");
		System.out.println();
	};
	
	@Override
	public void Lock(){
		
		System.out.println();
		System.out.println("PIN is not entered. Operation Lock is not available");
		System.out.println();
	};
	
	@Override
	public void IncorrectLock(){
		
		System.out.println();
		System.out.println("Operation is not available.");
		System.out.println();
	};
	
	@Override
	public void Unlock(){
		
		System.out.println();
		System.out.println("PIN is not entered. Operation Unlock is not available");
		System.out.println();
	};
	
	@Override
	public void IncorrectUnlock(){
		
		System.out.println();
		System.out.println("Operation is not available.");
		System.out.println();
	};
	
	@Override
	public void Suspend(){
		
		System.out.println();
		System.out.println("PIN is not entered. Operation Suspend is not available");
		System.out.println();
	};
	
	@Override
	public void Activate(){
		
		System.out.println();
		System.out.println("PIN is not entered. Operation Activate is not available");
		System.out.println();
	};
	
	@Override
	public void Close(){
		
		System.out.println();
		System.out.println("PIN is not entered. Operation Close is not available");
		System.out.println();
	};
}
