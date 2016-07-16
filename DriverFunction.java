package pGeneral;
/**
 * This is the main function - The Driver Function
 */
import pAbstractFactory.AccountFactory;
import pAbstractFactory.AccountFactory1;
import pAbstractFactory.AccountFactory2;
import pATMAcc.Account1;
import pATMAcc.Account2;
import java.util.Scanner;
import pDataStorage.*;
/**
 * @author Brinda Rao
 *
 */
public class DriverFunction {

	
	
	public static AccountFactory	af; //declaring a AccountFActory object
	
	//Data Storage objects
	
	public static Acc1_Data				d1; //declaring the Account1 Data object
	public static Acc2_Data				d2; //declaring the Account2 Data object
	
	//Temporary data store for Account1
	
	public static String			tmp_pin1; //decalring a temporary object to store Pin for Account1
	public static String		    tmp_userID1; //declaring a temporary object to store UserID for Account1
	public static float				tmp_balance1; //declaring a temporary object to store balance for account1
	public static float				tmp_withdraw1; //declaring a temporary object to store the withdrawl amount for account
	public static float				tmp_deposit1; //declaring a temporary object to store the deposit amount for account1
	
	//Temporary data store for Account2
	
	public static int			    tmp_pin2; //declaring the temporary object to store pin for account2
	public static int				tmp_userID2;//declaring the temporary object to store userId for account2
	public static int				tmp_balance2;//declaring the temporary object to store balance for account2
	public static int				tmp_deposit2;//declaring the temporary object to store deposit for account2
	public static int				tmp_withdraw2;//declaring the temporary object to store withdraw for account2
	
	public static int				ch; //to store the user choice value
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("             Software Systems Architecture       ");
		System.out.println();
		System.out.println("                   CS586    Project");
		System.out.println();
		System.out.println("                                  Brinda Rao");
		System.out.println();
		System.out.println("                              CWID: A20353265");
		System.out.println();
		
		//For reading the input values given by the user
		Scanner scan = new Scanner(System.in);
		while (true)
		{
			//Run until user quits 
			System.out.println("  Select Account-1 or Account-2  ");
			System.out.println();
			System.out.println("          1. Account-1 ");
			System.out.println("          2. Account-2 ");
			System.out.println("          3. Quit");
			System.out.println();
			System.out.println("  Select one ATM:");
			ch = scan.nextInt();
			if (ch == 3)
			{
				//When user selects Quit
				System.out.print("Operation: Quit ");
				System.exit(0);
				//close the scan object as user will not be giving any input
				scan.close();
				//break from the while loop
				break;
			}
			else
			{
				//if not selected as Quit
				if (ch == 1)
				{
					//When Account-1 has been selected
					//Create Account-1 object
					Account1 acc1 = new Account1();
					//Create an object of AccountFactory1
					af = new AccountFactory1();
					//Create an object of DataStorage
					d1 = new Acc1_Data();
					
					
					//Declaring the data types for the Account1 usage
					String pin;
					String userID;
					float balance;
					float deposit;
					float withdraw;
					
					System.out.println();
					System.out.println("      Account-1");
					System.out.println("  MENU of Operations");
					System.out.println();
					System.out.println("   0. open (String , String , float)");
					System.out.println("   1. pin(String)");
					System.out.println("   2. deposit(float)");
					System.out.println("   3. withdraw(float)");
					System.out.println("   4. balance()");
					System.out.println("   5. login(String)");
					System.out.println("   6. logout()");
					System.out.println("   7. lock(String)");
					System.out.println("   8. unlock(String)");
					System.out.println("   9. exit()");
					System.out.println();	
					
					while(ch!=9)
					{
						//If Exit is not chosen. Continue executing the operations
						System.out.println("      Account-1 Execution    ");
						System.out.println();
						System.out.println("  Select Operation:");
						System.out.println("0-open,1-pin,2-deposit,3-withdraw,4-balance,5-login,6-logout,7-lock,8-unlock");
						//Read the input that the sender provides
						ch = scan.nextInt();
						System.out.println();
						
						switch (ch)
						{
						//Invocation of open() function of Account1
						case 0:
							System.out.println("OPERATION : open (String p, String y, float a)");
							System.out.println("Enter the value of the parameter p");
							//reading the pin value 
							pin = scan.next();
							System.out.println("Enter the value of the parameter y");
							//reading the userID value
							userID = scan.next();
							System.out.println("Enter the value of the parameter a");
							//reading the balance value
							balance = scan.nextFloat();
							//invoking the Account1's open function along with passing the input values from the user
							acc1.open(pin, userID, balance);
							scan.nextLine();
							System.out.println();
							break;
						//invocation of pin() function of Account1
						case 1:
							System.out.println("OPERATION : pin (String p)");
							System.out.println("Enter the value of the parameter p");
							//reading the input of pin
							pin = scan.next();
							//invoking the Account1's pin function along with passing the input value from user
							acc1.pin(pin);
							scan.nextLine();
							System.out.println();
							break;
						//invocation to deposit() function of Account1
						case 2:
							System.out.println("OPERATION : deposit (float d)");
							System.out.println("Enter the value of the parameter d");
							//reading the amount that the user inputs for the amount to be deposited
							deposit = scan.nextFloat();
							//invoking the Account1's deposit function along with passing the input value from the user
							acc1.deposit(deposit);
							scan.nextLine();
							System.out.println();
							break;
						//invocation to withdraw() function of Account1
						case 3:
							System.out.println("OPERATION : withdraw (float w)");
							System.out.println("Enter the value of the parameter w");
							//reading the amount that the user inputs for the amount to be withdrawn
							withdraw = scan.nextFloat();
							//invoking the Account1's withdraw function along with the amount given as input
							acc1.withdraw(withdraw);
							scan.nextLine();
							System.out.println();
							break;
						//invocation to balance() funtion of Account1	
						case 4:
							System.out.println("OPERATION : balance ()");
							acc1.balance();
							scan.nextLine();
							System.out.println();
							break;
						//invoking the login() function of Account1	
						case 5:
							System.out.println("OPERATION : login (String y)");
							System.out.println("Enter the value of the parameter y");
							//reading the input value
							userID = scan.next();
							acc1.login(userID);;
							scan.nextLine();
							System.out.println();
							break;
						//invoking the logout() function of Account1
						case 6:
							System.out.println("OPERATION : logout()");
							acc1.logout();
							scan.nextLine();
							System.out.println();
							break;
						//invoking the lock() function of Account1	
						case 7:
							System.out.println("OPERATION : lock (String x)");
							System.out.println("Enter the value of the parameter x");
							//reading the value for parameter x
							pin = scan.next();
							acc1.lock(pin);
							scan.nextLine();
							System.out.println();
							break;
						//invoking the unlock() function of Account1	
						case 8:
							System.out.println("OPERATION : unlock (String x)");
							System.out.println("Enter the value of the parameter x");
							//reading the value for parameter x
							pin = scan.next();
							acc1.unlock(pin);
							scan.nextLine();
							System.out.println();
							break;
						}
						
					}
					
				}
				if(ch==2)
				{
					//When Account-2 has been selected
					//Create Account-2 object
					Account2 acc2 = new Account2();
					//Create an object of AccountFactory2
					af = new AccountFactory2();
					//Create an object of DataStorage
					d2 = new Acc2_Data();
					
					
					//Declaring the data types for the Account2 usage
					int pin;
					int userID;
					int balance;
					int deposit;
					int withdraw;
					
					System.out.println();
					System.out.println("      Account-2");
					System.out.println("  MENU of Operations");
					System.out.println();
					System.out.println("   0. OPEN (int , int , int)");
					System.out.println("   1. PIN(int)");
					System.out.println("   2. DEPOSIT(int)");
					System.out.println("   3. WITHDRAW(int)");
					System.out.println("   4. BALANCE()");
					System.out.println("   5. LOGIN(int)");
					System.out.println("   6. LOGOUT()");
					System.out.println("   7. suspend");
					System.out.println("   8. activate");
					System.out.println("   9. close()");
					System.out.println();	
					
					while(ch!=9)
					{
						//When close() function is not selected. Continue exeucting
						System.out.println("      Account-2 Execution    ");
						System.out.println();
						System.out.println("  Select Operation:");
						System.out.println("0-OPEN,1-PIN,2-DEPOSIT,3-WITHDRAW,4-BALANCE,5-LOGIN,6-LOGOUT,7-suspend,8-activate,9-close");
						//reading the user's input 
						ch = scan.nextInt();
						System.out.println();
						
						switch (ch)
						{
						//invoking the OPEN() function of account2
						case 0:
							System.out.println("OPERATION : OPEN (int p, int y, int a)");
							System.out.println("Enter the value of the parameter p");
							//reading the user's input for pin
							pin = scan.nextInt();
							System.out.println("Enter the value of the parameter y");
							//reading the user's input for userID
							userID = scan.nextInt();
							System.out.println("Enter the value of the parameter a");
							//reading the user's input for balance
							balance = scan.nextInt();
							//invoking the Account2's OPEN function
							acc2.OPEN(pin, userID, balance);
							scan.nextLine();
							System.out.println();
							break;
							
						//Invoking the PIN() operation of Account2	
						case 1:
							System.out.println("OPERATION : PIN (int p)");
							System.out.println("Enter the value of the parameter p");
							//reading the user's input for pin
							pin = scan.nextInt();
							acc2.PIN(pin);
							scan.nextLine();
							System.out.println();
							break;
						
						//Invoking the DEPOSIT() operation of Account2
						case 2:
							System.out.println("OPERATION : DEPOSIT (int d)");
							System.out.println("Enter the value of the parameter d");
							//reading the user's input for the amount to be deposited
							deposit = scan.nextInt();
							acc2.DEPOSIT(deposit);
							scan.nextLine();
							System.out.println();
							break;
						
						//Invoking the WITHDRAW() operation of Account2
						case 3:
							System.out.println("OPERATION : WITHDRAW (int w)");
							System.out.println("Enter the value of the parameter w");
							//reading the user's input for the amount to be withdrawn
							withdraw = scan.nextInt();
							acc2.WITHDRAW(withdraw);
							scan.nextLine();
							System.out.println();
							break;
							//Invoking the BALANCE() operation of Account2	
						case 4:
							System.out.println("OPERATION : BALANCE ()");
							acc2.BALANCE();
							scan.nextLine();
							System.out.println();
							break;
							//Invoking the LOGIN() operation of Account2	
						case 5:
							System.out.println("OPERATION : LOGIN (int y)");
							System.out.println("Enter the value of the parameter y");
							userID = scan.nextInt();
							acc2.LOGIN(userID);
							scan.nextLine();
							System.out.println();
							break;
							//Invoking the LOGOUT() operation of Account2	
						case 6:
							System.out.println("OPERATION : LOGOUT()");
							acc2.LOGOUT();
							scan.nextLine();
							System.out.println();
							break;
							//Invoking the suspend() operation of Account2	
						case 7:
							System.out.println("OPERATION : suspend()");
							acc2.suspend();
							scan.nextLine();
							System.out.println();
							break;
							//Invoking the activate() operation of Account2	
						case 8:
							System.out.println("OPERATION : activate()");
							acc2.activate();
							scan.nextLine();
							System.out.println();
							break;
							//Invoking the close() operation of Account2
						case 9:
							System.out.println("OPERATION : close()");
							acc2.close();
							scan.nextLine();
							System.out.println();
							break;
							
						}
						
					}
					
				}
			}
		}

	}

}
