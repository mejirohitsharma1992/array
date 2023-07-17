package array;

public class isNiceArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = isNiceArray(new int[]{3, 4, 5, 7});
		System.out.println(result);
	}
//	static int isNiceArray(int[] a) {
//		  int len = a.length;
//		  int flag = 1, count = 0;
//		  for (int i = 0; i < len; i++) {
//		    for (int j = 0; j < len; j++) {
//		      if (a[j] == (a[i] + 1) || a[j] == (a[i] - 1)) {
//		        count++;
//		      }
//		    }
//		    if (count == 0) {
//		      flag = 0;
//		      break;
//		    } else {
//		      count = 0;
//		    }
//		  }
//		  return flag;
//		}
	static int isNiceArray(int[] a) {
		int count=0,i,j;
		int len=a.length;
		for(i=0;i<len;i++) {
			for(j=0;j<len;j++) {
				if(a[j] == (a[i] + 1) || a[j] == (a[i] - 1)) {
					count=1;
					break;
				}else {
					count=0;
				}
			}
		}
		return count;
	}
}
