package array;

public class isFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = isFilter(new int[]{7, 2,9,11, 13, 6, 7});
		System.out.println(result);
	}
	static int isFilter(int[] a) {
	    int len = a.length;
	    int a_flag = 1, b_flag = 1;
	    for (int i = 0; i < len; i++) {
	      if (a[i] == 9) {
	        for (int j = 1; j < len; j++) {
	          if (a[j] == 11) {
	            a_flag = 1;
	            break;
	          } else {
	            a_flag = 0;
	          }
	        }
	      }
	      if (a[i] == 7) {
	        for (int j = 1; j < len; j++) {
	          if (a[j] == 13) {
	            b_flag = 0;
	            break;
	          } else {
	            b_flag = 1;
	          }
	        }
	      }
	    }
	    if (a_flag == 1 && b_flag == 1) {
	      return 1;
	    } else {
	      return 0;
	    }
}
	
	}
