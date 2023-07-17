package array;

public class isWave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = isWave(new int[]{7, 2, 9, 10, 5});
		System.out.println(result);
	}
	static int isWave(int[] a) {
		  int len = a.length;
		  int count = 1;
		  for (int i = 0; i < len - 1; i++) {
		    if ((a[i] % 2 == 0 && a[i + 1] % 2 == 0) || (a[i] % 2 != 0 && a[i + 1] %
		        2 != 0)) {
		    	count = 0;
		      break;
		    }
		  }
		  return count;
		}
}
