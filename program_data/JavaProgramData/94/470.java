package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int[] z = new int[H];
		int i;
		int k;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				z[i] = Integer.parseInt(tempVar2);
			}
		}
		for (k = 1;k <= N;k++)
		{
			for (i = 0;i < N - k;i++)
			{
				if (z[i] % 2 != 0 && z[i] < z[i + 1])
				{
					c = z[i];
					z[i] = z[i + 1];
					z[i + 1] = c;

				}
				else if (z[i] % 2 != 0 && z[i + 1] % 2 == 0)
				{
				c = z[i];
					z[i] = z[i + 1];
					z[i + 1] = c;

				}
			}
		}
			for (k = N - 1;k >= 0;k--)
			{
				if (z[k - 1] % 2 != 0)
				{
					System.out.printf("%d,",z[k]);
				}
					else
					{
						System.out.printf("%d",z[k]);
						return 0;
					}

			}
				return 0;

	}



}

