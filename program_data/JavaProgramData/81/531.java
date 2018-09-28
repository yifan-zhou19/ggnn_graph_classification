package <missing>;

public class GlobalMembers
{
	public static int find(int n,int m)
	{
		if ((n >= 0) && (n <= 4) && (m >= 0) && (m <= 4))
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static void Main()
	{
		int flag;
		int i;
		int j;
		int m;
		int n;
		int swap;
		int[][] num = new int[5][5];
		for (i = 0;i <= 4;i++)
		{
			for (j = 0;j <= 4;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					num[i][j] = Integer.parseInt(tempVar);
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
		if (find(n, m) != 0)
		{
			for (i = 0;i <= 4;i++)
			{
				swap = num[n][i];
				num[n][i] = num[m][i];
				num[m][i] = swap;
			}
			for (i = 0;i <= 4;i++)
			{
				flag = 0;
				for (j = 0;j <= 4;j++)
				{
					if (flag != 0)
					{
						System.out.print(" ");
					}
					else
					{
						flag = 1;
					}
					System.out.printf("%d",num[i][j]);
				}
				System.out.print("\n");
			}
		}
		else
		{
			System.out.print("error");
		}
	}
}

