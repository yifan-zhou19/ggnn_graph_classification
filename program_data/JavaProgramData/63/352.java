package <missing>;

public class GlobalMembers
{
	//********************
	public static int[][] a = new int[101][101];
	public static int[][] b = new int[101][101];
	public static int[][] c = new int[101][101];
	public static int x1 = 0;
	public static int x2 = 0;
	public static int y1 = 0;
	public static int y2 = 0;
	public static int i = 0;
	public static int j = 0;
	public static int sum = 0;
	//********************

	public static int Main()
	{
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
		for (int n1 = 0;n1 < x2;n1++)
		{
		   for (int n = 0;n < y2;n++)
		   {
				b[n1][n] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		   }

		}


		for (int m1 = 0;m1 < x1;m1++)
		{
		   for (int m2 = 0;m2 < y2;m2++)
		   {
				for (int m = 0;m <= y1;m++)
				{
						c[m1][m2] = c[m1][m2] + a[m1][m] * b[m][m2];
				}


		   }

		}
		i = 0;
		j = 0;
	 for (i = 0;i < x1;i++)
	 {
					  System.out.print(c[i][0]);
					  for (j = 1;j < y2;j++)
					  {
						System.out.print(" ");
						System.out.print(c[i][j]);
					  }
					  System.out.print("\n");
	 }
	 return 0;



	}

}

