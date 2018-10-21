package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m = 1;
		int n;
		int k;
		int i;
		int t;

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
		for (m = 1;;m++)
		{
			t = m;
			for (i = 1;i <= n;i++)
			{
				if (t % n == k)
				{
					t = t - t / n - k;
				}
				else
				{
					break;
				}
			}
			if (i > n && t >= 1)
			{
				System.out.printf("%d\n",m);
				break;
			}
		}
		return 0;
	}



}

