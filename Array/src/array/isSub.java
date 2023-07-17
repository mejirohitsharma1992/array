package array;

public class isSub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = isSub(new int[]{13, 6, 3, 2});
		System.out.println(result);
	}
	static int isSub(int[] a) {
		  int len = a.length;
		  int flag = 1, sum = 0;
		  for (int i = len - 1; i > 0; i--) {
		    sum += a[i];
		    if (sum >= a[i - 1]) {
		      flag = 0;
		      break;
		    }
		  }
		  return flag;
		}

}
