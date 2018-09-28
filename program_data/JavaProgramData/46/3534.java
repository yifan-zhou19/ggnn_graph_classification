package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int r;
		int c;
		int i;
		int j;
		int e;
		int k;
		int m;
		int n;
		int l;
		int[][] s = new int[101][101];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < r;i++)
		{
			for (j = 0;j < c;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					s[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		e = r * c;
		for (i = 0;;i++)
		{
			for (k = i;k < c - i;k++)
			{
				System.out.printf("%d\n",s[i][k]);
				e--;
				if (e == 0)
				{
					return 0;
				}
			}
			for (m = i + 1;m < r - i;m++)
			{
				System.out.printf("%d\n",s[m][c - 1 - i]);
				e--;
				if (e == 0)
				{
					return 0;
				}
			}
			for (n = c - 2 - i;n >= i;n--)
			{
				System.out.printf("%d\n",s[r - 1 - i][n]);
				e--;
				if (e == 0)
				{
					return 0;
				}
			}
			for (l = r - 2 - i;l > i;l--)
			{
				System.out.printf("%d\n",s[l][i]);
				e--;
				if (e == 0)
				{
					return 0;
				}
			}
		}
		return 0;
	}
}

