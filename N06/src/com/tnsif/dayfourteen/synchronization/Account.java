package com.tnsif.dayfourteen.synchronization;

public class Account implements Bank {
	private int accNo;
	private String name;
	private int balance;

	public Account(int accNo, String name, int balance) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public synchronized void deposit(int amount) throws DepositLimitExceedsException {
		if (amount>Bank.DEPOSIT_LIMIT)
			throw new DepositLimitExceedsException("can't deposit "+amount+" as deposit limit exceeded..");
		balance+=amount;
	}

	@Override
	public synchronized void withdraw(int amount) throws InsufficientBalanceException {
		if (amount>balance-Bank.MINIMUM_BALANCE)
			throw new InsufficientBalanceException("Can't withdraw, Insufficient balance : "+balance);
		balance-=amount;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}

}
