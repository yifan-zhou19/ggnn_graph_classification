package <missing>;

public class GlobalMembers
{
	//*************************
	//*  ??????? 
	//*  ????? 
	//*  ???1200012941 
	//*  ???2012?11?05? 
	//*************************
	public static int Main()
	{
		int x1;
		int y1;
		int x2;
		int y2;
		int i;
		int j;
		int k;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[x1][y1];
		for (i = 0; i < x1; i++)
		{
		 for (j = 0; j < y1; j++)
		 {
			 a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] b = new int[x2][y2];
		for (i = 0; i < x2; i++)
		{
		 for (j = 0; j < y2; j++)
		 {
			 b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
		}
		int[][] c = new int[100][100];
		for (i = 0; i < x1; i++)
		{
		 for (j = 0; j < y2; j++)
		 {
			 for (k = 0; k < x2; k++)
			 {
				  c[i][j] += a[i][k] * b[k][j];
			 }
			 if (j < y2 - 1)
			 {
				System.out.print(c[i][j]);
				System.out.print(" ");
			 }
			 else
			 {
				System.out.print(c[i][y2 - 1]);
				System.out.print("\n");
			 }
		 }
		}
		 return 0;
	}
}

