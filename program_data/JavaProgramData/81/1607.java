package <missing>;

public class GlobalMembers
{
	public static int matrix(int[][] shuzu, int n, int m)
	{
		int i;
		int temp = 0;
		if (n >= 0 && n <= 4 && m >= 0 && m < 5)
		{
			for (i = 0;i < 5;i++)
			{
				temp = shuzu[n][i];
				shuzu[n][i] = shuzu[m][i];
				shuzu[m][i] = temp;
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
		int[][] shuzu = new int[5][5];
		int n;
		int m;
		int i;
		int j;
		int k;
		int temp;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					shuzu[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (matrix(shuzu, n, m) == 0)
		{
			System.out.print("error");
		}
		else if (matrix(shuzu, n, m) == 1)
		{
			for (i = 0;i < 5;i++)
			{
				temp = shuzu[n][i];
				shuzu[n][i] = shuzu[m][i];
				shuzu[m][i] = temp;
			}
			for (k = 0;k < 5;k++)
			{
				for (j = 0;j < 5;j++)
				{
					System.out.printf("%d",shuzu[k][j]);
					if (j < 4)
					{
						System.out.print(" ");
					}
				}
				System.out.print("\n");
			}
		}
		return 0;
	}








}

