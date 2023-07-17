package array;

public class minDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = minDistance(63);
		System.out.println(result);
		int result1 = minDistance(25);
		System.out.println(result1);
		int result2 = minDistance(11);
		System.out.println(result2);
	}
//	public static int minDistance(int n)
//    {
//        int minDist = n, count = 0, f1 = 0;
//        for (int i = 2; i < n; i++)
//        {
//            if (n % i == 0)
//            {
//                if (count == 0)
//                    f1 = i;
//                count++;
//                if (count > 1)
//                {
//                    if (minDist > i - f1)
//                        minDist = i - f1;
//                    f1 = i;
//                }
//
//            }
//            
//            if (count == 1 && i == n - 1)
//                minDist = i - i;
//        }
//        if (count == 0)
//        {
//            return -1;
//        }
//        return minDist;
//
//    }
//	static int minDistance(int n) {
//		int s=1;
//		int dis=n;
//		int count=0;
////		int i=2;
//		for(int i=2;i<n;i++) {
//			while(n>1) {
//				if(n%i==0) {
//					if(count==0) {
//						int a=i;
//						s=s*a;
//						i++;
//					}else {
//						i++;
//					}
//					
//					System.out.println(s+"\n");
//					n=n/i;
//					System.out.println(n+"\n");
//					
//				}else {
//					break;
//				}
//				i++;
//			}
//		}
//		if(dis==n) {
//			count=-1;
//		}else {
//			count=s-n;
//		}
//		return count;
//	}
	static int minDistance(int n) {
		int count=0,s=1,i,a=0;
		for(i=2;i<n;i++) {
			if(n%i==0) {
				if(count==0) {
					a=i;
					
				}
				count++;
				s=s*a;
				n=n/i;
				i=2;
				System.out.println(count+"\t"+s+"\t"+n);
		}
			
	}
		s=s-n;
		if(count==1) {
			return 0;
		}
		if(count>1) {
			return s;
		}else {
			return -1;
		}
	}

}
