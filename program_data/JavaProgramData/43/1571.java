package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int q;
		int p;
		int j;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (m = 2;m <= n / 2;m++)
	 {
	   for (i = 2;i <= m - 1;i++)
	   {
			 q = i;
			 if (m % i == 0)
			 {
			 break;
			 }
	   }
	   if (q == m - 1)
	   {
		for (j = 2;j <= n - m - 1;j++)
		{
			p = j;
			 if ((n - m) % j == 0)
			 {
			 break;
			 }
		}

		   if (p == n - m - 1)
		   {
			   System.out.printf("%d %d\n",m,n - m);
		   }

	   }
	 }


	}
}

