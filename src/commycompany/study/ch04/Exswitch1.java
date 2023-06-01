package commycompany.study.ch04;

public class Exswitch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 2;
		
		switch (num) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		default:
			System.out.println("1번도 2번도 아닌 것이 나왔습니다.");
			break;
		
		} 
		// 사장, 부장, 과장, 대리, 주임, 사원, 나
		// 사장의 연봉은 얼마 입니다.
		
		String position = "부장";
		switch(position) {
			case "사장":
			System.out.println("사장의 연봉은 10억입니다.");
			break;
			case "부장":
				System.out.println("부장의 연봉은 10억입니다.");
				break;
			case "과장":
				System.out.println("과장의 연봉은 10억입니다.");
				break;
			case "대리":
				System.out.println("대리의 연봉은 10억입니다.");
				break;
			case "주임":
				System.out.println("주임의 연봉은 10억입니다.");
				break;
			case "사원":
				System.out.println("사원의 연봉은 10억입니다.");
				break;
			case "나":
				System.out.println("나의 연봉은 10억입니다.");
				break;
			default:
				System.out.println("없는 Position입니다. 다시 입력해 주세요");
				break;
		}
	}

}
