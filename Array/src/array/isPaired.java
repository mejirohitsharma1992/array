package array;

public class isPaired {
	public static void main(String[] args) {
		int result = isPaired(new int[]{7, 15, 9, 2, 3});
		System.out.println(result);
	}
	static int isPaired(int[] a) {
		  int len = a.length;
		  int count = 1;
		  for (int i = 0; i < len; i++) {
		    if (i % 2 == 0 && a[i] % 2 == 0) {
		    	count = 0;
		      break;
		    }
		    if (i % 2 != 0 && a[i] % 2 != 0) {
		    	count = 0;
		      break;
		    }
		  }
		  return count;
		}
}
