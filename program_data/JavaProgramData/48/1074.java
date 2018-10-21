package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[9][9]; //a????????b????????
	public static int[][] b = new int[9][9];

	public static void propagate(int m, int n)
	{
		  int k = 0;
		  int num; //??????

		 a[4][4] = m;

		 while (k < n)
		 {
			 for (int i = 0; i < 9; i++)
			 {
					  for (int j = 0; j < 9; j++)
					  {
						   b[i][j] = 0; //?????
					  }
			 }

			  for (int i = 0; i < 9; i++)
			  {
				  for (int j = 0; j < 9; j++)
				  {
						if (a[i][j] != 0)
						{
								num = a[i][j];
						a[i][j] = 2 * num;
						b[i - 1][j - 1] += num;
						b[i - 1][j] += num;
						b[i - 1][j + 1] += num;
						b[i + 1][j] += num;
						b[i + 1][j + 1] += num;
						b[i + 1][j - 1] += num;
						b[i][j + 1] += num;
						b[i][j - 1] += num;
						}
				  }
			  }

			for (int i = 0; i < 9; i++)
			{
				  for (int j = 0; j < 9; j++)
				  {
						a[i][j] += b[i][j];
				  }
			}
			k++;
		 }

		   for (int x = 0; x < 9; x++)
		   {
				  for (int y = 0; y < 9; y++)
				  {
					 if (y == 0)
					 {
					 System.out.print(a[x][y]);
					 }
				 else if (y == 8)
				 {
					   System.out.print(" ");
					   System.out.print(a[x][y]);
					   System.out.print("\n");
				 }
				 else
				 {
					  System.out.print(" ");
					  System.out.print(a[x][y]);
				 }
				  }
		   }
	}

	public static int Main()
	{
		 int m;
		 int n;

		 m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		 propagate(m, n);

		 return 0;
	}
}

