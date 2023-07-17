package array;

public class factorTwoCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = factorTwoCount(48);
		System.out.println(result);
	}
	static int factorTwoCount(int n) {
		  int count = 0;
		  while (n > 1) {
		    if (n % 2 == 0) {
		      count++;
		      n = n / 2;
		    } else {
		      break;
		    }
		  }
		  return count;
		}

}
