package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] x = new int[5][5];
		int m;
		int n;
		int i;
		int j;
		for (i = 0;i <= 4;i++)
		{
			for (j = 0;j <= 4;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					x[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (n >= 0 && n <= 4 && m >= 0 && m <= 4)
		{
			for (i = 0;i <= 4;i++)
			{
				  j = x[n][i];
				  x[n][i] = x[m][i];
				  x[m][i] = j;
			}
			for (i = 0;i <= 4;i++)
			{
				for (j = 0;j <= 4;j++)
				{
						System.out.printf("%d",x[i][j]);
						if (j == 4)
						{
							System.out.print("\n");
						}
						else
						{
							System.out.print(" ");
						}
				}
			}
		}
		else
		{
			System.out.print("error");
		}

		return 0;
	}
}

