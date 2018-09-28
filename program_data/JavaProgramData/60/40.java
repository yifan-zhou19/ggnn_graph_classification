package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int m;
		int x = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (m = 3;m <= n - 2;m = m + 2)
		{
			for (i = 3;i <= Math.sqrt(m);i++)
			{
				if (m % i == 0)
				{
					break;
				}
			}
			if (i > Math.sqrt(m))
			{
				for (k = 3;k <= Math.sqrt(m + 2);k++)
				{
					if ((m + 2) % k == 0)
					{
						break;
					}
				}
				if (k > Math.sqrt(m + 2))
				{
					System.out.printf("%d %d\n",m,m + 2);
				x = 1;
				}
			}
		}

		if (x == 0)
		{
			System.out.print("empty\n");
		}
		return 0;
	}
}

