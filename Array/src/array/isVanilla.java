package array;

public class isVanilla {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = isVanilla(new int[]{1, 1, 11, 1111, 1111111});
		System.out.println(result);
	}
	static int isVanilla(int[] a) {
		  int len = a.length;
		  int flag = 1, rem = 0, n = 0, firstDigit = 0;
		  if (len > 0) {
		    firstDigit = a[0] % 10;
		  }
		  for (int i = 0; i < len; i++) {
		    if (a[i] < 0)
		      a[i] = -1 * a[i];
		    n = a[i];
		    while (n > 0) {
		      rem = n % 10;
		      if (rem != firstDigit) {
		        flag = 0;
		        break;
		      }
		      n = n / 10;
		    }
		  }
		  return flag;
		}
}
