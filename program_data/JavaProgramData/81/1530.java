package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int inrange = new int(int x,int y);
		int[][] matrix = new int[5][5];
		int m;
		int n;
		int i;
		int j;
		int temp;

		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					matrix[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}

		if (inrange(m, n) != 0)
		{
			for (i = 0;i < 5;i++)
			{
				temp = matrix[m][i];
				matrix[m][i] = matrix[n][i];
				matrix[n][i] = temp;
			}

			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					if (j < 4)
					{
						System.out.printf("%d ",matrix[i][j]);
					}
					else
					{
						System.out.printf("%d\n",matrix[i][j]);
					}
				}
			}
		}
		else
		{
			System.out.print("error\n");
		}
	}

	public static int inrange(int x,int y)
	{
		if ((x >= 0 && x <= 4) && (y >= 0 && y <= 4))
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
}

