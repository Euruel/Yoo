package com.yedam.yoo;

public class Studentjava {
	public static void main(String[] args) {
		Professor pf1 = new Professor(); // �ν��Ͻ� ����
		pf1.setPrfNo("1111");
		pf1.setName("���ڻ�");
		pf1.setMajor("math");

		// ������
		Professor pf2 = new Professor("2222", "�̹ڻ�", "computer");
		System.out.println(pf2);

		System.out.println("==================================");

		Professor[] prfAry = new Professor[3]; // {pf1, pf2};
		prfAry[0] = pf1;
		prfAry[1] = pf2;
		// prfAry[2] = null;
		for (int i = 0; i < prfAry.length; i++) {
			System.out.println(prfAry[i]);
		}

	}
}
