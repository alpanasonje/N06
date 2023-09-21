package com.tnsif.dayfourteen.synchronization;

public interface Bank {
	int DEPOSIT_LIMIT = 25000;
	static final int MINIMUM_BALANCE = 1000;

	void deposit(int amount) throws DepositLimitExceedsException;

	public abstract void withdraw(int amount) throws InsufficientBalanceException;
}
