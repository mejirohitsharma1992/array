package array;

public class getExponent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = getExponent(28, 3);
		System.out.println(result);
	}
//	static int getExponent(int n, int p) {
//		  if (p <= 1) {
//		    return -1;
//		  }
//		  int count = 0, rem;
//		  if (n < 0) {
//		    n = n * -1;
//		  }
//		  while (n > 0) {
//		    rem = n % p;
//		    if (rem == 0) {
//		      count++;
//		    } else {
//		      break;
//		    }
//		    n = n / p;
//		  }
//		  return count;
//		}
	static int getExponent(int n, int p) {
		  if (p <= 1) {
		    return -1;
		  }
		  int count = 0;
		  while(n%p==0) {
			  count++;
			  n=n/p;
		  }
		return count;
	}
}
