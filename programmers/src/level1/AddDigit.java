package level1;

/*
 * ���� ����
�ڿ��� N�� �־�����, N�� �� �ڸ����� ���� ���ؼ� return �ϴ� solution �Լ��� ����� �ּ���.
������� N = 123�̸� 1 + 2 + 3 = 6�� return �ϸ� �˴ϴ�.

���ѻ���
N�� ���� : 100,000,000 ������ �ڿ���
����� ��
N	answer
123	6
987	24
����� �� ����
����� �� #1
������ ���ÿ� �����ϴ�.

����� �� #2
9 + 8 + 7 = 24�̹Ƿ� 24�� return �ϸ� �˴ϴ�.
 */

public class AddDigit {


	
    public static void main(String[] args) {
      //  recursion(123);
        int n = 123;
        int answer = 0;
		/*
		 * String string = Integer.toString(n); for ( int i = 0; i < string.length();
		 * i++) { answer += Integer.parseInt(string.substring(i,i+1)); }
		 * System.out.println(answer);
		 */
        while(n>0) {
        	answer += n%10;
        	n /= 10;
        }
        System.out.println(answer);
    }

	/*
	 * public static void recursion(int number) { if(number > 0) {
	 * recursion(number/10); System.out.println(number % 10); } }
	 */
	
	
}


