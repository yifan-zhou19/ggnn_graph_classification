package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] A = new int[200][200];
		int[][] B = new int[200][200];
		int[][] C = new int[200][200];
		int x1;
		int y1;
		int x2;
		int y2;
		int i;
		int j;
		int k;
		int l;
		int sum = 0;
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= y1;i++)
		{
			for (j = 1;j <= x1;j++)
			{
			  A[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= y2;i++)
		{
			for (j = 1;j <= x2;j++)
			{
			  B[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1;i <= y1;i++)
		{
			for (j = 1;j <= x2;j++)
			{
					sum = 0;
					for (k = 1;k <= x1;k++)
					{
						   sum += A[i][k] * B[k][j];
					}
					C[i][j] = sum;
			}
		}
		for (i = 1;i <= y1;i++)
		{
				System.out.print(C[i][1]);
				if (x2 >= 2)
				{
				for (j = 2;j <= x2;j++)
				{
				   System.out.print(" ");
				   System.out.print(C[i][j]);
				}
				}
				System.out.print("\n");
		}
		return 0;


	}


}

