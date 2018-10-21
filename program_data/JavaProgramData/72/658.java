package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int q;
		int i;
		int j;
		int[][] a = new int[30][30];
		int m;
		int[] b = new int[30];
		b = a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n + 1;i++)
		{
			for (j = 0;j <= m + 1;j++)
			{
				*(b[i] + j) = 0;
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= m;j++)
			{
				*(b[i] + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= m;j++)
			{
				if (*(b[i] + j) >= *(b[i + 1] + j) && *(b[i] + j) >= *(b[i - 1] + j) && *(b[i] + j) >= *(b[i] + j - 1) && *(b[i] + j) >= *(b[i] + j + 1))
				{
					System.out.print(i - 1);
					System.out.print(" ");
					System.out.print(j - 1);
					System.out.print("\n");
				}
			}
		}

		q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}

}

