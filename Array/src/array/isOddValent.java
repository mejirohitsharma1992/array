package array;

public class isOddValent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = isOddValent(new int[]{1, 3, 0,6, 5, 7});
		System.out.println(result);
	}
	static int isOddValent(int[] a) {
		  int len = a.length;
		  int oddCount = 0, duplicateCount = 0, count = 0;
		  for (int i = 0; i < len; i++) {
		    if (a[i] % 2 != 0) {
		    	oddCount = 1;
		    }
		    for (int j = 0; j < len; j++) {
		      if (a[i] == a[j]) {
		        count++;
		      }
		    }
		    if (count > 1) {
		      duplicateCount = 1;
		    }
		    if (count > 0) {
		      count = 0;
		    }
		  }
		  if (duplicateCount == 1 && oddCount == 1) {

		    return 1;
		  } else {
		    return 0;
		  }
		}

}
