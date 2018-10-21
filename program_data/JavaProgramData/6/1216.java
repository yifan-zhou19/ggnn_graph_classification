package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int x;
		int y;
		int i;
		int j;
		int k;
		int n;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0; k < n; k++)
		{
			sum = 0; // ??
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Integer.SIZE / Byte.SIZE)); // ??
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0; i < x; i++)
			{
				for (j = 0; j < y; j++)
				{
					*(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
				}
			}

			for (i = 0; i < x; i++)
			{
				for (j = 0; j < y; j++)
				{
					if (i == 0 || j == 0 || i == (x - 1) || j == (y - 1)) //?????????
					{
						sum += *(*(a + i) + j);
					}
				}
			}

			System.out.print(sum);
			System.out.print("\n");
		}

		return 0;
	}
}

