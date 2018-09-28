package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int k;
		int m;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i < (n / 2 + 1);i += 2)
		{
			m = 0;
			for (k = 2;k < i / 2;k++)
			{
				if (i % k == 0)
				{
					m = 1;
					break;
				}
			}
			if (m == 0)
			{
			for (l = 3;l < ((n - i) / 2 + 1);l++)
			{
				if ((n - i) % l == 0)
				{
					m = 1;
					break;
				}
			}
			}
			if (m == 0)
			{
				System.out.printf("%d %d\n",i,n - i);
			}
		}
		return 0;
	}
}

