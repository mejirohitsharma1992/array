package array;

public class sumIsPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result = sumIsPower(new int[]{8,8,8,8});
		System.out.println(result);
	}
	static boolean sumIsPower(int[] arr) {
		  int len = arr.length;
		  int sum = 0, power = 1;
		  boolean flag = false;
		  for (int i = 0; i < len; i++) {
		    sum += arr[i];
		  }
		  while (power <= sum) {
		    power *= 2;
		    if (power == sum)
		      flag = true;
		  }
		  return flag;
		}
}
