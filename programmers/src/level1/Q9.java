package level1;

/*
 * �������� 1�� �Ǵ� �� ã��
	���� ����
	�ڿ��� n�� �Ű������� �־����ϴ�. n�� x�� ���� �������� 1�� �ǵ��� �ϴ� ���� ���� �ڿ��� x�� return �ϵ��� solution �Լ��� �ϼ����ּ���. ���� �׻� �������� ������ �� �ֽ��ϴ�.
	
	���ѻ���
	3 �� n �� 1,000,000
	����� ��
	n	result
	10	3
	12	11
	����� �� ����
	����� �� #1
	
	10�� 3���� ���� �������� 1�̰�, 3���� ���� �ڿ��� �߿��� ������ ������ �����ϴ� ���� �����Ƿ�, 3�� return �ؾ� �մϴ�.
	����� �� #2
	
	12�� 11�� ���� �������� 1�̰�, 11���� ���� �ڿ��� �߿��� ������ ������ �����ϴ� ���� �����Ƿ�, 11�� return �ؾ� �մϴ�.
 * 
 */



public class Q9 {

	public static void main(String [] args) {
		int n = 10;
		int answer = 0;
		for(int i =1; i < n; i++) {
			if(n % i == 1) {
				answer = i;
			}
			
		}
		
		
	}
}