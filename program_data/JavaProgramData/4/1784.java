package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[200][200];
		int i;
		int j;
		int row;
		int col;
		int sum;

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

		if (col >= row)
		{
			for (sum = 0;sum < col;sum++)
			{
				for (j = sum;j >= 0;j--)
				{
					i = sum - j;
					if (i >= row)
					{
						break;
					}
					System.out.printf("%d\n",a[i][j]);
				}
			}
			for (;sum <= col + row - 2;sum++)
			{
				for (j = col - 1;j >= 0;j--)
				{
					i = sum - j;
					if (i >= row)
					{
						break;
					}
					System.out.printf("%d\n",a[i][j]);
				}
			}
		}
		else
		{
			for (sum = 0;sum < col;sum++)
			{
				for (j = sum;j >= 0;j--)
				{
					i = sum - j;
					if (i >= row)
					{
						break;
					}
					System.out.printf("%d\n",a[i][j]);
				}
			}
			for (;sum <= col + row - 2;sum++)
			{
				for (j = col - 1;j >= 0;j--)
				{
					i = sum - j;
					if (i >= row)
					{
						break;
					}
					System.out.printf("%d\n",a[i][j]);
				}
			}
		}
	}
}

