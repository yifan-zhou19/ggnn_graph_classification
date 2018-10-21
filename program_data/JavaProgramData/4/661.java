package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int l;
		int max;
		int start;
		int row;
		int col;
		int[][] a = new int[200][200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= row;i++)
		{
			for (j = 1;j <= col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		i = 1;
		j = 1;
		do
		{
			System.out.printf("%d\n",a[i][j]);
			i++;
			j--;
			if (j == 0)
			{
				if (i + j < col + 1)
				{
				j = i;
				i = 1;
				}
			else
			{
				i = i + j + 1 - col;
				j = col;
			}
			}
			if (i > row)
			{
				if (i + j < col + 1)
				{
				j = i + j;
				i = 1;
				}
			else
			{
				i = row + 2 + j - col;
				j = col;
			}
			}

		} while (i <= row);
		return 0;
	}
}

