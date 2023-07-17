package array;

public class isBalanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = isBalanced(new int[]{-2, 3, 2, -3});
		System.out.println(result);
	}
	static int isBalanced(int[] a) {
		  int len = a.length;
		  int count = 0, flag = 1;
		  for (int i = 0; i < len; i++) {
		    for (int j = 0; j < len; j++) {
		      if ((a[i] + a[j]) == 0) {
		        count++;
		      }
		    }
		    if (count == 0) {
		      flag = 0;
		      break;
		    } else {
		      count = 0;
		    }
		  }
		  return flag;
		}
}
