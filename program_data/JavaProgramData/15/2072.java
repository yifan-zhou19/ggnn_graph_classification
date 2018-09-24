package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t = 0;
		int s = 0;
		int m = 0;
		int l = 0;
		int a;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		t = n,s = n;
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a = Integer.parseInt(tempVar2);
				}
				if (a == 0)
				{
					if ((m + l) <= (i + j))
					{
					m = i,l = j;
					}
					if ((t + s) >= (i + j))
					{
					t = i,s = j;
					}
				}
			}
		}
		q = (m - t - 1) * (l - s - 1);
		System.out.printf("%d",q);
		return 0;
	}
}

