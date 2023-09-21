package com.tnsif.dayfourteen.synchronization;

public class AccountThread extends Thread {
	private String type;
	private Account acc;
	private int amount;

	public AccountThread() {
	}

	public AccountThread(Account acc) {
		this.acc = acc;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public void run() {
		try {
			if (type.equals("deposit"))
				acc.deposit(amount);
			else if (type.equals("withdraw"))
				acc.withdraw(amount);
		} catch (DepositLimitExceedsException | InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
	}
}
