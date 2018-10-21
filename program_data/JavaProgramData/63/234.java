package <missing>;

public class GlobalMembers
{
	/*
	???1000012853  ??
	???2010.11.20
	????
	*/
	public static int Main()
	{
		int x1;
		int y1;
		int x2;
		int y2;
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int z;
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < x1; i++)
		{
			for (j = 0; j < y1; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < x2;i++)
		{
			for (j = 0; j < y2; j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		if (y1 == x2)
		{
			for (k = 0; k < x1; k++)
			{
				for (l = 0; l < x2; l++)
				{
					for (m = 0; m < y2; m++)
					{
						c[k][m] += a[k][l] * b[l][m];
					}
				}
			}
		}
		for (n = 0; n < x1; n++)
		{
			for (z = 0; z < y2; z++)
			{
				if (z == y2 - 1)
				{
					System.out.print(c[n][z]);
					System.out.print("\n");
				}
				else
				{
					System.out.print(c[n][z]);
					System.out.print(" ");
				}
			}
		}
		return 0;
	}
}

