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
//	//����� ���� ���� ���ѱ��
//	public void withdraw(int money) throws BalanceInsufficientException{ 
//		if(balance<money) {
//			throw new  BalanceInsufficientException("�ܰ����:"+(money-balance)+"���ڶ�")
//		}
//		balance -=money;
//	}

}
