package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x1;
		int y1;
		int x2;
		int y2;
		int[][] a = new int[101][101];
		int[][] b = new int[101][101];
		int[][] c = new int[101][101];
		int i;
		int j;
		int k;

		for (i = 0;i < 101;i++)
		{
			for (j = 0;j < 101;j++)
			{
			   a[i][j] = 0;
			   b[i][j] = 0;
			   c[i][j] = 0;
			}

		}

		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < x1;i++)
		{
		  for (j = 0;j < y1;j++)
		  {
			a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  }
		}

		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < x2;i++)
		{
		  for (j = 0;j < y2;j++)
		  {
			b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  }
		}

		for (i = 0;i < x1;i++)
		{
		   for (j = 0;j < y2;j++)
		   {
			   for (k = 0;k < y1;k++)
			   {
				   c[i][j] = c[i][j] + a[i][k] * b[k][j];
			   }

		   }
		}

		for (i = 0;i < x1;i++)
		{
		   for (j = 0;j < y2;j++)
		   {
			   if ((j + 1) % y2 != 0)
			   {
				   System.out.print(c[i][j]);
				   System.out.print(" ");
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

