/**
 * 
 */
package pAbstractFactory;

import pStrategy.displayMenu.DisplayMenu;
import pStrategy.displayMenu.DisplayMenu_2;
import pStrategy.displaybalance.DisplayBalance;
import pStrategy.displaybalance.DisplayBalance_2;
import pStrategy.funds.NoFunds;
import pStrategy.funds.noFunds_1;
import pStrategy.incorrectIDmsg.IncorrectIDMsg;
import pStrategy.incorrectIDmsg.IncorrectID_1;
import pStrategy.incorrectLock.IncorrectLock;
import pStrategy.incorrectLock.IncorrectLock_1;
import pStrategy.incorrectPin.IncorrectPin;
import pStrategy.incorrectPin.IncorrectPin_1;
import pStrategy.incorrectUnlock.IncorrectUnlock;
import pStrategy.incorrectUnlock.IncorrectUnlock_1;
import pStrategy.makeDeposit.MakeDeposit;
import pStrategy.makeDeposit.MakeDeposit_2;
import pStrategy.makeWithdraw.MakeWithdraw;
import pStrategy.makeWithdraw.MakeWithdraw_2;
import pStrategy.manyAttempts.ManyAttempts;
import pStrategy.manyAttempts.ManyAttempts_1;
import pStrategy.penalty.ChargePenalty;
import pStrategy.penalty.ChargePenalty_2;
import pStrategy.promptPin.PromptPin;
import pStrategy.promptPin.PromptPin_1;
import pStrategy.storedata.StoreData;
import pStrategy.storedata.StoreData_Acc2;

/**
 * @author Brinda Rao
 *
 */
public class AccountFactory2 implements AccountFactory {

	@Override
	public IncorrectIDMsg showIncorrectIDMsg() {
		// TODO Auto-generated method stub
		return new IncorrectID_1();
	}

	@Override
	public StoreData storeAccountData() {
		// TODO Auto-generated method stub
		return new StoreData_Acc2();
	}

	@Override
	public DisplayBalance displayBalance() {
		// TODO Auto-generated method stub
		return new DisplayBalance_2();
	}

	@Override
	public DisplayMenu displayMenu() {
		// TODO Auto-generated method stub
		return new DisplayMenu_2();
	}

	@Override
	public NoFunds showNoFundsMsg() {
		// TODO Auto-generated method stub
		return new noFunds_1();
	}

	@Override
	public IncorrectLock showIncorrectLockMsg() {
		// TODO Auto-generated method stub
		return new IncorrectLock_1();
	}

	@Override
	public IncorrectPin showIncorectPinMsg() {
		// TODO Auto-generated method stub
		return new IncorrectPin_1();
	}

	@Override
	public IncorrectUnlock showIncorrectUnlockMsg() {
		// TODO Auto-generated method stub
		return new IncorrectUnlock_1();
	}

	@Override
	public MakeDeposit makeDeposit() {
		// TODO Auto-generated method stub
		return new MakeDeposit_2();
	}

	@Override
	public ManyAttempts showManyAttemptsMsg() {
		// TODO Auto-generated method stub
		return new ManyAttempts_1();
	}

	@Override
	public MakeWithdraw withdraw() {
		// TODO Auto-generated method stub
		return new MakeWithdraw_2();
	}

	@Override
	public ChargePenalty chargePenalty() {
		// TODO Auto-generated method stub
		return new ChargePenalty_2();
	}

	@Override
	public PromptPin promptForPin() {
		// TODO Auto-generated method stub
		return new PromptPin_1();
	}

}
