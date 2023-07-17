package array;

public class isEvenSpaced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = isEvenSpaced(new int[]{80, -56, 11, -81});
		System.out.println(result);
	}
//	static int isEvenSpaced(int[] a) {
//		  int len = a.length;
//		  if (len < 2) {
//		    return 0;
//		  }
//		  int max = a[0], min = a[0];
//		  for (int i = 0; i < len; i++) {
//		    if (a[i] > max)
//		      max = a[i];
//		    if (a[i] < min)
//		      min = a[i];
//		  }
//		  if ((max - min) % 2 == 0) {
//		    return 1;
//		  } else {
//		    return 0;
//		  }
//		}
	static int isEvenSpaced(int[] a) {
		int i,count=0,maxNumber=0,minNumber=0;
		int len=a.length;
		for(i=0;i<len;i++) {
			if(count==0) {
				maxNumber=a[i];
				minNumber=a[i];
			}
			count++;
			if(a[i]>maxNumber) {
				maxNumber=a[i];
			}
			if(a[i]<minNumber) {
				minNumber=a[i];
			}
		}
		int diff=maxNumber-minNumber;
		if(count<2) {
			return 0;
		}
		if(diff%2==0) {
			return 1;
		}else {
			return 0;
		}
	}
}
