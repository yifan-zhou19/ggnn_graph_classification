package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
		int n;
		int a;
		int i;
		int j;
		int k;
		int t;
		int b;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (d = 6;d <= n;d += 2)
		{
		 for (a = 3;a < d;a++)
		 {
			k = Math.sqrt(a);
		   for (i = 2;i <= k;i++)
		   {
			if (a % i == 0)
			{
				break;
			}
		   }
			if (i >= k + 1)
			{
				b = d - a;
				t = Math.sqrt(b);
				for (j = 2; j <= t; j++)
				{
					if (b % j == 0)
					{
					 break;
					}
				}
				 if (j >= t + 1)
				 {
					 System.out.printf("%ld=%ld+%ld\n",d,a,b);
					 break;
				 }
			}
		 }
		}
	return 0;
	}

}

