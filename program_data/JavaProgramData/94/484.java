package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] s = new int[500];
		int i;
		int[] z = new int[500];
		int m = 0;
		int k;
		int j;
		int r;
		int l = 0;
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
				(s[i]) = Integer.parseInt(tempVar2);
			}
			if ((s[i]) % 2 == 1)
			{
				z[l] = s[i];
				m++;
				l++;
			}
		}
		for (j = m - 1;j > 0;j--)
		{
			for (r = 0;r < j;r++)
			{
				if (z[r] > z[r + 1])
				{
					int t;
					t = z[r + 1];
					z[r + 1] = z[r];
					z[r] = t;

				}
			}
		}
		for (k = 0;k < m;k++)
		{
			if (k < m - 1)
			{
		System.out.printf("%d,",z[k]);
			}
			if (k == m - 1)
			{
				System.out.printf("%d",z[k]);
			}
		}
			return 0;

	}
}

