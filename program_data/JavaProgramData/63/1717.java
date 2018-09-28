package <missing>;

public class GlobalMembers
{
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
		int[][] c = new int[x1][y2];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c, 0, (Integer.SIZE / Byte.SIZE));
		for (i = 0; i < x2; i++)
		{
			for (j = 0; j < y2; j++)
			{
			b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < x1; i++)
		{
			for (k = 0; k < y2; k++)
			{
			  for (j = 0; j < y1; j++)
			  {
			c[i][k] += a[i][j] * b[j][k];
			  }
			}
		}
		for (i = 0; i < x1; i++)
		{
		   for (k = 0; k < y2 - 1; k++)
		   {
			System.out.print(c[i][k]);
			System.out.print(" ");
		   }
			System.out.print(c[i][y2 - 1]);
			System.out.print("\n");
		}
		return 0;
	}

}

