package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] c = new int[100][100];
		int a;
		int i;
		int j;
		int a1;
		int b1;
		int a2;
		int b2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 0; i < a; i++)
		{
			for (j = 0; j < a; j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					c[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		i = 0;
		for (i = 0; i < a; i++)
		{
			for (j = 0; j < a; j++)
			{
				if (c[i][j] == 0)
				{
					if (c[i + 1][j] == 0 && c[i][j + 1] == 0)
					{
						a1 = i;
						b1 = j;
					}
					if (c[i - 1][j] == 0 && c[i][j - 1] == 0)
					{
						a2 = i;
						b2 = j;
					}
				}
			}
		}
		System.out.printf("%d\n", (a2 - a1 - 1) * (b2 - b1 - 1));
		return 0;
	}
}

