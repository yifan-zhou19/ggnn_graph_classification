package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k = 0;

		int[][] h = new int[22][22];
		int[] x = new int[400];
		int[] y = new int[400];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(h, 0, (Integer.SIZE / Byte.SIZE));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i < m + 1; i++)
		{
			for (j = 1; j < n + 1; j++)
			{
				h[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}


		for (i = 1; i < m + 1; i++)
		{
			for (j = 1; j < n + 1; j++)
			{
				if (h[i][j] >= h[i + 1][j] != 0 && h[i][j] >= h[i - 1][j] != 0 && h[i][j] >= h[i][j + 1] != 0 && h[i][j] >= h[i][j - 1])
				{
				System.out.print(i - 1);
				System.out.print(" ");
				System.out.print(j - 1);
				System.out.print("\n");
				}
			}
		}


	}





}

