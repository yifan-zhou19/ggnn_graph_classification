package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int m;
		int max;
		int col;
		int f = 0;
		int c;
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
			col = 0;
			for (j = 1;j < 5;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					col = j;
				}
			}
			for (m = 0;m < 5;m++)
			{
				c = 0;
				if (m != i)
				{
					if (max >= a[m][col])
					{
						c = 1;
						break;
					}
				}
			}
			if (c == 0)
			{
				System.out.printf("%d %d %d\n",i + 1,col + 1,max);
				f = 1;
			}
		}
		if (f == 0)
		{
			System.out.print("not found\n");
		}
		return 0;
	}
}

