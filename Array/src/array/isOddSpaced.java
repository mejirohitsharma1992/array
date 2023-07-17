package array;

public class isOddSpaced {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = isOddSpaced(new int[]{2,4,5,6,9});
		System.out.println(result);
	}
	static int isOddSpaced(int[] a) {
		  int len = a.length;
//		  int min = a[0], max = a[0];
		  int maxNumber=0,minNumber=0,count=0;
		  for (int i = 0; i < len; i++) {
			  if(count==0) {
				  maxNumber=a[i];
				  minNumber=a[i];
			  }
			  count++;
		    if (a[i] > maxNumber)
		    	maxNumber = a[i];
		    if (a[i] < minNumber)
		    	minNumber = a[i];
		  }
		  if(count<2) {
			  return 0;
		  }
		  int diff=maxNumber - minNumber;
		  if (diff % 2 != 0)
		    return 1;
		  return 0;
		}
}
