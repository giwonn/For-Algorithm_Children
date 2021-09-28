package week1;

public class phone {

	public static void main(String[] args) {
		// 핸드폰 뒷자리 4개를 제외하고 전부 ****처리
		// phone_number 문자열
		// substring 사용
		// substrung-4

		String s = "";
//		class Solution {
//		    public String solution(String phone_number) {		 
//			StringBuilder answer = new StringBuilder(phone_number);
//				 
//			for(int i = 0; i < phone_number.length()-4; i++) {
//				answer.setCharAt(i, '*');
//			}
//			return answer.toString();
//		    }
//		}
//	__________________________________________________ 답 1

//		class Solution {
//			public String solution(String phone_number) {
//				String answer = "";
//				for (int i = 0; i < phone_number.length(); i++) {
//					if (i < phone_number.length() - 4) {
//						answer += "*";
//					} else {
//						answer += phone_number.charAt(i);
//					}
//				}
//				return answer;
//			}
//		}
//   ____________________________________________________ 답 2
	}

}
