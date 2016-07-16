
package pStates;

import pMDAEFSM.MDAEFSM;

/**
 * @author Brinda Rao
 *
 */
public class Overdrawn extends State{

	//Define the constructor
		public Overdrawn(MDAEFSM m)
		{
			mda = m;
		}
		
	//Following are the implementations of the abstract functions from the abstarct class
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
			System.out.println("Operation is not available. You already Logged into the account.");
			System.out.println();
		};
		
		@Override
		public void IncorrectPin(int max){
			
			System.out.println();
			System.out.println("Operation is not available. You already Logged into the account.");
			System.out.println();
		};
		
		@Override
		public void CorrectPinBelowMin(){
			
			System.out.println();
			System.out.println("Operation is not available. You already Logged into the account.");
			System.out.println();
		};
		
		@Override
		public void CorrectPinAboveMin(){
			
			System.out.println();
			System.out.println("Operation is not available. You already Logged into the account.");
			System.out.println();
		};
		
		@Override
		public void Deposit(){
			mda.ChangeState(5); //Make a state change to S1
			mda.op.MakeDeposit();
			
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
			System.out.println("Operation is not available.");
			System.out.println();
		};
		
		@Override
		public void Logout(){
			mda.ChangeState(1);
			//mda.Logout();
		};
		
		@Override
		public void Balance(){
			mda.op.DisplayBalance();
		};
		
		@Override
		public void Withdraw(){
			
			mda.op.NoFundsMsg();
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
			mda.ChangeState(6); //Make a state change from Overdrawn to Locked
			//No Action
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
			System.out.println("Operation Unlock is not available. ");
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

