package Exception08;

import java.util.prefs.BackingStoreException;

import Exception07.Account;

public class AccountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		//�����ϱ�
		account.deposit(1000);
		System.out.println("���ݾ�:"+account.getBalance());
//		//����ϱ�
//		try {
//			account.withdraw(30000);
//		} catch (BalanceInsufficientException e) {
//			String message = e.getMessage();
//			System.out.println(message);
//			System.out.println();
//			e.printStackTrace();
//			// TODO: handle exception
//		}
	}

}
