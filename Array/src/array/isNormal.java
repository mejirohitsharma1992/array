package array;

public class isNormal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = isNormal(8);
		System.out.println(result);
	}
	static int isNormal(int n) {
		  int count = 1;
		  for (int i = 2; i < n; i++) {
		    if (n % i == 0) {
		      if (i % 2 != 0) {
//		    	  System.out.println(i+"\t"+n);
		    	  count = 0;
		        break;
		      }
		    }
		  }
		  return count;
		}
}
