
package pStates;

import pMDAEFSM.MDAEFSM;

/**
 * @author Brinda Rao
 *
 */
public class Suspended extends State{
	
		//Define the constructor
		public Suspended(MDAEFSM m)
		{
			mda = m;
		}
		
		//Following are the implementations of the abstract functions of the abstract class State
		
		@Override
		public void Open(){
			
			System.out.println();
			System.out.println("You account is suspended, please activate it first.");
			System.out.println();
		};
		
		@Override
		public void Login(){
			
			System.out.println();
			System.out.println("You account is suspended, please activate it first.");
			System.out.println();
		};
		
		@Override
		public void IncorrectLogin(){
			
			System.out.println();
			System.out.println("You account is suspended, please activate it first.");
			System.out.println();
		};
		
		@Override
		public void IncorrectPin(int max){
			
			System.out.println();
			System.out.println("You account is suspended, please activate it first.");
			System.out.println();
		};
		
		@Override
		public void CorrectPinBelowMin(){
			
			System.out.println();
			System.out.println("You account is suspended, please activate it first.");
			System.out.println();
		};
		
		@Override
		public void CorrectPinAboveMin(){
			
			System.out.println();
			System.out.println("You account is suspended, please activate it first.");
			System.out.println();
		};
		
		@Override
		public void Deposit(){
			
			System.out.println();
			System.out.println("You account is suspended, please activate it first.");
			System.out.println();
		};
		
		@Override
		public void BelowMinBalance(){
			
			System.out.println();
			System.out.println("You account is suspended, please activate it first.");
			System.out.println();
		};
		
		@Override
		public void AboveMinBalance(){
			
			System.out.println();
			System.out.println("You account is suspended, please activate it first.");
			System.out.println();
		};
		
		@Override
		public void Logout(){
			
			System.out.println();
			System.out.println("You account is suspended, please activate it first.");
			System.out.println();
		};
		
		@Override
		public void Balance(){
			mda.op.DisplayBalance();
		};
		
		@Override
		public void Withdraw(){
			
			System.out.println();
			System.out.println("You account is suspended, please activate it first.");
			System.out.println();
		};
		
		@Override
		public void WithdrawBelowMinBalance(){
			
			System.out.println();
			System.out.println("You account is suspended, please activate it first.");
			System.out.println();
		};
		
		@Override
		public void NoFunds(){
			
			System.out.println();
			System.out.println("You account is suspended, please activate it first.");
			System.out.println();
		};
		
		@Override
		public void Lock(){
			
			System.out.println();
			System.out.println("You account is suspended, please activate it first.");
			System.out.println();
		};
		
		@Override
		public void IncorrectLock(){
			
			System.out.println();
			System.out.println("You account is suspended, please activate it first.");
			System.out.println();
		};
		
		@Override
		public void Unlock(){
			
			System.out.println();
			System.out.println("You account is suspended, please activate it first.");
			System.out.println();
		};
		
		@Override
		public void IncorrectUnlock(){
			
			System.out.println();
			System.out.println("You account is suspended, please activate it first.");
			System.out.println();
		};
		
		@Override
		public void Suspend(){
			
			System.out.println();
			System.out.println("You account is suspended already. Activate it.");
			System.out.println();
		};
		
		@Override
		public void Activate(){
			
			mda.ChangeState(3);
			System.out.println();
			System.out.println("ACCOUNT ACTIVATED.");
			System.out.println();
			//No Change
		};
		
		@Override
		public void Close(){
			
			System.out.println();
			System.out.println("You have exited, press 1 to login.");
			System.out.println();
			System.exit(0); // Exiting from the execution of the function
		};
}
