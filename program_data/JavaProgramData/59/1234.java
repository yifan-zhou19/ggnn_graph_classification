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
		int q = 0;
		char[][] hb = new char[102][102];
		char[][] tmp = new char[102][102];
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
			hb[i] = tempVar2.charAt(0);
		}
		tmp[i] = hb[i];
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
						  if (hb[i][j] == '@')
						  {
											tmp[i][j] = '@';
											if (hb[i][j + 1] == '.' && j + 1 < n)
											{
											tmp[i][j + 1] = '@';
											}
											if (hb[i][j - 1] == '.' && j - 1 >= 0)
											{
											tmp[i][j - 1] = '@';
											}
											if (hb[i - 1][j] == '.' && i - 1 >= 0)
											{
											tmp[i - 1][j] = '@';
											}
											if (hb[i + 1][j] == '.' && i + 1 < n)
											{
											tmp[i + 1][j] = '@';
											}
						  }
						  }
		}
		for (i = 0;i < n;i++)
		{
						 for (j = 0;j < n;j++)
						 {
										  hb[i][j] = tmp[i][j];
						 }
		}
		}
		for (i = 0;i < n;i++)
		{
						  for (j = 0;j < n;j++)
						  {
						  if (tmp[i][j] == '@')
						  {
						  q++;
						  }
						  }
		}
		System.out.printf("%d",q);
		return 0;
	}

}

