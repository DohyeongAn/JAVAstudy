package commycompany.study.ch03;

public class ExStringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//ch03.05
		
		//문자열 연산자 (+)
		
		String stringVal = "jdk";
		String stringVal2 = "1.11";
		
		String stringVal3 = stringVal + stringVal2;
		
		System.out.println("strangVal3: " + stringVal3);
		System.out.println("우리가 사용하는 JDK 버젼은 " + stringVal + " " + stringVal2 + "!");
		
		int a = 1;
	
		
		String stringVal4 = stringVal + " " + a;
		System.out.println("stringVal4: " + stringVal4);
		
		double b = 1.11;
		String stringVal5 = stringVal + b;
		System.out.println("stringVal5: " + stringVal5);
		
	}

}