package array;

public class isBunker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = isBunker(11);
		System.out.println(result);
	}
	static int isBunker(int n) {
		  int temp = 0, i = 1, future_ele = 1, flag = 0;
		  while (temp <= n) {
		    temp = future_ele;
		    future_ele += i;
		    i++;
//		    Console.WriteLine("{0}", temp);
//		    System.out.println(temp);
		    if (temp == n) {
		      flag = 1;
		      break;
		    }
		  }
		  return flag;
		}
}
