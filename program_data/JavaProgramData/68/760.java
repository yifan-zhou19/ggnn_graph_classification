package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int t;
		int m;
		float a;
		float b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (m = 6;m <= n;m++)
		{
			if (m % 2 == 0)
			{
			System.out.printf("%ld=",m);
			for (i = 3;i <= m - 3;i++)
			{
				a = Math.sqrt(i);
			  for (k = 2;k <= a;k++)
			  {
				  if (i % k == 0)
				  {
					  break;
				  }
			  }
			  if (k > a)
			  {
				  t = m - i;
				  b = Math.sqrt(t);
				  for (j = 2;j <= b;j++)
				  {
					  if (t % j == 0)
					  {
						  break;
					  }
				  }
				if (j > b)
				{
					System.out.printf("%d+%d\n",i,t);
				break;
				}
			  }
			}
			}

		}
	}
}

