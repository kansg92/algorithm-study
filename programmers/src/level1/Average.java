package level1;

/*
 ��� ���ϱ�
���� ����
������ ��� �ִ� �迭 arr�� ��հ��� return�ϴ� �Լ�, solution�� �ϼ��غ�����.

���ѻ���
arr�� ���� 1 �̻�, 100 ������ �迭�Դϴ�.
arr�� ���Ҵ� -10,000 �̻� 10,000 ������ �����Դϴ�.
����� ��
arr	return
[1,2,3,4]	2.5
[5,5]	5

 */

public class Average {
	public static void main(String[] args) {
    	int[] arr1 = {1,2,3,4};
        double answer = 0;
        double sum = 0;
        for (int i : arr1) {
				sum += i;
			}
        System.out.println(sum);
        System.out.println(arr1.length);
        answer = sum / arr1.length;
        System.out.println(answer);
	}

}
