package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int p;
		int q;
		int N;
		double k;
		double t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= N;i = i + 2)
		{
			for (j = 3;j < i;j++)
			{
				k = Math.sqrt((double)j);
				for (p = 2;p <= k;p++)
				{
					if (j % p == 0)
					{
						break;
					}
				}
				if (p > k)
				{

					t = Math.sqrt((double)(i - j));
					for (q = 2;q <= t;q++)
					{
						if ((i - j) % q == 0)
						{
							break;
						}
					}
					if (q > t)
					{
						break;
					}
					else
					{
						continue;
					}
				}
				else
				{
					continue;
				}

			}
			System.out.printf("%d=%d+%d\n",i,j,(i - j));

		}
		return 0;
	}



}

