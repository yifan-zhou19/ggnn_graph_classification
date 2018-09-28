package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int x;
		int t = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (m = 6;m <= n;m = m + 2)
		{
			for (i = 2;i <= m / 2;i++)
			{

				k = Math.sqrt(i);
				for (j = 2;j <= k;j++)
				{
					if (i % j == 0)
					{
						break;
					}
				}
				if (j >= k + 1)
				{
					x = m - i;

					k = Math.sqrt(x);
					for (j = 2;j <= k;j++)
					{
						if (x % j == 0)
						{
							break;
						}
					}
					if (j >= k + 1)
					{
						System.out.printf("%ld=%ld+%ld\n",m,i,x);
						break;
					}
				}
			}
		}
	}


}

