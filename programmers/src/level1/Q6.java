package level1;

/*
 * ���ڿ� �� p�� y�� ����
	���� ����
	�빮�ڿ� �ҹ��ڰ� �����ִ� ���ڿ� s�� �־����ϴ�. s�� 'p'�� ������ 'y'�� ������ ���� ������ True, �ٸ��� False�� return �ϴ� solution�� �ϼ��ϼ���. 'p', 'y' ��� �ϳ��� ���� ���� �׻� True�� �����մϴ�. ��, ������ ���� �� �빮�ڿ� �ҹ��ڴ� �������� �ʽ��ϴ�.
	
	���� ��� s�� "pPoooyY"�� true�� return�ϰ� "Pyy"��� false�� return�մϴ�.
	
	���ѻ���
	���ڿ� s�� ���� : 50 ������ �ڿ���
	���ڿ� s�� ���ĺ����θ� �̷���� �ֽ��ϴ�.
	����� ��
	s	answer
	"pPoooyY"	true
	"Pyy"	false
	����� �� ����
	����� �� #1
	'p'�� ���� 2��, 'y'�� ���� 2���� �����Ƿ� true�� return �մϴ�.
	
	����� �� #2
	'p'�� ���� 1��, 'y'�� ���� 2���� �ٸ��Ƿ� false�� return �մϴ�.
	
	�� ���� - 2021�� 8�� 23�� �׽�Ʈ���̽��� �߰��Ǿ����ϴ�.
 * 
 */

public class Q6 {

	public static void main(String[] args) {
		String str = "pPoooyYy";
		str = str.toUpperCase();
		long countP = str.chars().filter(ch -> ch  == 'P').count();
		long countY = str.chars().filter(ch -> ch  == 'Y').count();
		System.out.println(countP);
		if(countP == countY) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		

	}

}