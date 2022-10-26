package level1;

import java.util.Arrays;
import java.util.Comparator;

public class Q10 {
	
	/*
	 * 정수 내림차순으로 배치하기
	문제 설명
	함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
	
	제한 조건
	n은 1이상 8000000000 이하인 자연수입니다.
	입출력 예
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
