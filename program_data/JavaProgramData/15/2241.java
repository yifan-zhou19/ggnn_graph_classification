package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[1000][1000];

	public static int Main()
	{
		int n;
		int i;
		int j;
		int i1;
		int j1;
		int i2;
		int j2;
		int flag = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				*(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
				if (flag != 0 && *(*(a + i) + j) == 0)
				{
					i1 = i;
					j1 = j;
					flag = 0;
				}
			}
		}
		for (i = i1; i < n; i++)
		{
			if (*(*(a + i) + j1) != 0)
			{
				i2 = i - 1;
				break;
			}
		}
		if (i == n)
		{
			i2 = i - 1;
		}
		for (j = j1; j < n; j++)
		{
			if (*(*(a + i2) + j) != 0)
			{
				j2 = j - 1;
				break;
			}
		}
		if (j == n)
		{
			j2 = j - 1;
		}
		System.out.print((i2 - i1 - 1) * (j2 - j1 - 1));
		System.out.print("\n");

		return 0;
	}

}

