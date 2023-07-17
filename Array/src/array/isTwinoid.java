package array;

public class isTwinoid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = isTwinoid(new int[]{2, 2, 1, 7, 2});
		System.out.println(result);
	}
//	static int isTwinoid(int[] a) {
//		  int len = a.length;
//		  if (len < 1)
//		    return 0;
//		  for (int i = 0; i < len; i++) {
//		    if (a[i] % 2 == 0) {
//		      i++;
//		      if (a[i] % 2 == 0) {
//		        i++;
//		        for (; i < len; i++) {
//		          if (a[i] % 2 == 0) {
//		            return 0;
//		          }
//		        }
//		        return 1;
//		      } else {
//		        return 0;
//		      }
//		    }
//		  }
//		  return 0;
//		}
	static int isTwinoid(int[] a) {
		int count=0;
		int i;
		int len=a.length;
		for(i=0;i<len-1;i++) {
		if(a[i]%2==0&& a[i+1]%2==0) {
			count++;
		}
		}
		if(count==1) {
			return 1;
		}else {
			return -1;
		}
	}
}
