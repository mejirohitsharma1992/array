package array;

public class hasSingleMode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = hasSingleMode(new int[]{11, 2, 9, 2, 8});
		System.out.println(result);
	}
	static int hasSingleMode(int[] a) {
		  int len = a.length;
		  int maxCount = 0, flag = 0, result = 0;
		  for (int i = 0; i < len; i++) {
		    int count = 0;
		    for (int j = 0; j < len; j++) {
		      if (a[i] == a[j]) {
		        count++;
		      }
		    }
		    if (count > maxCount) {
		      maxCount = count;
		      result = a[i];
		      flag = 1;
		    } else if (count == maxCount && a[i] != result) {
		      flag = 0;
		    }
		  }
		  return flag;
		}
}
