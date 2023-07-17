package array;

public class isPascal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = isPascal(6);
		System.out.println(result);
	}
	static int isPascal(int n) {
		  int flag = 0, sum = 0, i = 1;
		  while (sum <= n) {
		    sum += i;
		    if (sum == n) {
		      flag = 1;
		      break;
		    }
		    i++;
		  }
		  return flag;
		}
}
