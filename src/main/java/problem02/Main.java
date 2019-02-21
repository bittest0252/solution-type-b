package problem02;

public class Main {

	public static void main(String[] args) {
		String[] expressions = {"3 + 4", "12 * 4", "8 / 2", "10 - 2"};
		
		for(String expression : expressions) {
			String[] tokens = expression.split(" ");
			
			String arith = tokens[1];
			int num1 = Integer.parseInt(tokens[0]);
			int num2 = Integer.parseInt(tokens[2]);

			// num1, num2, arith 세 개의 변수와 getInstance 메소드를 사용하여
			// 문제의 결과화면에 맞게 출력하는 계산기 나머지 코드를 아래에 완성 하십시오.
			// 주어진 코드는 수정하지 않습니다.

			System.out.println(getInstance(arith).calculate(num1, num2));
		}
	}
	
	public static Arithmetic getInstance(String arith) {
		
		// 메소드 구현을 완성 하십시오.
		Arithmetic arithmetic = new Arithmetic() {
			@Override
			public int calculate(int a, int b) {
				// TODO Auto-generated method stub
				int result = 0;
				switch(arith) {
				case "+": result = Add(a,b);
				break;
				case "-": result = Sub(a,b);
				break;
				case "*": result = Mul(a,b);
				break;
				case "/": result = Div(a,b);
				break;
				}
				return result;
			}
			public int Add(int a, int b) {
				return a + b;
			}
			public int Sub(int a, int b) {
				return a - b;
			}
			public int Mul(int a, int b) {
				return a * b;
			}
			public int Div(int a, int b) {
				return a / b;
			}
		};
		return arithmetic;
	}
}