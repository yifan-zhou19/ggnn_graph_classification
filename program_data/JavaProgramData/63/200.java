package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i; //???????
		int j;
		int k;
		int[][] a = new int[255][255];
		int[][] b = new int[255][255];
		int x1;
		int y1;
		int x2;
		int y2;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < x1;i++) //??
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
		int[][] ji = new int[255][255]; //??????
		for (i = 0;i < x1;i++) //??
		{
					for (j = 0;j < y2;j++)
					{
						ji[i][j] = 0;
					}
		}
		for (i = 0;i < x1;i++) //????
		{
				for (j = 0;j < y2;j++)
				{
					for (k = 0;k < y1;k++)
					{
							ji[i][j] = ji[i][j] + a[i][k] * b[k][j];
					}
				}
		}
		int count = 0;
		for (i = 0;i < x1;i++) //????
		{
			for (j = 0;j < y2;j++)
			{
					System.out.print(ji[i][j]);
					count++;
				if (count % y2 == 0)
				{
					System.out.print('\n');
				}
				else
				{
					System.out.print(' ');
				}
			}
		}

	}
}

