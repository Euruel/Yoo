package oracle.com;

public class Account {

	public static void main(String[] args) {
		int balance;
		String acNumber;// ���¹�ȣ
		String ssNumber;// �ֹι�ȣ 
		// �����ϰ� ���ڴ� ��Ʈ�� Ÿ���̶� �����Ұ�
		void withdraw (int amt); { //������
			balance = balance - amt;
		};
		void input(int amt); { //�Աݱ��
			balance = balance + amt;
		};
		void checkBalance() { // �ܾ���ȸ
			System.out.println("���¹�ȣ" + acNumber);
			System.out.println("�ܾ���?" + Balance);
		}

}
