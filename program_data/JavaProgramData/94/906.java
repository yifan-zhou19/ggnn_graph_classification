package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] s = new int[600];
		int i;
		int k;
		int j = 0;
		int n;
		int e;
		int m;
		int u;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				u = Integer.parseInt(tempVar2);
			}
			if (u % 2 != 0)
			{
				s[j] = u;
				m = j;
				j++;
			}
		}

		for (j = 0;j <= m;j++)
		{
			for (k = 0;k < m - j;k++)
			{
				if (s[k] > s[k + 1])
				{
					e = s[k];
					s[k] = s[k + 1];
					s[k + 1] = e;
				}
			}
		}
		for (j = 0;j <= m;j++)
		{
			if (j != m)
			{
				System.out.printf("%d,",s[j]);
			}
			else
			{
				System.out.printf("%d",s[j]);
			}
		}
		return 0;
	}
}

