package level1_stars;

import java.util.Scanner;

public class SquareStar {

	public static void main(String[] args) {
		/*
		���� ����
		�� �������� ǥ�� �Է����� �� ���� ���� n�� m�� �־����ϴ�.
		��(*) ���ڸ� �̿��� ������ ���̰� n, ������ ���̰� m�� ���簢�� ���¸� ����غ�����.

		���� ����
		n�� m�� ���� 1000 ������ �ڿ����Դϴ�.
		
		
		����
			�Է�
			
			5 3
			���
			
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
		 * �ٸ���� Ǯ��.
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
