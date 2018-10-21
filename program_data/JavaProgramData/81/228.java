package <missing>;

public class GlobalMembers
{
	public static int jzhh(int[][] shuzu, int n, int m)
	{
		int e;
		int i;
		if ((m <= 4) && (n <= 4))
		{
			for (i = 0;i < 5;i++)
			{
				e = shuzu[m][i];
				shuzu[m][i] = shuzu[n][i];
				shuzu[n][i] = e;
			}
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int[][] shuzu1 = new int[5][5];
		int x;
		int y;
		int j;
		int k;
		for (j = 0;j < 5;j++)
		{
			for (k = 0;k < 5;k++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					shuzu1[j][k] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			y = Integer.parseInt(tempVar3);
		}
		if (jzhh(shuzu1, x, y) == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (j = 0;j < 5;j++)
			{
				for (k = 0;k < 5;k++)
				{
					if (k == 4)
					{
						System.out.printf("%d\n",shuzu1[j][k]);
					}
					else
					{
						System.out.printf("%d ",shuzu1[j][k]);
					}
				}
			}
		}
		return 0;
	}
}

