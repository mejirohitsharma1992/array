package array;

public class isMeera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = isMeera(new int[]{2, 8, 7, 10, -4, 6});
		System.out.println(result);
	}
	static int isMeera(int[] a) {
		  int len = a.length;
		  int firstCount = 0, lastCount = 0, oddFlag = 0;
		  for (int i = 0; i < len; i++) {
		    if (a[i] % 2 == 0) {
		      firstCount++;
		    } else {
		      break;
		    }
		  }
		  for (int j = len - 1; j >= 0; j--) {
		    if (a[j] % 2 == 0) {
		      lastCount++;
		    } else {
		      break;
		    }
		  }
		  for (int k = 0; k < len; k++) {
		    if (a[k] % 2 != 0) {
		      oddFlag = 1;
		      break;
		    }
		  }
		  if (firstCount == lastCount && oddFlag == 1) {
		    return 1;
		  } else {
		    return 0;
		  }
		}
//	public static int isMeera(int [] a){
//		boolean hasOdd = false;
//		int firstEven = 0;
//		int lastEven = 0;
//		boolean firstCountEnd = false;
//		boolean lastCountEnd = false;
//		for(int i = 0; i<a.length; i++){
//		    if (a[i]%2 == 1)
//		            {
//		                hasOdd = true;
//		                break;
//		            }
//		}
//		if (!hasOdd)
//		    return 0;
//
//		for (int j = 0; j<a.length; j++){
//		    if(a[j]%2==1)
//		        firstCountEnd=true;
//		    if(!firstCountEnd && a[j]%2==0)
//		        firstEven++;
//		    if(a[(a.length-1)-j]%2==1)
//		        lastCountEnd=true;
//		    if(!lastCountEnd && a[(a.length-1)-j]%2==0)
//		        lastEven++;
//		}
//		//System.out.println(firstEven +" " +lastEven);
//		if (hasOdd && firstEven == lastEven)
//
//		    return 1;
//		return 0;
//		} 
}
