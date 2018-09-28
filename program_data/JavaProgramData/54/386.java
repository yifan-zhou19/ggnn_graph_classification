package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int m;
		int i;
		int x;
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
		for (m = n + k;;)
		{
			x = m;
			for (i = 1;i <= n;i++)
			{
				if ((x - k) % n != 0)
				{
					x = 0;
					break;
				}
				x = x - x / n - k;
				if (x < n - 1)
				{
					break;
				}
			}
			if (x >= n - 1)
			{
				System.out.printf("%d\n",m);
				break;
			}
			m = m + n;
		}
	}

}

