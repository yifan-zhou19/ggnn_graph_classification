package <missing>;

public class GlobalMembers
{
	public static void Sort(int[][] a, int n)
	{
		int i;
		int j;
		for (i = 0;i < n ;i++)
		{
			for (j = 1;j < n - 1;j++)
			{
				a[i][j] = a[i][j + 1];
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 1;j < n - 1;j++)
			{
				a[j][i] = a[j + 1][i];
			}
		}

	}


	public static void Change(int[][] a, int n)
	{
		int i;
		int j;
		int[] l = new int[100];
		int[] r = new int[100];
		for (i = 0;i < n;i++)
		{
				l[i] = a[i][0];
				for (j = 1;j < n;j++)
				{
					l[i] = l[i] > a[i][j] != 0 ? a[i][j] : l[i];
				}
		}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					a[i][j] = a[i][j] - l[i];
				}
			}
			for (i = 0;i < n;i++)
			{
				r[i] = a[0][i];
				for (j = 1;j < n;j++)
				{
					r[i] = r[i] > a[j][i] != 0 ? a[j][i] : r[i];
				}
			}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					a[j][i] = a[j][i] - r[i];
				}
			}

	}

	public static int Main()
	{
		int[][] a = new int[100][100];
		int i;
		int j;
		int n;
		int l;
		int r;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 1;k <= n;k++)
		{
			int sum = 0;
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

				}
			}




			for (i = n;i >= 2;i--)
			{
				Change(a, i);

				sum += a[1][1];
				Sort(a, i);

			}
			System.out.print(sum);
			System.out.print("\n");
		}

		return 0;
	}




}

