package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x1; //?????????????????
		int y1;
		int x2;
		int y2;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[x1][y1]; //????a?????????????i,j,k
		int i;
		int j;
		int k;
		for (i = 0;i < x1;i++) //????a???
		{
			for (j = 0;j < y1;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] b = new int[x2][y2];
		int[][] c = new int[x1][y2];
		for (i = 0;i < x2;i++)
		{
			for (j = 0;j < y2;j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < x1;i++) //?c???????
		{
			for (j = 0;j < y2;j++)
			{
				c[i][j] = 0;
			}
		}
		for (i = 0;i < x1;i++)
		{
			for (j = 0;j < y2;j++)
			{
				for (k = 0;k < x2;k++)
				{
					c[i][j] += a[i][k] * b[k][j]; //??c????????????????
				}
			}
		}
		for (i = 0;i < x1;i++) //????c
		{
			for (j = 0;j < y2;j++)
			{
				if (j < y2 - 1)
				{
					System.out.print(c[i][j]);
					System.out.print(' ');
				}
				if (j == y2 - 1)
				{
					System.out.print(c[i][j]);
					System.out.print("\n");
				}
			}
		}
		return 0; //????
	}



}

