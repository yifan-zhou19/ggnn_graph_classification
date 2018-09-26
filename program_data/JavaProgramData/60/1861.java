package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int n;
		int m;
		int k;
		int j;
		int i;
		int a;
		int r = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (n = 2;n <= (N - 2);n++)
		{
				  k = Math.sqrt(n);
			   for (i = 2;i <= k;i++)
			   {
				 if (n % i == 0)
				 {
					 break;
				 }
			   }
			   if (i >= k + 1)
			   {
					 m = n + 2;
					 j = Math.sqrt(m);
					   for (a = 2;a <= j;a++)
					   {

					   if (m % a == 0)
					   {
						   break;
					   }
					   }
					   if (a >= j + 1)
					   {
					   System.out.printf("%d %d\n",n,m);
					   r = r + 1;
					   }
			   }
		}

		 if (r == 0)
		 {
		 System.out.print("empty");
		 }

	}
}

