package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int x1;
	  int y1;
	  x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  int[][] A = new int[x1][y1];
	  for (int i = 0;i < x1;i++)
	  {
		for (int j = 0;j < y1;j++)
		{
		  A[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	  }
	  int x2;
	  int y2;
	  x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  int[][] B = new int[x2][y2];
	  for (int k = 0;k < x2;k++)
	  {
		 for (int g = 0;g < y2;g++)
		 {
			B[k][g] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
	  }
	  int[][] C = new int[x1][y2];
	  for (int a = 0;a < x1;a++)
	  {
		for (int d = 0;d < y2;d++)
		{
		  C[a][d] = 0;
		}
	  }
	  for (int h = 0;h < x1;h++)
	  {
		 for (int l = 0;l < y2;l++)
		 {
		  for (int s = 0;s < y1;s++)
		  {
			C[h][l] += A[h][s] * B[s][l];
		  }
		 }
	  }

	  for (int p = 0;p < x1;p++)
	  {
		 for (int q = 0;q < y2 - 1;q++)
		 {
			System.out.print(C[p][q]);
			System.out.print(" ");
		 }
		 System.out.print(C[p][y2 - 1]);
		 System.out.print("\n");
	  }

	  return 0;
	}



}

