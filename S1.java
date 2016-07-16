package pStates;

import pMDAEFSM.MDAEFSM;

/**
 * @author Brinda Rao
 *
 */
public class S1 extends State {
	
		//Define the constructor
		public S1(MDAEFSM m)
		{
			mda = m;
		}
		
		//Following are the implementations of all the abstract functions from the abstract class - State
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
			
			System.out.println();
			System.out.println("Operation is not available.");
			System.out.println();
		};
		
		@Override
		public void CorrectPinBelowMin(){
			
			System.out.println();
			System.out.println("Operation is not available.");
			System.out.println();
		};
		
		@Override
		public void CorrectPinAboveMin(){
			
			System.out.println();
			System.out.println("Operation is not available.");
			System.out.println();
		};
		
		@Override
		public void Deposit(){
			
			System.out.println();
			System.out.println("Operation Deposit is not available. ");
			System.out.println();
		};
		
		@Override
		public void BelowMinBalance(){
			mda.ChangeState(4); //Make a state transition from S1 to Overdrawn state
			//No action
		};
		
		@Override
		public void AboveMinBalance(){
			mda.ChangeState(3); //Change the state to ready state
			//No action
		};
		
		@Override
		public void Logout(){
			
			System.out.println();
			System.out.println("Operation Logout is not available. ");
			System.out.println();
		};
		
		@Override
		public void Balance(){
			
			System.out.println();
			System.out.println("Operation Balance is not available in s1. ");
			System.out.println();
		};
		
		@Override
		public void Withdraw(){
			
			System.out.println();
			System.out.println("Operation Withdraw is not available. ");
			System.out.println();
		};
		
		@Override
		public void WithdrawBelowMinBalance(){
			mda.ChangeState(4);
			mda.op.Penalty();
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
			System.out.println("Operation Lock is not available. ");
			System.out.println();
		};
		
		@Override
		public void IncorrectLock(){
			System.out.println();
			System.out.println("Operation is not available. ");
			System.out.println();
		};
		
		@Override
		public void Unlock(){
			System.out.println();
			System.out.println("Operation Unlock is not available. ");
			System.out.println();
		};
		
		@Override
		public void IncorrectUnlock(){
			System.out.println();
			System.out.println("Operation is not available. ");
			System.out.println();
		};
		
		@Override
		public void Suspend(){
			System.out.println();
			System.out.println("Operation Suspend is not available. ");
			System.out.println();
		};
		
		@Override
		public void Activate(){
			System.out.println();
			System.out.println("Operation Activate is not available. ");
			System.out.println();
		};
		
		@Override
		public void Close(){
			System.out.println();
			System.out.println("Operation Close is not available. ");
			System.out.println();
		};
}
