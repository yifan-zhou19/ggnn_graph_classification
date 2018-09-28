package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int t;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= m / 2;i = i + 2)
		{
			for (j = 3;j < i;j = j + 2)
			{
				if (i % j == 0)
				{
					break;
				}
			}
			if (j < i)
			{
				continue;
			}
			else
			{
				t = m - i;
				for (k = 3;k < t;k = k + 2)
				{
					if (t % k == 0)
					{
						break;
					}
				}
				if (k == t)
				{
					System.out.printf("%d %d\n",i,t);
				}
			}
		}
		return 0;
	}
}

