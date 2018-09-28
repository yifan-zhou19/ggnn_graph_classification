package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[5][5];
		int c;
		int t = 1;
		int i;
		int j;
		int k;
		int max;
		int colum;
		int row;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		for (i = 0;i < 5;i++)
		{
			max = a[i][0];
			colum = 0;
			row = i;
			for (j = 1;j < 5;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					colum = j;
				}
			}
			c = 1;
			for (k = 0;k < 5;k++)
			{
				if (a[k][colum] < a[row][colum])
				{
					c = 0;
				}
			}
			if (c != 0)
			{
				System.out.printf("%d %d %d",row + 1,colum + 1,a[row][colum]);
				t = 0;
			}
		}
		if (t != 0)
		{
			System.out.print("not found");
		}
	}

}

