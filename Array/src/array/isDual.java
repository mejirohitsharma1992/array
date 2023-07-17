package array;

public class isDual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = isDual(new int[]{1, 2, 1, 3,3, 2});
		System.out.println(result);
	}
	static int isDual(int[] a) {
		  int len = a.length, count = 0, flag = 0;
		  for (int i = 0; i < len; i++) {
		    for (int j = 0; j < len; j++) {
		      if (a[i] == a[j]) {
		        count++;
		      }
		    }
		    if (count == 2) {
		      flag = 1;
		      count = 0;
		    } else {
		      flag = 0;
		      break;
		    }
		  }
		  return flag;
		}
}
