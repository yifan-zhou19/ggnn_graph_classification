package <missing>;

public class GlobalMembers
{
	public static int high(int h, int i, int j)
	{
		int count1 = 0;
		if (num[i - 1][j] <= h != 0 || away(i - 1, j) == 1)
		{
			count1++;
		}
		if (num[i + 1][j] <= h != 0 || away(i + 1, j) == 1)
		{
			count1++;
		}
		if (num[i][j - 1] <= h != 0 || away(i, j - 1) == 1)
		{
			count1++;
		}
		if (num[i][j + 1] <= h != 0 || away(i, j + 1) == 1)
		{
			count1++;
		}
		if (count1 == 4)
		{
			return 1;
		}
		return 0;
	}
	public static int away(int i, int j)
	{
		if (i < 0 || i >= m)
		{
			return 1;
		}
		if (j < 0 || j >= n)
		{
			return 1;
		}
		return 0;
	}
	public static int[][] num = new int[30][30];
	public static int m;
	public static int n;
	public static int Main()
	{
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				num[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
			if (high(num[i][j], i, j) == 1)
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(j);
				System.out.print("\n");
			}
			}
		}
		return 0;
	}
}

