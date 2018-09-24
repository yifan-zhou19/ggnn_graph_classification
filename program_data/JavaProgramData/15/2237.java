package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[][] p = new int[100][100];
		int a;
		int b;
		int c;
		int d;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(p, 1, (Integer.SIZE / Byte.SIZE));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				*(*(p + i) + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				if (*(*(p + i) + j) == 0 && *(*(p + i) + j - 1) != 0 && *(*(p + i - 1) + j) != 0 && *(*(p + i + 1) + j) == 0 && *(*(p + i) + j + 1) == 0)
				{
					a = i;
					b = j;
				}
				if (*(*(p + i) + j) == 0 && *(*(p + i) + j - 1) == 0 && *(*(p + i - 1) + j) != 0 && *(*(p + i + 1) + j) == 0 && *(*(p + i) + j + 1) != 0)
				{
					c = j;
				}
				if (*(*(p + i) + j) == 0 && *(*(p + i) + j - 1) != 0 && *(*(p + i - 1) + j) == 0 && *(*(p + i + 1) + j) != 0 && *(*(p + i) + j + 1) == 0)
				{
					d = i;
				}
			}
		}
		System.out.print((d - a - 1) * (c - b - 1));
		System.out.print("\n");
		return 0;
	}

}

