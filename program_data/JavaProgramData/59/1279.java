package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	char[][] fang = new char[101][101];
	int n;
	int i;
	int k;
	int bing = 0;
	int m;
	int j;
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
		fang[i] = tempVar2.charAt(0);
	}
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		m = Integer.parseInt(tempVar3);
	}
	for (i = 0;i < n;i++)
	{
	for (k = 0;k < n;k++)
	{
		if (fang[i][k] == '@')
		{
	fang[i][k] = 0;
		}
			if (fang[i][k] == '#')
			{
	fang[i][k] = 'y';
			}
		if (fang[i][k] == '.')
		{
	fang[i][k] = 'z';
		}
	}
	}

	for (j = 0;j < m - 1;j++)
	{
	for (i = 0;i < n;i++)
	{
	for (k = 0;k < n;k++)
	{
		if (fang[i][k] == j)
		{
			if (k == 0 && fang[i][k + 1] == 'z')
			{
				fang[i][k + 1] = j + 1;
			}
			if (k == n - 1 && fang[i][k - 1] == 'z')
			{
			fang[i][k - 1] = j + 1;
			}
			if (k > 0 && k < n - 1 && fang[i][k + 1] == 'z')
			{
			fang[i][k + 1] = j + 1;
			}
			if (k > 0 && k < n - 1 && fang[i][k - 1] == 'z')
			{
		fang[i][k - 1] = j + 1;
			}
					if (i == 0 && fang[i + 1][k] == 'z')
					{
				fang[i + 1][k] = j + 1;
					}
			if (i == n - 1 && fang[i - 1][k] == 'z')
			{
			fang[i - 1][k] = j + 1;
			}
			if (i > 0 && i < n - 1 && fang[i + 1][k] == 'z')
			{
			fang[i + 1][k] = j + 1;
			}
			if (i > 0 && i < n - 1 && fang[i - 1][k] == 'z')
			{
		fang[i - 1][k] = j + 1;
			}
		}
	}
	}
	}
	for (i = 0;i < n;i++)
	{
	for (k = 0;k < n;k++)
	{
		if (fang[i][k] != 'y' && fang[i][k] != 'z')
		{
	bing++;
		}
	}
	}
	System.out.printf("%d",bing);
			return 0;
	}


}

