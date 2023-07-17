package array;

public class isDaphne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = isDaphne(new int[]{1,1, 3,1, 2});
		System.out.println(result);
	}
//	static int isDaphne(int[] a) {
//		  int len = a.length;
//		  int flag = 1, isEven = 0;
//		  if (a[0] % 2 == 0) {
//		    isEven = 1;
//		  }
//		  for (int i = 0; i < len; i++) {
//		    if (isEven == 1) {
//		      if (a[i] % 2 != 0) {
//		        flag = 0;
//		        break;
//		      }
//		    } else {
//		      if (a[i] % 2 == 0) {
//		        flag = 0;
//		        break;
//		      }
//		    }
//		  }
//		  return flag;
//		}
	static int isDaphne(int[] a) {
		int count=0,i;
		int len=a.length;
		for(i=0;i<len-1;i++) {
			if((a[i]%2==0 && a[i+1]%2==0)||(a[i]%2!=0 && a[i+1]%2!=0)) {
				count=1;
			}else {
				count=0;
				break;
			}
		}
		return count;
	}
}
