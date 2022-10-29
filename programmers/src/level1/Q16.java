package level1;

import java.util.Arrays;

public class Q16 {

	/*
	 * ���� ���� �� �����ϱ�
	���� ����
	������ ������ �迭, arr ���� ���� ���� ���� ������ �迭�� �����ϴ� �Լ�, solution�� �ϼ����ּ���. ��, �����Ϸ��� �迭�� �� �迭�� ��쿣 �迭�� -1�� ä�� �����ϼ���. ������� arr�� [4,3,2,1]�� ���� [4,3,2]�� ���� �ϰ�, [10]�� [-1]�� ���� �մϴ�.
	
	���� ����
	arr�� ���� 1 �̻��� �迭�Դϴ�.
	�ε��� i, j�� ���� i �� j�̸� arr[i] �� arr[j] �Դϴ�.
	����� ��
	arr	return
	[4,3,2,1]	[4,3,2]
	[10]	[-1]
	 */
	
	/*
	 * Ư�� �� ���� �Լ�.
	 */
    public static int[] removeElement(int[] arr, int item) {
        return Arrays.stream(arr)
                .filter(i -> i != item)
                .toArray();
    }
	
    // �ּڰ��� ������ �迭 ���� �Լ�.
	public static void main(String[] args) {
		int[] answer = {4,3,2,1};
		int min = answer[0];
		for (int i : answer) {
			if(i < min) {
				min = i;
			}
		}
		
		if(answer.length == 1) {
			answer[0] = -1;
		}else {
			answer = removeElement(answer, min);
		}
		System.out.println(Arrays.toString(answer));

	}
	
	// ���ٽ� �ذ� 
	  public int[] solution(int[] arr) {
	      if (arr.length <= 1) return new int[]{ -1 };
	      int min = Arrays.stream(arr).min().getAsInt();
	      return Arrays.stream(arr).filter(i -> i != min).toArray();
	  }

}
