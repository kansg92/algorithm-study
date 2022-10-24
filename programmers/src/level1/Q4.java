package level1;

import java.util.Arrays;

public class Q4 {

	/*
	 * �ڿ��� n�� ������ �� �ڸ� ���ڸ� ���ҷ� ������ �迭 ���·� �������ּ���. ������� n�� 12345�̸� [5,4,3,2,1]�� �����մϴ�.

		���� ����
		n�� 10,000,000,000������ �ڿ����Դϴ�.
		����� ��
		n	return
		12345	[5,4,3,2,1]
	 */
	
	
	public static void main(String[] args) {
		long n = 1234567890123L;
		long length = (long) (Math.log10(n)+1);
		int[] answer = new int[(int) length];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = (int) (n %10);
			n /= 10;
			
		}
		System.out.println(Arrays.toString(answer));
		
		
		
	}

}
