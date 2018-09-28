package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int k;
		int s = 0;
		char[][] a = new char[100][100];
		char[][] b = new char[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			scanf("\n");
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead(null, 1);
				if (tempVar2 != null)
				{
					a[i][j] = tempVar2.charAt(0);
				}
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		for (k = 1;k < m;k++)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					b[i][j] = a[i][j];
				}
			}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
			if (b[i][j] == '@')
			{
				if (i > 0 && b[i - 1][j] == '.')
				{
					a[i - 1][j] = '@';
				}
				if (i < n - 1 && b[i + 1][j] == '.')
				{
					a[i + 1][j] = '@';
				}
				if (j > 0 && b[i][j - 1] == '.')
				{
					a[i][j - 1] = '@';
				}
				if (j < n - 1 && b[i][j + 1] == '.')
				{
					a[i][j + 1] = '@';
				}
			}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == '@')
				{
					s += 1;
				}
			}
		}
		System.out.printf("%d",s);
		return 0;
	}
}

