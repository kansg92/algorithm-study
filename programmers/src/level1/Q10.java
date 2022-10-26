package level1;

import java.util.Arrays;
import java.util.Comparator;

public class Q10 {
	
	/*
	 * ���� ������������ ��ġ�ϱ�
	���� ����
	�Լ� solution�� ���� n�� �Ű������� �Է¹޽��ϴ�. n�� �� �ڸ����� ū�ͺ��� ���� ������ ������ ���ο� ������ �������ּ���. ������� n�� 118372�� 873211�� �����ϸ� �˴ϴ�.
	
	���� ����
	n�� 1�̻� 8000000000 ������ �ڿ����Դϴ�.
	����� ��
	n	return
	118372	873211
	 */

	public static void main(String[] args) {
		long n = 8000000000L;
		long length = (long) (Math.log10(n)+1);
		long answer = 0;
		int[] arr = new int[(int) length];
		for(int i = 0; i < length; i++) {
			arr[i] = (int) (n %10);
			n /= 10;
		}
		System.out.println(Arrays.toString(arr));
		Integer[] tmp = Arrays.stream(arr).boxed().toArray(Integer[]::new);
		Arrays.sort(tmp, Comparator.reverseOrder());
		System.out.println(Arrays.toString(tmp));;
		for (Integer i : tmp) {
			answer *= 10;
			answer += i;
		}
		System.out.println(answer);
		
//		long length = (long) (Math.log10(n)+1);
//		long answer = 0;
//		int[] arr = new int[(int) length];
//		for(int i = 0; i < length; i++) {
//			arr[i] = (int) n %10;
//			n /= 10;
//		}
//		System.out.println(Arrays.toString(arr));
//		for (int i =0; i < arr.length; i++) {		
//		}
//		
	}

}
