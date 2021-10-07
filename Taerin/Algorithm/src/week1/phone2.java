package week1;

public class phone2 {

	public static void main(String[] args) {

		System.out.println(solution("01022223333"));
	}

	private static String solution(String phone_number) {
		// substring 사용하기
		// 1. 번호 길이구하기
		// 2. 마지막 4자리 제외한 *로 바꾸기
		// 3. 출력

		String answer = "";
		// length와 lenght()차이 스트링에서만 오직 length();

		for (int i = 0; i < phone_number.length() - 4; i++) {
			answer += "*";
		}

		// substring(start, end) => start부터 end-1까지 리턴 (end는 생략가능)
		answer += phone_number.substring(phone_number.length() - 4);

		return answer;
	}

}
