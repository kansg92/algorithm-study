package level1;

public class Q5 {
	
	/*
	 * ������ ������ �Ǻ�
	 * ������ ���� ���� n�� ����, n�� � ���� ���� x�� �������� �ƴ��� �Ǵ��Ϸ� �մϴ�.
		n�� ���� ���� x�� �����̶�� x+1�� ������ �����ϰ�, n�� ���� ���� x�� ������ �ƴ϶�� -1�� �����ϴ� �Լ��� �ϼ��ϼ���.
		
		���� ����
		n�� 1�̻�, 50000000000000 ������ ���� �����Դϴ�.
		����� ��
		n	return
		121	144
		3	-1
		����� �� ����
		����� ��#1
		121�� ���� ���� 11�� �����̹Ƿ�, (11+1)�� ������ 144�� �����մϴ�.
		
		����� ��#2
		3�� ���� ������ ������ �ƴϹǷ�, -1�� �����մϴ�.
	 */

	public static void main(String[] args) {
		long n =121;
		double check = Math.sqrt(n);
		long answer = 0;
		if(check % 1 ==0) {
			System.out.println(n+1);
			answer = (long) Math.pow(check+1,2);
		}else {
			answer = -1;
		}
		System.out.println(answer);

	}

}
