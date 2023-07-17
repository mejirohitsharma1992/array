package array;

public class largestDifferenceOfEvens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = largestDifferenceOfEvens(new int[]{4, 3, -2, 9});
		System.out.println(result);
	}
	/*
	static int largestDifferenceOfEvens(int[] a) {
		  int len = a.length;
		  int largestDiff = 0, distance = 0, count = 0;
		 
		  for (int i = 0; i < len; i++) {
		    if (a[i] % 2 == 0) {
		      for (int j = 0; j < len; j++) {
		        if (a[j] % 2 == 0) {
		        	System.out.println(i+""+j);
		          if (a[i] > a[j]) {
		            distance = a[i] - a[j];
		 
		            if (distance > largestDiff) {
		              largestDiff = distance;
		            }
		          }
		        }
		      }
		 
		      count++;
		    }
		  }
		 
		  if (count == 0) {
		    return -1;
		  }
		 
		  return largestDiff;
		}
		*/
	public static int largestDifferenceOfEvens(int[] a)
    {
        int largestDiff = 0;

        int maxevent = 0, minevent = 0, eventcount = 0;
        
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] % 2 == 0)
            {
                if (eventcount == 0)
                {
                    maxevent = a[i];
                    minevent = a[i];
                }
                eventcount++;
                if (a[i] > maxevent)
                {
                    maxevent = a[i];
                }
                if (a[i] < minevent)
                {
                    minevent = a[i];
                }


            }
        }
        largestDiff = maxevent - minevent;

        if (eventcount < 2)
        {
            largestDiff = -1;
        }

        return largestDiff;



    }
}
