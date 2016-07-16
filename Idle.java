
package pStates;

import pMDAEFSM.MDAEFSM;

/**
 * @author Brinda Rao
 *
 */
public class Idle extends State {
	
	//Define the constructor
	public Idle(MDAEFSM m)
	{
		mda = m;
	}

	//Following are the implementation of the functions from the Abstract class
	@Override
	public void Open(){
		
		System.out.println();
		System.out.println("Operation open is not available. You already opened the account.");
		System.out.println();
	};
	
	@Override
	public void Login(){
		
		mda.attempts = 0;// Initialize the value of the attempts to be equal to zero on first invocation.
		mda.ChangeState(2);
		mda.op.PromptForPin();
		
	};
	
	@Override
	public void IncorrectLogin(){
		
		//No change in state as it is a loop to the same state
		mda.op.IncorrectIDMsg();
	};
	
	@Override
	public void IncorrectPin(int max){
		
		System.out.println();
		System.out.println("Please login first");
		System.out.println();
	};
	
	@Override
	public void CorrectPinBelowMin(){
		
		System.out.println();
		System.out.println("Please login first");
		System.out.println();
	};
	
	@Override
	public void CorrectPinAboveMin(){
		
		System.out.println();
		System.out.println("Please login first");
		System.out.println();
	};
	
	@Override
	public void Deposit(){
		
		System.out.println();
		System.out.println("Please login first");
		System.out.println();
	};
	
	@Override
	public void BelowMinBalance(){
		
		System.out.println();
		System.out.println("Please login first");
		System.out.println();
	};
	
	@Override
	public void AboveMinBalance(){
		
		System.out.println();
		System.out.println("Please login first");
		System.out.println();
	};
	
	@Override
	public void Logout(){
		
		System.out.println();
		System.out.println("Please login first");
		System.out.println();
	};
	
	@Override
	public void Balance(){
		
		System.out.println();
		System.out.println("Please login first");
		System.out.println();
	};
	
	@Override
	public void Withdraw(){
		
		System.out.println();
		System.out.println("Please login first");
		System.out.println();
	};
	
	@Override
	public void WithdrawBelowMinBalance(){
		
		System.out.println();
		System.out.println("Please login first");
		System.out.println();
	};
	
	@Override
	public void NoFunds(){
		
		System.out.println();
		System.out.println("Please login first");
		System.out.println();
	};
	
	@Override
	public void Lock(){
		
		System.out.println();
		System.out.println("Please login first");
		System.out.println();
	};
	
	@Override
	public void IncorrectLock(){
		
		System.out.println();
		System.out.println("Please login first");
		System.out.println();
	};
	
	@Override
	public void Unlock(){
		
		System.out.println();
		System.out.println("Please login first");
		System.out.println();
	};
	
	@Override
	public void IncorrectUnlock(){
		
		System.out.println();
		System.out.println("Please login first");
		System.out.println();
	};
	
	@Override
	public void Suspend(){
		
		System.out.println();
		System.out.println("Please login first");
		System.out.println();
	};
	
	@Override
	public void Activate(){
		
		System.out.println();
		System.out.println("Please login first");
		System.out.println();
	};
	
	@Override
	public void Close(){
		
		System.out.println();
		System.out.println("Please login first");
		System.out.println();
	};

}
