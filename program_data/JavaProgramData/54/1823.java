package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int m;
		int y = 0;
		int i;
		int p;
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
		for (m = 1; y != n; m++)
		{
			p = m;
			y = 0;
			for (i = 1; i <= n; i++)
			{
				if (i < n)
				{
					if (p % n == k)
					{
						p = p - p / n - p % n;
						y++;
					}
					else
					{
						break;
					}
				}
				else
				{
					if (p <= n)
					{
						break;
					}
					else if (p % n != k)
					{
						break;
					}
					else
					{
						y++;
					}
				}
			}
		}
		System.out.printf("%d", m - 1);
		return 0;
	}
}

