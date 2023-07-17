package array;

public class isSuperArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = isSuperArray(new int[]{2, 3,6, 13});
		System.out.println(result);
	}
	static int isSuperArray(int[] a) {
		  int len = a.length;
		  int count = 1,Number=a[0];
		  for (int i = 1; i < len; i++) {
		    if (Number >= a[i]) {
		      count = 0;
		      break;
		    }
		    Number += a[i];
		  }
		  return count;
		}

}
