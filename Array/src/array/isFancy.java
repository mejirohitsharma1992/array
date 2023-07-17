package array;

public class isFancy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = isFancy(1);
		System.out.println(result);
	}
	static int isFancy(int n) {
		  if (n == 0)
		    return 0;
		  int preFirst = 1, preSecond = 1, fancy = 1, flag = 0;
		  while (fancy <= n) {
		    if (fancy == n) {
		      flag = 1;
		      break;
		    }
		    preFirst = preSecond;
		    preSecond = fancy;
		    fancy = 3 * preSecond + 2 * preFirst;
		  }
		  return flag;
		}

}
