package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] a = new int[100][100];
		int i;
		int j;
		int max;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		max = row;
		if (max < col)
		{
			max = col;
		}
		for (i = 0;i < max;i++)
		{
			for (j = 0;j < max;j++)
			{
				a[i][j] = -1;
			}
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		if (max == 1)
		{
			System.out.printf("%d",a[0][0]);
		}
		else
		{
		i = 0;
		j = 0;
		while (j < max)
		{
			if (a[i][j] != -1)
			{
				System.out.printf("%d\n",a[i][j]);
			}
			if (j == 0)
			{
				j = i + 1;
				i = 0;
			}
			else
			{
				i = i + 1;
				j = j - 1;
			}
		}
		j = max - 1;
		i = 1;
		while (i != max - 1 || j != max - 1)
		{
			if (a[i][j] != -1)
			{
				System.out.printf("%d\n",a[i][j]);
			}
			if (i == max - 1)
			{
				i = j + 1;
				j = max - 1;
			}
			else
			{
				i = i + 1;
				j = j - 1;
			}
		}
		if (a[max - 1][max - 1] != -1)
		{
			System.out.printf("%d\n",a[max - 1][max - 1]);
		}
		}
		return 0;
	}

}

