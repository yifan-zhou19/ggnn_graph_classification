package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int k;
	int m;
	int num = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	char[][] s = new char[n][n + 1];
	int[][] a = new int[n][n];
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		s[i] = tempVar2.charAt(0);
	}
	}
	for (j = 0;j < n;j++)
	{
			for (k = 0;k < n;k++)
			{
				a[j][k] = 0;
			}
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		m = Integer.parseInt(tempVar3);
	}
	if (m == 1)
	{
		for (i = 0;i < n;i++)
		{
		for (j = 0;j < n;j++)
		{
			if (s[i][j] == '@')
			{
			a[i][j] = 1;
			}
		}
		}
	}
	else
	{
			for (i = 0;i < m - 1;i++)
			{
		for (j = 0;j < n;j++)
		{
			for (k = 0;k < n;k++)
			{
			if (s[j][k] == '@' && a[j][k] != i + 10)
			{
			a[j][k] = 1;
			if (j + 1 < n)
			{
				if (s[j + 1][k] == '.' && a[j][k] != i + 10)
				{
			s[j + 1][k] = '@';
			a[j + 1][k] = i + 10;
				}
			}
			if (j - 1 >= 0)
			{
				if (s[j - 1][k] == '.' && a[j][k] != i + 10)
				{
			s[j - 1][k] = '@';
			a[j - 1][k] = i + 10;
				}
			}
			if (k + 1 < n)
			{
				if (s[j][k + 1] == '.' && a[j][k] != i + 10)
				{
			s[j][k + 1] = '@';
			a[j][k + 1] = i + 10;
				}
			}
			if (k - 1 >= 0)
			{
				if (s[j][k - 1] == '.' && a[j][k] != i + 10)
				{
			s[j][k - 1] = '@';
			a[j][k - 1] = i + 10;
				}
			}
			}
			}
		}
			}
	}
	for (j = 0;j < n;j++)
	{
			for (k = 0;k < n;k++)
			{
				if (a[j][k] != 0)
				{
				num++;
				}
			}
	}
	System.out.printf("%d",num);
	return 0;
	}



}

