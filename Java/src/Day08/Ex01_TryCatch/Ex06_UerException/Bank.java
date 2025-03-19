package Day08.Ex01_TryCatch.Ex06_UerException;

public class Bank {

	public static void main(String[] args) {
		Account account = new Account();
		
		// 10,000 입금
		account.deposit(10000);
		
		// 20,000 출금
		try {
			account.withdraw(20000);
		} catch (BalanceException e) {
			e.printStackTrace();
		}
	}
}
