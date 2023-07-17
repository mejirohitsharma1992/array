package array;

public class isBeanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = isBeanArray(new int[]{1, 2, 3, 9, 6, 13});
		System.out.println(result);
	}
		static int isBeanArray(int[] a) {
			  int len = a.length;
			  int firstCount = 1, secondCount = 1;
			  for (int i = 0; i < len; i++) {
			    if (a[i] == 9) {
			      for (int j = 0; j < len; j++) {
			        if (a[j] == 13) {
			        	firstCount = 1;
			          break;
			        } else {
			        	firstCount = 0;
			        }
			      }
			    }
			    if (a[i] == 7) {
			      for (int k = 0; k < len; k++) {
			        if (a[k] == 16) {
			        	secondCount = 0;
			          break;
			        } else {
			        	secondCount = 1;
			        }
			      }
			    }
			  }
			  if (firstCount == 1 && secondCount == 1) {
			    return 1;
			  } else {
			    return 0;
			  }
			}

}
