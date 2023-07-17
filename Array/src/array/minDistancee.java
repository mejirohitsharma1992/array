package array;

public class minDistancee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = minDistancee(1001);
		System.out.println(result);
		int result1 = minDistancee(8);
		System.out.println(result1);
		int result2 = minDistancee(15);
		System.out.println(result2);
	}
//	static int minDistancee(int n) {
//		  int minDis = n;
//		  int dist = 0;
//		  for (int i = 1; i <= n; i++) {
//		    if (n % i == 0) {
//		      for (int j = 1; j <= n; j++) {
//		        if (n % j == 0) {
//		          if (i > j) {
//		            dist = i - j;
//		            if (dist < minDis) {
//		              minDis = dist;
//		            }
//		          }
//		        }
//		      }
//		    }
//		  }
//		  return minDis;
//		}
	static int minDistancee(int n) {
		int minDistance=n;
		int i=1,j=1,d=0;
		while(n>1) {
			if(n%i==0) {
				if(j!=i) {
					d=i-j;
					j=i;
				}
				n=n/i;
//				i=1;
				if(minDistance>d && d!=0) {
					System.out.println(minDistance+"\t"+d+"\t"+n+"\t"+i+"\t"+j);
					minDistance=d;
				}
			}
			i++;
		}
		return minDistance;
	}
}
