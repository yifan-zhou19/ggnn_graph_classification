package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int M;
		int n;
		int k;
		int X = 1;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (m = n + k + (n - 1) * (n + 2 * k);X != 0;m++)
		{
			M = m;
			for (i = 1;i <= n;i++)
			{
				if (M % n == k)
				{
					M = M - M / n - k;
				}
				else
				{
					break;
				}
			}
			if (i == n + 1)
			{
				System.out.printf("%d",m);
				X = 0;
			}
		}
	}
}

