package level1_stars;

import java.util.Scanner;

public class SquareStar {

	public static void main(String[] args) {
		/*
		문제 설명
		이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
		별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.

		제한 조건
		n과 m은 각각 1000 이하인 자연수입니다.
		
		
		예시
			입력
			
			5 3
			출력
			
			*****
			*****
			*****
		
		 */
		int a = 5;
		int b = 3;
		for (int i=0; i< b; i++) {
			if(i==0) {
				System.out.print("");
			}else {
				System.out.println("");	
			}
			for(int j =0; j <a; j++) {	
				System.out.print("*");
			}
		}
		
		/*
		 * 다른사람 풀이.
		 *  for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
		 * 
		 */

	}

}
