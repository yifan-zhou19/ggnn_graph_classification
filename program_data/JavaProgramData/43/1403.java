package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] prime = new int[10010];
		int m;
		int i;
		int j;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		prime[1] = 1;
		for (i = 2;i <= 100;i++)
		{
			for (j = i + 1;j <= m;j++)
			{
				if (j % i == 0)
				{
					prime[j] = 1;
				}
			}
		}

		for (j = 3;j <= m / 2;j = j + 2)
		{
			if (prime[j] == 0 && prime[m - j] == 0)
			{
				System.out.printf("%d %d\n\n",j,m - j);
			}
		}
	}

}

