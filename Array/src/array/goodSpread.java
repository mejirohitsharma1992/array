package array;

public class goodSpread {
	public static void main(String[] args) {
		int result = goodSpread(new int[]{2, 1, 2,2, 5, 2, 1, 5, 9});
		System.out.println(result);
		int result1 = goodSpread(new int[]{3, 1, 3 ,1, 0, 5, 5, 3});
		System.out.println(result1);
	}
	static int goodSpread(int[] a) {
		  int len = a.length;
		  int count = 0, flag = 1;
		  for (int i = 0; i < len; i++) {
		    for (int j = 0; j < len; j++) {
		      if (a[i] == a[j]) {
		        count++;
		      }
		    }
		    if (count > 3) {
//		      flag = 0;
		    	return 0;
//		      break;
		    }
		    count = 0;
		  }
		  return flag;
		}
	
}
