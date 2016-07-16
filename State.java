
package pStates;
import pMDAEFSM.*;

/**
 * @author Brinda Rao
 *
 */
public abstract class State {

	/**
	 * This class has all the abstract functions that will be used by the other states defined.
	 */
	
	//Define the object for MDAEFSM
	MDAEFSM mda;
	//Define the object for the OP class
	//TODO!!!
	
	//Define all the abstract functions used for this project
	public void Open(){
		
	};
	
	public void Login(){
		
	};
	
	public void IncorrectLogin(){
		
	};
	
	public void IncorrectPin(int max){
		
	};
	
	public void CorrectPinBelowMin(){
		
	};
	
	public void CorrectPinAboveMin(){
		
	};
	
	public void Deposit(){
		
	};
	
	public void BelowMinBalance(){
		
	};
	
	public void AboveMinBalance(){
		
	};
	
	public void Logout(){
		
	};
	
	public void Balance(){
		
	};
	
	public void Withdraw(){
		
	};
	
	public void withdraw(){
		
	};
	
	public void WithdrawBelowMinBalance(){
		
	};
	
	public void NoFunds(){
		
	};
	
	public void Lock(){
		
	};
	
	public void IncorrectLock(){
		
	};
	
	public void Unlock(){
		
	};
	
	public void IncorrectUnlock(){
		
	};
	
	public void Suspend(){
		
	};
	
	public void Activate(){
		
	};
	
	public void Close(){
		
	};
	}