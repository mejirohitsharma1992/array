package array;

public class isAllPossibilites {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = isAllPossibilites(new int[]{1, 2, 4, 3});
		System.out.println(result);
	}
//	static int isAllPossibilites(int[] a) {
//		  int len = a.length;
//		  if (len == 0) {
//		    return 0;
//		  }
//		  int flag = 1, count = 0;
//		  for (int i = 0; i < len; i++) {
//		    for (int j = 0; j < len; j++) {
//		      if (a[i] == j) {
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
	static int isAllPossibilites(int[] a) {
		int i,count = 0;
		int len=a.length;
//		 if (len == 0) {
//			    return 0;
//			  }
		for(i=0;i<len;i++) {
			if(a[i]<len) {
				count=1;
			}else {
				count=0;
				break;
			}
		}
		return count;
	}
}
