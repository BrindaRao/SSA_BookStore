
package pStates;

import pMDAEFSM.MDAEFSM;

/**
 * @author Brinda Rao
 *
 */
public class Start extends State {
	
	   //Define the constructor
		public Start(MDAEFSM m)
		{
			mda = m;
		}
		
		//Following are the implementations of the abstract functions from the abstract class State
		
		@Override
		public void Open(){
			
			mda.ChangeState(1);
			mda.op.StoreData();
		};
		
		@Override
		public void Login(){
			
			System.out.println();
			System.out.println("Please open the card first");
			System.out.println();
		};
		
		@Override
		public void IncorrectLogin(){
			
			System.out.println();
			System.out.println("Please open the card first");
			System.out.println();
		};
		
		@Override
		public void IncorrectPin(int max){
			
			System.out.println();
			System.out.println("Please open the card first");
			System.out.println();
		};
		
		@Override
		public void CorrectPinBelowMin(){
			
			System.out.println();
			System.out.println("Please open the card first");
			System.out.println();
			
		};
		
		@Override
		public void CorrectPinAboveMin(){
			System.out.println();
			System.out.println("Please open the card first");
			System.out.println();
			
		};
		
		@Override
		public void Deposit(){
			System.out.println();
			System.out.println("Please open the card first");
			System.out.println();
			
		};
		
		@Override
		public void BelowMinBalance(){
			
			System.out.println();
			System.out.println("Please open the card first");
			System.out.println();
		};
		
		@Override
		public void AboveMinBalance(){
			
			System.out.println();
			System.out.println("Please open the card first");
			System.out.println();
		};
		
		@Override
		public void Logout(){
			
			System.out.println();
			System.out.println("Please open the card first");
			System.out.println();
		};
		
		@Override
		public void Balance(){
			
			System.out.println();
			System.out.println("Please open the card first");
			System.out.println();
		};
		
		@Override
		public void Withdraw(){
			
			System.out.println();
			System.out.println("Please open the card first");
			System.out.println();
		};
		
		@Override
		public void WithdrawBelowMinBalance(){
			
			System.out.println();
			System.out.println("Please open the card first");
			System.out.println();
		};
		
		@Override
		public void NoFunds(){
			
			System.out.println();
			System.out.println("Please open the card first");
			System.out.println();
		};
		
		@Override
		public void Lock(){
			
			System.out.println();
			System.out.println("Please open the card first");
			System.out.println();
		};
		
		@Override
		public void IncorrectLock(){
			
			System.out.println();
			System.out.println("Please open the card first");
			System.out.println();
		};
		
		@Override
		public void Unlock(){
			
			System.out.println();
			System.out.println("Please open the card first");
			System.out.println();
		};
		
		@Override
		public void IncorrectUnlock(){
			
			System.out.println();
			System.out.println("Please open the card first");
			System.out.println();
		};
		
		@Override
		public void Suspend(){
			
			System.out.println();
			System.out.println("Please open the card first");
			System.out.println();
		};
		
		@Override
		public void Activate(){
			
			System.out.println();
			System.out.println("Please open the card first");
			System.out.println();
			
		};
		
		@Override
		public void Close(){
			
			System.out.println();
			System.out.println("Please open the card first");
			System.out.println();
		};

}
