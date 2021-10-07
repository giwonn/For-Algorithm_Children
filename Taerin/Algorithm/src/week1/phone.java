package week1;

import java.util.Scanner;

public class phone {

	public static void main(String[] args) {
		// charAt i번째 인덱스를 반환 그 번짓수의 값을 불러오려고
		// System.out.println("문자를 제외한 핸드폰 번호만 입력해주세요");
		// Scanner sc = new Scanner(System.in);
		// String num = sc.nextLine();

		System.out.println(solution("01022223333"));

	}

	private static String solution(String phone_number) {

		// 1. 번호 길이구하기
		// 2. 마지막 4자리 제외한 *로 바꾸기
		// 3. 출력

		String answer = "";
		// length와 lenght()차이 스트링에서만 오직 length();

		for (int i = 0; i < phone_number.length(); i++) {
			if (i < phone_number.length() - 4) {
				answer += "*";
			} else {
				answer += phone_number.charAt(i);
			}
		}
		return answer;
	}

}
