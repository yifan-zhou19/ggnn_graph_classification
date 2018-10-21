package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		int i;
		char[][] nj = new char[N][N];
		char[][] tj = new char[N][N];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				nj[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			for (j = 0;j <= (String.valueOf(nj[i]).length() - 1);j++)
			{
				if (nj[i][j] == 'A')
				{
					tj[i][j] = 'T';
				}
				else if (nj[i][j] == 'T')
				{
					tj[i][j] = 'A';
				}
				else if (nj[i][j] == 'G')
				{
					tj[i][j] = 'C';
				}
				else if (nj[i][j] == 'C')
				{
					tj[i][j] = 'G';
				}
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			System.out.printf("%s\n",tj[i]);
		}
		return 0;
	}


}

