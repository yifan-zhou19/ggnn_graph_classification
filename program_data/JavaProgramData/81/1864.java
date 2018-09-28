package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] matrix = new int[5][5];
		int i;
		int j;
		int n;
		int m;
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
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}

		if (n < 0 || n>4 || m < 0 || m>4)
		{
			System.out.print("error\n");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				swap(matrix[n][i],matrix[m][i]);
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",matrix[i][j]);
				}
				System.out.printf("%d\n",matrix[i][4]);
			}
		}

		return 0;
	}
}

