package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[][] a = new int[100][100];
	   int[][] b = new int[100][100];
	   int[][] c = new int[100][100];
	   int x1;
	   int y1;
	   int x2;
	   int y2;
	   int i;
	   int j;
	   int k;
	   int s;
	   for (i = 0;i < 100;i++)
	   {
						for (j = 0;j < 100;j++)
						{
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
							s = 0;
										 while (s < x2)
										 {
											c[i][j] = c[i][j] + a[i][s] * b[s][j];
										 s++;
										 }
						}
	   }
	   for (i = 0;i < x1;i++)
	   {
						for (j = 0;j < y2 - 1;j++)
						{
										 System.out.print(c[i][j]);
										 System.out.print(" ");
						}
						System.out.print(c[i][y2 - 1]);
						System.out.print("\n");
	   }
	   k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   return 0;
	}
}

