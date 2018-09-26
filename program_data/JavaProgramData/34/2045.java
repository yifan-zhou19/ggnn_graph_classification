package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int m;
		  int n;
		  int i;
		  int j;
		  int k;
		  int l;
		  int sum;
		  int t;
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   m = Integer.parseInt(tempVar);
		   }
		  while (m > 1)
		  {
				if (m % 2 == 1)
				{
				  System.out.printf("%d*3+1=%d\n",m,m * 3 + 1);
				  m = m * 3 + 1;
				}
				  else
				  {
					   System.out.printf("%d/2=%d\n",m,m / 2);
					  m = m / 2;
				  }
		  }
	   System.out.print("End");

	}

}

