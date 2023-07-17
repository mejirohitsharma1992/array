package array;

public class hasKSmallFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result = hasKSmallFactors(7,30);
		System.out.println(result);
	}
	static boolean hasKSmallFactors(int k, int n) {
		  boolean flag = false;
		  if (k < 0 || n < 0) {
		    return false;
		  }
		  for (int i = 1; i <= n; i++) {
		    if (n % i == 0) {
		      for (int j = 1; j <= n; j++) {
		        if (n % j == 0) {
		          if (i * j == n) {
		            if (i < k && j < k) {
		              flag = true;
		              break;
		            }
		          }
		        }
		      }
		    }
		  }
		  return flag;
		}
}
