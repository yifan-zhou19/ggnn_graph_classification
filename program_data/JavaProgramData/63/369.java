package <missing>;

public class GlobalMembers
{
	//??????????

	public static int Main() //?????
	{
		int[][] a = new int[100][100]; //????????c???????0
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		int m; //??????m,n,??????x1,x2,y1,y2,??k
		int n;
		int x1;
		int x2;
		int y1;
		int y2;
		int k;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (m = 0;m < x1;m++)
		{
			for (n = 0;n < y1;n++)
			{
			 a[m][n] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
			 x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (m = 0;m < x2;m++)
		{
			for (n = 0;n < y2;n++)
			{
				b[m][n] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (m = 0;m < 100;m++)
		{
			for (n = 0;n < 100;n++)
			{
				for (k = 0;k < y1;k++)
				{
					c[m][n] += a[m][k] * b[k][n]; //????a?b?????????c?
				}
			}
		}
		for (m = 0;m < x1;m++)
		{
			for (n = 0;n < y2;n += 1)
			{
			System.out.print(c[m][n]);
			if (n < y2 - 1)
			{
			System.out.print(' ');
			}
			}
		System.out.print("\n");
		}
		return 0;
	} //?????
}

