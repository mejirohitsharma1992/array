package array;

public class isMaxMinEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = isMaxMinEqual(new int[]{11, 4, 9, 11, 8, 11 ,4, 4, 10});
		System.out.println(result);
	}
//	static int isMaxMinEqual(int[] a) {
//		  int len = a.length;
//		  int max = a[1], min = a[1], maxCount = 0, minCount = 0;
//		  if (len < 2) {
//		    return 0;
//		  }
//		  for (int i = 0; i < len; i++) {
//		    if (a[i] > max) {
//		      max = a[i];
//		    }
//		    if (a[i] < min) {
//		      min = a[i];
//		    }
//		  }
//		  for (int j = 0; j < len; j++) {
//		    if (min == a[j]) {
//		      minCount++;
//		    }
//		    if (max == a[j]) {
//		      maxCount++;
//		    }
//		  }
//		  if (minCount == maxCount && min != max) {
//		    return 1;
//		  }
//		  return 0;
//		}
	static int isMaxMinEqual(int[] a) {
		  int len = a.length;
		  int minNumber=0,maxNumber=0,i,count=0,max=0,j,min=0;
		  for(i=0;i<len;i++) {
			  if(count==0) {
				  minNumber=a[i];
				  maxNumber=a[i];
				  count++;
			  }
			  if(a[i]>maxNumber) {
				  maxNumber=a[i];
			  }
			  if(a[i]<minNumber) {
				  minNumber=a[i];
			  }
		  }
		  for(j=0;j<len;j++) {
			  if(a[j]==maxNumber) {
				  max++;
			  }
			  if(a[j]==minNumber) {
				  min++;
			  }
		  }
		  if(max==min &&minNumber!=maxNumber) {
			  return 1;
		  }
		  return 0;
		}

}
