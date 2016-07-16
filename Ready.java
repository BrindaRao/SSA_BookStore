
package pStates;

import pMDAEFSM.MDAEFSM;

/**
 * @author Brinda Rao
 *
 */
public class Ready extends State {
	
		//Define the constructor
		public Ready(MDAEFSM m)
		{
			mda = m;
		}
		
	//Following are the implementations of the abstract functions of the abstract class - State
		
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
		
		/*@Override
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
		};*/
		
		@Override
		public void withdraw(){
			mda.ChangeState(3);//Make a state change to Ready
			mda.op.MakeWithdraw();
			
		};
		
		/*@Override
		public void CorrectPinAboveMin(){
			
			System.out.println();
			System.out.println("Operation is not available.");
			System.out.println();
		}; */
		
		@Override
		public void Deposit(){
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
			
			mda.ChangeState(3); // Make a change to Ready for Account2
		}; 
		
		@Override
		public void Logout(){
			
			mda.ChangeState(1); //Make state change to Idle state
			//mda.Logout();
		};
		
		@Override
		public void Balance(){
			mda.op.DisplayBalance();
		};
		
		@Override
		public void Withdraw(){
			
			mda.ChangeState(5);//Make a state change to S1
			mda.op.MakeWithdraw();
			
		};
		
		
		@Override
		public void WithdrawBelowMinBalance(){
			
			System.out.println();
			System.out.println("Operation AboveMinBalance is not available. ");
			System.out.println();
		};
		
		@Override
		public void NoFunds(){
			
			mda.op.NoFundsMsg();
		};
		
		@Override
		public void Lock(){
			mda.ChangeState(6); //Change to locked state
			System.out.println(" Your Account is Locked Successfully.");
		};
		
		@Override
		public void IncorrectLock(){
			mda.op.IncorrectLockMsg();
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
			
			mda.ChangeState(7);
			//Change from Ready to Suspended State
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
