package array;

public class isOddHeavy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//mistake somewhere
		int result = isOddHeavy(new int[]{11, 4, 9, 2, 8});
		System.out.println(result);
	}
	static int isOddHeavy(int[] a) {
		  int len = a.length;
		  int flag = 0;
		  for (int i = 0; i < len; i++) {
		    if (a[i] % 2 != 0) {
		      for (int j = 0; j < len; j++) {
		        if (a[j] % 2 == 0) {
		          if (a[i] < a[j]) {
		            flag = 0;
		            break;
		          }
		        }
		      }
		    }
		  }
		  return flag;
		}
}
