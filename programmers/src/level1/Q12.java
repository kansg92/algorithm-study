package level1;

public class Q12 {
	
	/*
	 * �� ���� ������ ��
	���� ����
	�� ���� a, b�� �־����� �� a�� b ���̿� ���� ��� ������ ���� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
	���� ��� a = 3, b = 5�� ���, 3 + 4 + 5 = 12�̹Ƿ� 12�� �����մϴ�.
	
	���� ����
	a�� b�� ���� ���� �� �� �ƹ� ���� �����ϼ���.
	a�� b�� -10,000,000 �̻� 10,000,000 ������ �����Դϴ�.
	a�� b�� ��Ұ���� ���������� �ʽ��ϴ�.
	����� ��
	a	b	return
	3	5	12
	3	3	3
	5	3	12
		 */
	
	public static void main(String[] args) {
		int a = 3;
		int b = 5;
        long answer = 0;

        if(a < b) {
            for(int i=a; i<=b; i++) {
                answer += i;
            }
        } else if (a > b){
              for(int i=a; i>=b; i--) {
                answer += i;

              }
        } else if(a == b){
             answer = (long) a;
        }
        System.out.println(answer);
		

	}
	
	

}
