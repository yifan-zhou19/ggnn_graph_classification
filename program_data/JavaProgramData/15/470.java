package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] s = new int[100][100];
		int i;
		int j;
		int a;
		int b;
		int c;
		int d;
		int num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					s[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
					if (i < n && j < n && s[i][j] == 0 && s[i + 1][j] == 0 && s[i][j + 1] == 0) // ??????????
					{
						a = i;
						b = j;
					}
					if (i > 1 && j > 1 && s[i][j] == 0 && s[i - 1][j] == 0 && s[i][j - 1] == 0) // ??????????
					{
									   c = i;
									   d = j;
					}

			}
		}

		num = (c - a - 1) * (d - b - 1);
		System.out.printf("%d",num);
		return 0;
	}

}

