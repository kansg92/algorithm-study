package level1;

import java.util.Arrays;

public class Q14 {
	
	/*
	 * ������ �������� ���� �迭
	���� ����
	array�� �� element �� divisor�� ������ �������� ���� ������������ ������ �迭�� ��ȯ�ϴ� �Լ�, solution�� �ۼ����ּ���.
	divisor�� ������ �������� element�� �ϳ��� ���ٸ� �迭�� -1�� ��� ��ȯ�ϼ���.
	
	���ѻ���
	arr�� �ڿ����� ���� �迭�Դϴ�.
	���� i, j�� ���� i �� j �̸� arr[i] �� arr[j] �Դϴ�.
	divisor�� �ڿ����Դϴ�.
	array�� ���� 1 �̻��� �迭�Դϴ�.
	����� ��
	arr	divisor	return
	[5, 9, 7, 10]	5	[5, 10]
	[2, 36, 1, 3]	1	[1, 2, 3, 36]
	[3,2,6]	10	[-1]
	����� �� ����
	����� ��#1
	arr�� ���� �� 5�� ������ �������� ���Ҵ� 5�� 10�Դϴ�. ���� [5, 10]�� �����մϴ�.
	
	����� ��#2
	arr�� ��� ���Ҵ� 1���� ������ �������ϴ�. ���Ҹ� ������������ ������ [1, 2, 3, 36]�� �����մϴ�.
	
	����� ��#3
	3, 2, 6�� 10���� ������ �������� �ʽ��ϴ�. ������ �������� ���Ұ� �����Ƿ� [-1]�� �����մϴ�.
	 */

	public static void main(String[] args) {
		int [] answer = {2,36,1,3};
		int divisor = 1;
		int cnt = 0;
		for (int i : answer) {
			if(i % divisor == 0) {
				answer[cnt] = i ;
				cnt++;
			}
		}
		answer = Arrays.copyOf(answer, cnt);
		Arrays.sort(answer);
		if (answer.length == 0) {
			answer = Arrays.copyOf(answer, 0);
			answer[0] = -1;
		}
		System.out.println(Arrays.toString(answer));
		

	}
	
	//���ٽ�!
	public int[] solution(int[] arr, int divisor) {
          int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
          if(answer.length == 0) answer = new int[] {-1};
          java.util.Arrays.sort(answer);
          return answer;
    }
}

