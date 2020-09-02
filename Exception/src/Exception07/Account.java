package Exception07;

public class Account {
	private long balance;

	public Account() {
		// TODO Auto-generated method stub
	}

	public long getBalance() {
		return	balance;
	}
	public void deposit(int money) {
		balance += money;
	}
//	//사용자 저의 에외 떠넘기기
//	public void withdraw(int money) throws BalanceInsufficientException{ 
//		if(balance<money) {
//			throw new  BalanceInsufficientException("잔고부족:"+(money-balance)+"모자람")
//		}
//		balance -=money;
//	}

}
