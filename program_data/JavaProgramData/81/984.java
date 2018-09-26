package <missing>;

public class GlobalMembers
{
	public static void Change(int[][] a, int b, int c)
	{
		int t;
		int temp;
		for (t = 0;t < 5;t++)
		{
			temp = a[b][t];
			a[b][t] = a[c][t];
			a[c][t] = temp;
		}
	}

	public static void Main()
	{
		int i;
		int j;
		int[][] matrix = new int[5][5];
		int p;
		int q;
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
			p = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			q = Integer.parseInt(tempVar3);
		}

		if (!(p >= 0 && p < 5 && q >= 0 && q < 5))
		{
			System.out.print("error");
		}
		else
		{
			Change(matrix, p, q);
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					if (j == 0)
					{
						System.out.printf("%d",matrix[i][j]);
					}
					else
					{
						System.out.printf(" %d",matrix[i][j]); //?????????????????~
					}
				}
				System.out.print("\n");
			}
		}
	}
}

