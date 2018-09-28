package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		int i;
		int j;
		int m;
		int a1;
		int a2;
		int b1;
		int b2;
		int c1;
		int c2;
	a1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	a2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < a1;i++)
	{
		for (j = 0;j < a2;j++)
		{
			a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	b1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	b2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < b1;i++)
	{
		for (j = 0;j < b2;j++)
		{
			b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	c1 = a1;
	c2 = b2;
	for (i = 0;i < c1;i++)
	{
		for (j = 0;j < c2;j++)
		{
			for (m = 0;m < a2;m++)
			{
				c[i][j] = c[i][j] + a[i][m] * b[m][j];
			}
		}
	}
	for (i = 0;i < c1;i++)
	{
		for (j = 0;j < c2;j++)
		{
			System.out.printf("%d",c[i][j]);
			if (j == c2 - 1)
			{
				System.out.print("\n");
			}
			else
			{
				System.out.print(" ");
			}
		}
	}
	return 0;
	}



}

