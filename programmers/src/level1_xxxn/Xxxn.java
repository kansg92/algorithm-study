package level1_xxxn;

import java.util.Arrays;
import java.util.Scanner;

public class Xxxn {

	public static void main(String[] args) {
		/*
		 * x��ŭ ������ �ִ� n���� ����
���� ����
�Լ� solution�� ���� x�� �ڿ��� n�� �Է� �޾�, x���� ������ x�� �����ϴ� ���ڸ� n�� ���ϴ� ����Ʈ�� �����ؾ� �մϴ�. ���� ���� ������ ����, ������ �����ϴ� �Լ�, solution�� �ϼ����ּ���.

���� ����
x�� -10000000 �̻�, 10000000 ������ �����Դϴ�.
n�� 1000 ������ �ڿ����Դϴ�.
����� ��
x	n	answer
2	5	[2,4,6,8,10]
4	3	[4,8,12]
-4	2	[-4, -8]
		 */
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int sum = 0;
		long [] answer2 = new long [n];
		if((n> 0 && n<= 1000) && ((x >= -10000000) || (x <= 10000000)) ) {
			for (int i = 0; i < answer2.length; i++) {
					sum += x;
					answer2[i] = sum;		
			}
		}
		
		System.out.println(Arrays.toString(answer2));
	}

}
