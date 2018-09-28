package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int n;
		int l;
		int[][] s = new int[100][100];
		int m;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			l = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			for (k = 0;k < l;k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					s[i][k] = Integer.parseInt(tempVar3);
				}
			}
		}
		if (n >= l)
		{
			for (m = 0;m < l;m++)
			{
				for (i = 0,k = m;i<n,k >= 0;i++,k--)
				{
					System.out.printf("%d\n",s[i][k]);
				}
			}
			for (m = l;m < n;m++)
			{
				for (i = m + 1 - l;i <= m;i++)
				{
					k = m - i;
					System.out.printf("%d\n",s[i][k]);
				}
			}
			for (m = n;m < n + l - 1;m++)
			{
				for (i = m + 1 - l;i < n;i++)
				{
					k = m - i;
					System.out.printf("%d\n",s[i][k]);
				}
			}
		}
		else
		{
			for (m = 0;m < n;m++)
			{
				for (i = 0,k = m;i<n,k >= 0;i++,k--)
				{
					System.out.printf("%d\n",s[i][k]);
				}
			}
			for (m = n;m < l;m++)
			{
				for (i = 0,k = m;i<n,k> m - n;i++,k--)
				{
					System.out.printf("%d\n",s[i][k]);
				}
			}
			for (a = 1;a < n;a++)
			{
				for (i = a,k = l - 1;i<n,k >= l - n + a;i++,k--)
				{
					System.out.printf("%d\n",s[i][k]);
				}
			}
		}
		return 0;
	}
}

