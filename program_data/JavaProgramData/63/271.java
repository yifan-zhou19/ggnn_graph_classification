package <missing>;

public class GlobalMembers
{
	/*??
	 1000012872*/

	public static int Main()
	{
		int x1; //a?b????????????c??????a?b????
		int x2;
		int y1;
		int y2;
		int i1;
		int j1;
		int i2;
		int j2;
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		int i;
		int j;
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

	for (i1 = 0;i1 < x1;i1++)
	{
		for (j2 = 0;j2 < y2;j2++)
		{
			for (j1 = 0,i2 = 0;j1 < y1,i2 < x2;j1++,i2++)
			{
				c[i1][j2] = a[i1][j1] * b[i2][j2] + c[i1][j2]; //?????c????a?????b???
			}
		}
	}

		System.out.print(c[0][0]);
	for (j = 1;j < y2;j++)
	{
		System.out.print(" ");
		System.out.print(c[0][j]);
	}

	for (i = 1;i < x1;i++)
	{
		System.out.print("\n");
		System.out.print(c[i][0]);
		  for (j = 1;j < y2;j++)
		  {
			System.out.print(" ");
			System.out.print(c[i][j]);
		  }
	} //?????
	return 0;
	}

}

