package week2;

public class test3 {

	public static void main(String[] args) {
		//  자릿수 더하기
		// 정수의 나숫셈 방식
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
