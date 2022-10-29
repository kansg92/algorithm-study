package level1;

import java.util.Arrays;

public class Q16 {

	/*
	 * 제일 작은 수 제거하기
	문제 설명
	정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
	
	제한 조건
	arr은 길이 1 이상인 배열입니다.
	인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
	입출력 예
	arr	return
	[4,3,2,1]	[4,3,2]
	[10]	[-1]
	 */
	
	/*
	 * 특정 값 제거 함수.
	 */
    public static int[] removeElement(int[] arr, int item) {
        return Arrays.stream(arr)
                .filter(i -> i != item)
                .toArray();
    }
	
    // 최솟값을 제거한 배열 산출 함수.
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
	
	// 람다식 해결 
	  public int[] solution(int[] arr) {
	      if (arr.length <= 1) return new int[]{ -1 };
	      int min = Arrays.stream(arr).min().getAsInt();
	      return Arrays.stream(arr).filter(i -> i != min).toArray();
	  }

}
