package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int a;
		int s;
		int[][] tj = new int[102][102];
		char[][] zf = new char[102][102];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < n;i++)
		{
			zf[i] = new Scanner(System.in).nextLine();
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		s = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				tj[i][j] = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (zf[i][j] == '@')
				{
					tj[i][j] = 1;
					s++;
				}
			}
		}
		a = 1;
		while (a < m)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (tj[i][j] == 1)
					{
						if (i > 0 && zf[i - 1][j] == '.')
						{
							zf[i - 1][j] = '@';
							s++;
						}
						if (i < n - 1 && zf[i + 1][j] == '.')
						{
							zf[i + 1][j] = '@';
							s++;
						}
						if (j > 0 && zf[i][j - 1] == '.')
						{
							zf[i][j - 1] = '@';
							s++;
						}
						if (j < n - 1 && zf[i][j + 1] == '.')
						{
							zf[i][j + 1] = '@';
							s++;
						}
					}
				}
			}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (zf[i][j] == '@')
					{
						tj[i][j] = 1;
					}
				}
			}
			a++;
		}
		System.out.printf("%d",s);
		return 0;
	}


}

