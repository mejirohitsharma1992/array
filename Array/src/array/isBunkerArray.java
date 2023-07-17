package array;

public class isBunkerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = isBunkerArray(new int[]{25,4, 3,0, 36, 7, 4,5});
		System.out.println(result);
	}
	static int isBunkerArray(int[] a) {
		  int len = a.length;
		  int count = 0;
		  for (int i = 0; i < len - 1; i++) {
//		    if (a[i] % 2 != 0) {
//		      if (a[i + 1] == a[i] * a[i]) {
//		        count = 1;
//		        break;
//		      }
//		    }
			  if(a[i] % 2 != 0 && a[i + 1] == a[i] * a[i]) {
				  count = 1;
			        break;
			  }
		  }
		  return count;
		}
}
