package <missing>;

public class GlobalMembers
{
	public static int max(int[][] array, int n, int i)
	{
		int j;
		int m;
		m = array[i][0];
		for (j = 0;j < n;j++)
		{
		m = m > array[i][j] != 0?m:array[i][j];
		}
		return m;
	}
	public static int min(int[][] array, int n, int j)
	{
		int i;
		int m;
		m = array[0][j];
		for (i = 0;i < n;i++)
		{
		m = m < array[i][j] != 0?m:array[i][j];
		}
		return m;
	}

	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int k = 0;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
			a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (a[i][j] == max(a, 5, i) && a[i][j] == min(a, 5, j))
				{
					System.out.print(i + 1);
					System.out.print(" ");
					System.out.print(j + 1);
					System.out.print(" ");
					System.out.print(a[i][j]);
					System.out.print("\n");
					k++;
				}
			}
		}
		if (k == 0)
		{
		System.out.print("not found");
		}
		return 0;
	}
}

