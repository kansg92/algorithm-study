package level1;

import java.util.Random;

/*
 * ���� ����
���� n�� �Է¹޾� n�� ����� ��� ���� ���� �����ϴ� �Լ�, solution�� �ϼ����ּ���.

���� ����
n�� 0 �̻� 3000������ �����Դϴ�.
����� ��
n	return
12	28
5	6
����� �� ����
����� �� #1
12�� ����� 1, 2, 3, 4, 6, 12�Դϴ�. �̸� ��� ���ϸ� 28�Դϴ�.

����� �� #2
5�� ����� 1, 5�Դϴ�. �̸� ��� ���ϸ� 6�Դϴ�.
 * 
 */

public class DivisorSum {
	
	class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        
	        return answer;
	    }
	}
	// �׽�Ʈ��
	public static void main(String[] args) {
		// 0~3000 ���� ����
		Random random = new Random();
		int n = random.nextInt(3001);
		int sum = 0;
		for(int i=1; i <= n; i++) {
			if(n % i == 0) {
				sum += i;
			}
		}
		System.out.println(n);
		System.out.println(sum);
		
	}

}
