package level1;

public class Q15 {
	/*
	 * �ڵ��� ��ȣ ������
	���� ����
	���α׷��ӽ� ������� �������� ��ȣ�� ���� �������� ���� �� ������ ��ȭ��ȣ�� �Ϻθ� �����ϴ�.
	��ȭ��ȣ�� ���ڿ� phone_number�� �־����� ��, ��ȭ��ȣ�� �� 4�ڸ��� ������ ������ ���ڸ� ���� *���� ���� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
	
	���� ����
	phone_number�� ���� 4 �̻�, 20������ ���ڿ��Դϴ�.
	����� ��
	phone_number	return
	"01033334444"	"*******4444"
	"027778888"	"*****8888"
	 * 
	 */

	public static void main(String[] args) {
		String phone_number = "01012345678";
		String s1 = phone_number.substring(0,phone_number.length()-4).replaceAll("[0-9]", "*");
		String s2 = phone_number.substring(phone_number.length()-4);

		
		System.out.println(s1+s2);
	}

}
