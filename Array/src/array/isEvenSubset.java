package array;

public class isEvenSubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = isEvenSubset(18,12);
		System.out.println(result);
	}
	static int isEvenSubset(int m, int n) {
		  int flag = 1;
		  for (int i = 2; i < m; i++) {
		    if (m % i == 0 && i % 2 == 0) {
		      if (n % i != 0) {
		        flag = 0;
		        break;
		      }
		    }
		  }
		  return flag;
		}
}
