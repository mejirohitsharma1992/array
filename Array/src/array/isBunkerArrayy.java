package array;

public class isBunkerArrayy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = isBunkerArrayy(new int[]{8, 1, 10, 7});
		System.out.println(result);
	}
	public static int isBunkerArrayy(int [] a)
    {
		int len=a.length;
        int count =0;
        for(int i=0;i<len;i++)
        {   
            if(isPrime(a[i]))
            {
                for (int j = 0; j < len; j++)
                {
                    if (a[j] == 1)
                    {
                    	count = 1;
                        break;
                    }
                }
            }
           
        }
        return count;
    }
    public  static boolean isPrime(int n)
    {
        boolean b = true;
        if (n <= 0)
            b=false;
        if (n == 1)
            b=false;
        for(int i=2;i<=n/2;i++)
        {
            if(n%2==0)
            {
               b=false;
               break;
            }
        }
        return b;

    }

}
