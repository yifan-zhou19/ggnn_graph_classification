package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int n;
	int i;
	int j;
	int k;
	int[][] a = new int[111][111];
	int s = 0;
	char b;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	scanf("\n");
	for (i = 1;i <= n;i++)
	{
	for (j = 1;j <= n;j++)
	{
	String tempVar2 = ConsoleInput.scanfRead(null, 1);
	if (tempVar2 != null)
	{
		b = tempVar2.charAt(0);
	}
	if (b == '.')
	{
		a[i][j] = 1;
	}
	if (b == '#')
	{
		a[i][j] = 0;
	}
	if (b == '@')
	{
		a[i][j] = 2;
	}
	}
	scanf("\n");
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		m = Integer.parseInt(tempVar3);
	}
	for (k = 1;k <= m - 1;k++)
	{
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
			  if (a[i][j] == 2)
			  {
				  if (a[i - 1][j] != 0 && a[i - 1][j] != 2)
				  {
					  a[i - 1][j] = 3;
				  }
				  if (a[i + 1][j] != 0 && a[i + 1][j] != 2)
				  {
					  a[i + 1][j] = 3;
				  }
				  if (a[i][j + 1] != 0 && a[i][j + 1] != 2)
				  {
					  a[i][j + 1] = 3;
				  }
				  if (a[i][j - 1] != 0 && a[i][j - 1] != 2)
				  {
					  a[i][j - 1] = 3;
				  }
			  }
			}
		}

	for (i = 1;i <= n;i++)
	{
			for (j = 1;j <= n;j++)
			{
			  if (a[i][j] == 3)
			  {
				  a[i][j] = 2;
			  }
			}
	}
	}
	 for (i = 1;i <= n;i++)
	 {
			for (j = 1;j <= n;j++)
			{
			  if (a[i][j] == 2)
			  {
				  s = s + 1;
			  }
			}
	 }
			  System.out.printf("%d",s);


	return 0;
	}
}

