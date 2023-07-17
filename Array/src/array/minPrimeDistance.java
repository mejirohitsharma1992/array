package array;

public class minPrimeDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//answer is not done perfectly
		int result = minPrimeDistance(18);
		System.out.println(result);
	}
	static int minPrimeDistance(int n) {
		  int minDist = n, dist = 0;
		  for (int i = 1; i <= n; i++) {
		    if (n % i == 0 && isPrime(i)) {
		      for (int j = 1; j <= n; j++) {
		        if (n % j == 0 && isPrime(j)) {
		          if (i > j) {
		            dist = i - j;
		            if (dist < minDist) {
		              minDist = dist;
		            }
		          }
		        }
		      }
		    }
		  }
		  return minDist;
		}
}
