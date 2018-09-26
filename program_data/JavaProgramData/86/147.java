package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] m = new int[100];
		int i;
		int j;
		int sum;
		int[][] c = new int[100][20];
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
				m[i] = Integer.parseInt(tempVar2);
			}
			for (j = 1;j <= m[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					c[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (m[i] == 0)
			{
				System.out.print("60\n");
			}
			if (m[i] == 1)
			{
				if (c[i][1] <= 57)
				{
					System.out.print("57\n");
				}
				if (c[i][1] > 57)
				{
					System.out.printf("%d\n",c[i][1]);
				}
			}
			if (m[i] > 1)
			{
				if ((c[i][m[i]] + 3 * (m[i])) <= 60)
				{
					sum = 60 - 3 * m[i];
					System.out.printf("%d\n",sum);
				}
				else if ((c[i][m[i]] + 3 * (m[i])) <= 63)
				{
					System.out.printf("%d\n",c[i][m[i]]);
				}
				else if ((c[i][m[i]] + 3 * (m[i])) > 63)
				{
					if ((c[i][m[i] - 1] + 3 * (m[i] - 1)) < 60)
					{
						sum = 60 - 3 * (m[i] - 1);
						System.out.printf("%d\n",sum);
					}
					else if ((c[i][m[i] - 1] + 3 * (m[i] - 1)) < 63)
					{
						  System.out.printf("%d\n",c[i][m[i] - 1]);
					}
					else if ((c[i][m[i] - 1] + 3 * (m[i] - 1)) > 63)
					{
						if ((c[i][m[i] - 2] + 3 * (m[i] - 2)) < 60)
						{
							sum = 60 - 3 * (m[i] - 2);
							System.out.printf("%d\n",sum);
						}
						else if ((c[i][m[i] - 2] + 3 * (m[i] - 2)) < 63)
						{
							  System.out.printf("%d\n",c[i][m[i] - 2]);
						}
					}
				}
			}
		}
		return 0;
	}
}

