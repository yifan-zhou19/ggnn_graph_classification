package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[6][5];
		int i;
		int j;
		int n;
		int m;
		for (i = 0;i <= 4;i++)
		{
			for (j = 0;j <= 4;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
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
				a[5][i] = a[n][i];
				a[n][i] = a[m][i];
				a[m][i] = a[5][i];
			}

			for (i = 0;i <= 4;i++)
			{
				for (j = 0;j <= 4;j++)
				{
					if (j < 4)
					{
						System.out.printf("%d ",a[i][j]);
					}
					else if (i < 4)
					{
						System.out.printf("%d\n",a[i][j]);
					}
					else
					{
						System.out.printf("%d",a[i][j]);
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

