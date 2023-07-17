package array;

public class isMeeraaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = isMeeraaa(6);
		System.out.println(result);
	}
	static int isMeeraaa(int n) {
		  int flag = 0, count = 0;
		  for (int i = 2; i < n; i++) {
		    if (n % i == 0) {
		      count++;
		    }
		  }
		  for (int i = 2; i < n; i++) {
		    if (n % i == 0 && count == i) {
		      flag = 1;
		      break;
		    }
		  }
		  return flag;
		}
}
