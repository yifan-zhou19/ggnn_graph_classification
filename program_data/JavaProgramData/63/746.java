package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			 int x1;
			 int y1;
			 int x2;
			 int y2;
			 int i = 0;
			 int j = 0;
			 int b = 0;
			 int k = 0;
			 x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 int[][] jua = new int[x1][y1];
			 for (i = 0;i < x1;i++)
			 {
					 for (j = 0;j < y1;j++)
					 {
							 jua[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					 }
			 }
			 x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 int[][] jub = new int[x2][y2];
			 for (i = 0;i < x2;i++)
			 {
					 for (j = 0;j < y2;j++)
					 {
							 jub[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					 }
			 }
			 int[][] juc = new int[x1][y2];
			 for (i = 0;i < x1;i++)
			 {
					for (j = 0;j < y2;j++)
					{
							 juc[i][j] = 0;
					}
			 }
			 for (i = 0;i < x1;i++)
			 {
					 for (j = 0;j < y2;j++)
					 {
									for (k = 0;k < y1;k++)
									{
									juc[i][j] += jua[i][k] * jub[k][j];
									}
					 }
			 }
			 for (i = 0;i < x1;i++)
			 {
							  b = 0;
							  for (j = 0;j < y2;j++)
							  {
											   if (b == y2 - 1)
											   {
											   System.out.print(juc[i][j]);
											   System.out.print("\n");
											   }
											   else
											   {
												   System.out.print(juc[i][j]);
												   System.out.print(' ');
												   b++;
											   }
							  }
			 }

	return 0;
	}

}

