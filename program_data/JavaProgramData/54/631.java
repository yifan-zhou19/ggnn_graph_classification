package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int k;
		int z;
		int r;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (m = n;;m++)
		{
			r = m;
			for (i = 1;i <= n;i++)
			{
				z = m - m / n * n;
				if (z != k)
				{
					break;
				}
				else
				{
					m = m / n * n - m / n;
				}
			}
			if (i == n + 1 && m >= 1)
			{
				System.out.printf("%d\n",r);
				break;
			}
			else
			{
			m = r;
			}

		}
		return 0;
	}

}

