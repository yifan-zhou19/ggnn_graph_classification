package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int b;
		int i;
		int c;
		int d;
		int n;
		int e;
		int j;
		int k;
		int m;
		int[][] a = new int[10][10];
		m = 1;
		e = 1;
		for (i = 1;i <= 5;i++)
		{
			for (k = 1;k <= 5;k++)
			{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i][k] = Integer.parseInt(tempVar);
			}
			}
		}
		i = 1;
		for (i = 1;i <= 5;i++)
		{
			k = 1;
			for (k = 1;k <= 5;k++)
			{
				j = 1;
				m = 1;
				for (j = 1;j <= 5;j++)
				{
						if (a[i][k] < a[i][j])
						{
							m = 0;
						}
				}
					if (m == 1)
					{
						j = 1;
						for (j = 1;j <= 5;j++)
						{
							if (a[i][k] > a[j][k])
							{
								m = 0;
							}
						}
						if (m == 1)
						{
							System.out.printf("%d %d %d\n",i,k,a[i][k]);
						e = 0;
						}
					}
			}
		}
		if (e == 1)
		{
			System.out.print("not found");
		}

		return 0;
	}

}

