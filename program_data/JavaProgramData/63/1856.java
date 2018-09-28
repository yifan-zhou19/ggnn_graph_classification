package <missing>;

public class GlobalMembers
{
	//********************************************
	//*3�D�?o&#190;&#216;&#213;�3&#203;��                            *
	//*D&#213;&#195;&#251;?oo&#206;&#212;&#198;&#198;e                              *
	//*&#209;�o&#197;?o1300012888                          *
	//*�&#213;&#198;�?o2013.11.6                           * 
	//********************************************

	public static int Main()
	{
		int[][] a = new int[101][101];
		int[][] b = new int[101][101];
		int[][] c = new int[101][101];
		int x1;
		int x2;
		int y1;
		int y2;
		int i;
		int j;
		int k;

		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= x1;i++)
		{
			for (j = 1;j <= y1;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (x2 != y1)
		{
			System.out.print("Error");
			System.out.print("\n");
			return 0;
		}
		for (i = 1;i <= x2;i++)
		{
			for (j = 1;j <= y2;j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1;i <= x1;i++)
		{
			for (j = 1;j <= y2;j++)
			{
				c[i][j] = 0;
				for (k = 1;k <= x2;k++)
				{
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		for (i = 1;i <= x1;i++)
		{
			System.out.print(c[i][1]);
			for (j = 2;j <= y2;j++)
			{
				System.out.print(" ");
				System.out.print(c[i][j]);
			}
			System.out.print("\n");
		}

		return 0;
	}
}

