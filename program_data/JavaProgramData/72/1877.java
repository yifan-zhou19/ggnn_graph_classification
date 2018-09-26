package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[100][100];

	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[] lenth = new int[150];
		int[] width = new int[150];
		int count = 0;

		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a, 0, (Integer.SIZE / Byte.SIZE));

		for (i = 1; i <= m; i++)
		{
		for (j = 1; j <= n; j++)
		{
			a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		}

		for (i = 1; i <= m; i++)
		{
		for (j = 1; j <= n; j++)
		{
			int tag = 1;

			if (a[i][j] < a[i + 1][j])
			{
				tag = 0;
			}
			if (a[i][j] < a[i - 1][j])
			{
				tag = 0;
			}
			if (a[i][j] < a[i][j + 1])
			{
				tag = 0;
			}
			if (a[i][j] < a[i][j - 1])
			{
				tag = 0;
			}

			if (tag == 1)
			{
				lenth[count] = i;
				width[count] = j;
				count++;
			}
		}
		}

		for (i = 0; i < count; i++)
		{
			System.out.print(lenth[i] - 1);
			System.out.print(' ');
			System.out.print(width[i] - 1);
			System.out.print("\n");
		}


	}
}

