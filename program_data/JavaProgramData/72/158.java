package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x = 0;
		int y = 0;
		int i = 0;
		int j = 0;
		int avg = 0;
		int[][] h = new int[22][22];
		int[] outx = new int[400];
		int[] outy = new int[400];
		int count = 0;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < 22;i++)
		{
			for (j = 0;j < 22;j++)
			{
				h[i][j] = 0;
			}
		}
		for (i = 1;i <= x;i++)
		{
			for (j = 1;j <= y;j++)
			{
				h[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1;i <= x;i++)
		{
			for (j = 1;j <= y;j++)
			{
				if ((h[i][j] >= h[i - 1][j]) && (h[i][j] >= h[i + 1][j]) && (h[i][j] >= h[i][j - 1]) && (h[i][j] >= h[i][j + 1]))
				{
					outx[count] = i;
					outy[count++] = j;
				}
			}
		}
		for (i = 0;i < count;i++)
		{
			System.out.print(outx[i] - 1);
			System.out.print(" ");
			System.out.print(outy[i] - 1);
			System.out.print("\n");
		}
		return 0;
	}



}

