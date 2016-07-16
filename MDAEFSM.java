package pMDAEFSM;
import pGeneral.OP;
import pStates.*;
/**
 * @author Brinda Rao
 *
 */
public class MDAEFSM {

		/**
		 * This is a context class that is majorly used to make changes in the states. This class will implement the STATE pattern,as per requirement
		 */
	
	//Declare all the things that is required.
	//declaring the state list which is of 8 in number
	public State[] sList = new State[8];
	//Declare the object of the abstract State class
	public State s;
	//initialize the number of attempts to be equal to zero
	public int attempts = 0;
	//Create an object of OP class
	public OP op = new OP();
	
	//Create the states list that represents which state is which object's position
	public MDAEFSM()
	{
		//Initialising the states 
		sList[0] = new Start(this);
		sList[1] = new Idle(this);
		sList[2] = new CheckPin(this);
		sList[3] = new Ready(this);
		sList[4] = new Overdrawn(this);
		sList[5] = new S1(this);
		sList[6] = new Locked(this);
		sList[7] = new Suspended(this);
		//Set the start state as the pointer to the State object
		s = sList[0];
		
	}
		//Change of the states is taken care by the following function using the De-centralized state pattern
		public void ChangeState(int state){
			s=sList[state];
		};
		
		//Invoking the events such that they will invoke the respective function based on the state 's'

		public void Open(){
			//invoke the respective states function
			s.Open();
		};
		
	
		public void Login(){
			//invoke the respective states function
			s.Login();
		};
		
		
		public void IncorrectLogin(){
			//invoke the respective states function
			s.IncorrectLogin();
			
		};
		
		
		public void IncorrectPin(int max){
			//invoke the respective states function
			s.IncorrectPin(max);
		};
		
		
		public void CorrectPinBelowMin(){
			//invoke the respective states function
			s.CorrectPinBelowMin();
		};
		
		
		public void CorrectPinAboveMin(){
			//invoke the respective states function
			s.CorrectPinAboveMin();
		};
		
		
		public void Deposit(){
			//invoke the respective states function
			s.Deposit();
		};
		
		
		public void BelowMinBalance(){
			//invoke the respective states function
			s.BelowMinBalance();
		};
		
		
		public void AboveMinBalance(){
			//invoke the respective states function
			s.AboveMinBalance();
		};
		
		
		public void Logout(){
			//invoke the respective states function
			s.Logout();
		};
		
		
		public void Balance(){
			//invoke the respective states function
			s.Balance();
		};
		
		
		public void Withdraw(){
			//invoke the respective states function
			s.Withdraw();
		};
		
		
		public void WithdrawBelowMinBalance(){
			//invoke the respective states function
			s.WithdrawBelowMinBalance();
		};
		
		
		public void NoFunds(){
			//invoke the respective states function
			s.NoFunds();
		};
		
		
		public void Lock(){
			//invoke the respective states function
			s.Lock();
		};
		
		
		public void withdraw(){
			//invoke the respective states function
			s.withdraw();
		};
		
		public void IncorrectLock(){
			//invoke the respective states function
			s.IncorrectLock();
		};
		
		
		public void Unlock(){
			//invoke the respective states function
			s.Unlock();
		};
		
		
		public void IncorrectUnlock(){
			//invoke the respective states function
			s.IncorrectUnlock();
		};
		
		
		public void Suspend(){
			//invoke the respective states function
			s.Suspend();
		};
		
		
		public void Activate(){
			//invoke the respective states function
			s.Activate();
		};
		
		
		public void Close(){
			//invoke the respective states function
			s.Close();
		};
		

	
			
}
