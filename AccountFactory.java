/**
 * 
 */
package pAbstractFactory;
import pStrategy.storedata.StoreData;
import pStrategy.displaybalance.DisplayBalance;
import pStrategy.displayMenu.DisplayMenu;
import pStrategy.funds.NoFunds;
import pStrategy.incorrectIDmsg.IncorrectIDMsg;
import pStrategy.incorrectLock.IncorrectLock;
import pStrategy.incorrectPin.IncorrectPin;
import pStrategy.incorrectUnlock.IncorrectUnlock;
import pStrategy.makeDeposit.MakeDeposit;
import pStrategy.makeWithdraw.MakeWithdraw;
import pStrategy.manyAttempts.ManyAttempts;
import pStrategy.penalty.ChargePenalty;
import pStrategy.promptPin.PromptPin;
/**
 * @author Brinda Rao
 *
 */
public interface AccountFactory {

	public IncorrectIDMsg showIncorrectIDMsg();
	
	public StoreData storeAccountData();
	
	public DisplayBalance displayBalance();
	
	public DisplayMenu displayMenu();
	
	public NoFunds showNoFundsMsg();
	
	public IncorrectLock showIncorrectLockMsg();
	
	public IncorrectPin showIncorectPinMsg();
	
	public IncorrectUnlock showIncorrectUnlockMsg();
	
	public MakeDeposit makeDeposit();
	
	public ManyAttempts showManyAttemptsMsg();
	
	public MakeWithdraw withdraw();
	
	public ChargePenalty chargePenalty();
	
	public PromptPin promptForPin();
	
}
