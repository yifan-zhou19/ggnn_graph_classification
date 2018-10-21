package <missing>;

public class GlobalMembers
{
	public static int matrix(int[][] p, int n, int m)
	{
		int i;
		int[] temp = new int[5];
		if (n < 5 && m < 5)
		{
			for (i = 0;i < 5;i++)
			{
				temp[i] = ((p + n) + i);
				*(*(p + n) + i) = *(*(p + m) + i);
				*(*(p + m) + i) = temp[i];
			}
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static int Main()
	{
		int i;
		int j;
		int[][] mat = new int[5][5];
		int n;
		int m;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					mat[i][j] = Integer.parseInt(tempVar);
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
		if (matrix(mat, n, m) != 0)
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					System.out.printf("%d",mat[i][j]);
					if (j < 4)
					{
						System.out.print(" ");
					}
				}
				if (i < 4)
				{
					System.out.print("\n");
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

