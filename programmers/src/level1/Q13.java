package level1;

public class Q13 {
	
	/*
	 * 
	 * ���￡�� �輭�� ã��
	���� ����
	String�� �迭 seoul�� element�� "Kim"�� ��ġ x�� ã��, "�輭���� x�� �ִ�"�� String�� ��ȯ�ϴ� �Լ�, solution�� �ϼ��ϼ���. seoul�� "Kim"�� ���� �� ���� ��Ÿ���� �߸��� ���� �ԷµǴ� ���� �����ϴ�.
	
	���� ����
	seoul�� ���� 1 �̻�, 1000 ������ �迭�Դϴ�.
	seoul�� ���Ҵ� ���� 1 �̻�, 20 ������ ���ڿ��Դϴ�.
	"Kim"�� �ݵ�� seoul �ȿ� ���ԵǾ� �ֽ��ϴ�.
	����� ��
	seoul	return
	["Jane", "Kim"]	"�輭���� 1�� �ִ�"
	 */

	public static void main(String[] args) {
		String [] seoul = {"jane","Kim","Kam"};
		
		int cnt = 0;
		System.out.println(seoul[1]);
		for(int i = 0; i < seoul.length; i++) {
			if(seoul[i].equals("Kim")) {
				cnt = i;
				break;
			}
		}
		String answer="�輭���� " + cnt + "�� �ִ�.";
		System.out.println(answer);

	}

}
