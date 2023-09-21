package com.tnsif.dayfourteen.synchronization;

public class DepositLimitExceedsException extends Exception {
	public DepositLimitExceedsException()
	{
		super("Can't Deposit..Limit is exceeded");
	}
	public DepositLimitExceedsException(String message)
	{
		super(message);
	}
}
