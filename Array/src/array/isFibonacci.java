package array;

public class isFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = isFibonacci(1);
		System.out.println(result);
	}
	static int isFibonacci(int n) {
		  int count = 0, a = 0, b = 0, c = 1;
		  while (c <= n) {
		    if (c == n) {
		      count = 1;
		      break;
		    }
		    a = b;
		    b = c;
		    c = a + b;
		  }
		  return count;
		}

}
