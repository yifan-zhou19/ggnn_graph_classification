package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int x;
	int y;
	x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	final int x1 = x;
	final int y1 = y;
	int[][] a = new int[x1 + 1][y1 + 1];
	for (int i = 1;i < x1 + 1;i++)
	{
	  for (int j = 1;j < y1 + 1;j++)
	  {
		a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  }
	}
	x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	final int x2 = x;
	final int y2 = y;
	int[][] b = new int[x2 + 1][y2 + 1];
	for (int i = 1;i < x2 + 1;i++)
	{
	  for (int j = 1;j < y2 + 1;j++)
	  {
		b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  }
	}
	int[][] c = new int[x1 + 1][y2 + 1];
	for (int i = 1;i < x1 + 1;i++)
	{
	  for (int j = 1;j < y2 + 1;j++)
	  {
		 c[i][j] = 0;
		 for (int k = 1;k < y1 + 1;k++)
		 {
			 c[i][j] += a[i][k] * b[k][j];
		 }
	  }
	}
	for (int i = 1;i < x1;i++)
	{
	  for (int j = 1;j < y2;j++)
	  {
		  System.out.print(c[i][j]);
		  System.out.print(' ');
	  }
	  System.out.print(c[i][y2]);
	  System.out.print("\n");
	}
	for (int i = 1;i < y2;i++)
	{
		System.out.print(c[x1][i]);
		System.out.print(' ');
	}
	System.out.print(c[x1][y2]);
	return 0;
	}
}

