package week2;

public class test3 {

	public static void main(String[] args) {
		//  �ڸ��� ���ϱ�
		// ������ ������ ���
		System.out.println(solution);
	}
	
	private static int solution(int n) {
		int answer = 0;
		
		while(n > 0) {
			answer += n % 10;
			n /= 10;
		}
		return answer;
	}

}
