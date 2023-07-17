package array;

public class isMeeraa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = isMeeraa(new int[]{3, 5,6, -2});
		System.out.println(result);
	}
	static int isMeeraa(int[] a) {
		  int len = a.length;
		  int count = 1;
		  for (int i = 0; i < len; i++) {
		    for (int j = 0; j < len; j++) {
		      if (a[i] == 2 * a[j]) {
		    	  count = 0;
		        break;
		      }
		    }
		  }
		  return count;
		}

}
