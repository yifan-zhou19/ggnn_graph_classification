package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[200][200];
		int[][] b = new int[200][200];
		int[][] c = new int[200][200];
		int x1;
		int y1;
		int x2;
		int y2;
		int i;
		int j;
		int k;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= x1;i++)
		{
			for (j = 1;j <= y1;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= x2;i++)
		{
			for (j = 1;j <= y2;j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1;i <= x1;i++)
		{
			for (j = 1;j <= y2;j++)
			{
				for (k = 1;k <= y1;k++)
				{
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		for (i = 1;i <= x1;i++)
		{
			for (j = 1;j <= y2;j++)
			{
				if (y2 != 1)
				{
					   if (j == 1)
					   {
					   System.out.print(c[i][j]);
					   }
					   else if (j != y2)
					   {
					   System.out.print(" ");
					   System.out.print(c[i][j]);
					   }
					   else
					   {
					   System.out.print(" ");
					   System.out.print(c[i][j]);
					   System.out.print("\n");
					   }
				}
				else
				{
				System.out.print(c[i][j]);
				System.out.print("\n");
				}
			}
		}

		return 0;
	}

}

