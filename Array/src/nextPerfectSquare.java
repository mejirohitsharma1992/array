
public class nextPerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = nextPerfectSquare(6);
		System.out.println(result);
		result = nextPerfectSquare(36);
		System.out.println(result);
		result = nextPerfectSquare(0);
		System.out.println(result);
		result = nextPerfectSquare(-5);
		System.out.println(result);
	}

	static int nextPerfectSquare(int n){
		int nextPerfectSquare = 0;
		if(n >= 0){
			double sqrtResult = Math.sqrt(n);
			System.out.println(sqrtResult+"\n");
			int baseNumber = (int)sqrtResult;
			System.out.println(baseNumber+"\n");
			int nextNumber = baseNumber + 1;
			System.out.println(nextNumber+"\n");
			nextPerfectSquare = (int)Math.pow(nextNumber, 2);
			System.out.println(nextPerfectSquare+"\n");
		}
		return nextPerfectSquare;
	}

}
