package array;

public class maxOccurDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = maxOccurDigit(327277);
		System.out.println(result);
	}
	static int maxOccurDigit(int n) {
		  if (n < 0) n = -n;
		  int maxCount = 0, result = 0;
		  boolean flag = false;
		  for (int i = 0; i < 9; i++) {
		    int count = 0, temp = n;
		    temp = n;
		    while (temp > 0) {
		      if (temp % 10 == i) {
		        count++;
		      }
		      temp /= 10;
		    }
		    if (count > maxCount) {
		      maxCount = count;
		      flag = true;
		      result = i;
		    } else if (count == maxCount) {
		      flag = false;
		    }
		  }
		  if (!flag) return -1;
		  return result;
		}
}
