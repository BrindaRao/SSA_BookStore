
package pStates;

import pMDAEFSM.MDAEFSM;

/**
 * @author Brinda Rao
 *
 */
public class Locked extends State {

	//Define the constructor
		public Locked(MDAEFSM m)
		{
			mda = m;
		}
		
	//Following are the implementations of the abstract class State
		
		@Override
		public void Open(){
			
			System.out.println();
			System.out.println("Operation open is not available. You already opened the account and is locked.");
			System.out.println();
		};
		
		@Override
		public void Login(){
			

			System.out.println();
			System.out.println("Operation Login is not available. Your account is locked");
			System.out.println();
		};
		
		@Override
		public void IncorrectLogin(){
			
			System.out.println();
			System.out.println("Operation IncorrectLogin is not available. You already Logged into the account.");
			System.out.println();
		};
		
		@Override
		public void IncorrectPin(int max){
			
			System.out.println();
			System.out.println("Operation IncorrectPin is not available. You already Logged into the account.");
			System.out.println();
		};
		
		@Override
		public void CorrectPinBelowMin(){
			
			System.out.println();
			System.out.println("Operation CorrectPinBelowMin is not available. ");
			System.out.println();
			
		};
		
		@Override
		public void CorrectPinAboveMin(){
			
			System.out.println();
			System.out.println("Operation CorrectPinAboveMin is not available. ");
			System.out.println();
		};
		
		@Override
		public void Deposit(){
			
			System.out.println();
			System.out.println("You account is locked, please unlock it first.");
			System.out.println();
		};
		
		@Override
		public void BelowMinBalance(){
			
			System.out.println();
			System.out.println("You account is locked, please unlock it first.");
			System.out.println();
		};
		
		@Override
		public void AboveMinBalance(){
			
			System.out.println();
			System.out.println("You account is locked, please unlock it first.");
			System.out.println();
		};
		
		@Override
		public void Logout(){
			System.out.println();
			System.out.println("You account is locked, please unlock it first.");
			System.out.println();
		};
		
		@Override
		public void Balance(){
			
			System.out.println();
			System.out.println("You account is locked, please unlock it first.");
			System.out.println();
		};
		
		@Override
		public void Withdraw(){
			
			System.out.println();
			System.out.println("You account is locked, please unlock it first.");
			System.out.println();
		};
		
		@Override
		public void WithdrawBelowMinBalance(){
			
			System.out.println();
			System.out.println("You account is locked, please unlock it first.");
			System.out.println();
		};
		
		@Override
		public void NoFunds(){
			
			System.out.println();
			System.out.println("You account is locked, please unlock it first.");
			System.out.println();
		};
		
		@Override
		public void Lock(){
			
			System.out.println();
			System.out.println("You account is locked already, please unlock it first.");
			System.out.println();
		};
		
		@Override
		public void IncorrectLock(){
			
			System.out.println();
			System.out.println("You account is locked already, please unlock it first.");
			System.out.println();
		};
		
		@Override
		public void Unlock(){
			mda.ChangeState(5); //Change the state to S1
		};
		
		@Override
		public void IncorrectUnlock(){
			mda.op.IncorrectUnlockMsg();
			//No Action
		};
		
		@Override
		public void Suspend(){
			
			System.out.println();
			System.out.println("You account is locked, please unlock it first.");
			System.out.println();
		};
		
		@Override
		public void Activate(){
			
			System.out.println();
			System.out.println("You account is locked, please unlock it first.");
			System.out.println();
		};
		
		@Override
		public void Close(){
			
			System.out.println();
			System.out.println("You account is locked, please unlock it first.");
			System.out.println();
		};
}
