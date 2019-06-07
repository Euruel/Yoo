package oracle.com;

public class Account {

	public static void main(String[] args) {
		int balance;
		String acNumber;// 계좌번호
		String ssNumber;// 주민번호 
		// 숫자하고 문자는 스트링 타입이라 생각할것
		void withdraw (int amt); { //인출기능
			balance = balance - amt;
		};
		void input(int amt); { //입금기능
			balance = balance + amt;
		};
		void checkBalance() { // 잔액조회
			System.out.println("계좌번호" + acNumber);
			System.out.println("잔액은?" + Balance);
		}

}
