package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int l;
	public static int p;
	public static int sum = 0;
	public static int[][] a = new int[105][105];

	public static void g()
	{
		int i;
		int j;
		int t;
		for (i = 1;i <= n - p;i++)
		{
			t = (*(a + i) + 1);
			for (j = 1;j <= n - p;j++)
			{
				if (*(*(a + i) + j) < t)
				{
					t = (*(a + i) + j);
				}
			}
			for (j = 1;j <= n - p;j++)
			{
				*(*(a + i) + j) -= t;
			}
		}
		for (i = 1;i <= n - p;i++)
		{
			t = (*(a + 1) + i);
			for (j = 1;j <= n - p;j++)
			{
				if (*(*(a + j) + i) < t)
				{
					t = (*(a + j) + i);
				}
			}
			for (j = 1;j <= n - p;j++)
			{
				*(*(a + j) + i) -= t;
			}
		}
	}

	public static void f()
	{
		int i;
		int j;
		for (i = 1;i <= n;i++)
		{
			for (j = 2;j < n;j++)
			{
				*(*(a + i) + j) = *(*(a + i) + j + 1);
			}
		}
		for (j = 1;j <= n;j++)
		{
			for (i = 2;i <= n;i++)
			{
				*(*(a + i) + j) = *(*(a + i + 1) + j);
			}
		}
	}
	public static int Main()
	{
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (l = 0;l < n;l++)
		{
			sum = 0;
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					*(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			for (p = 0;p < n;p++)
			{

				g();
				sum += (*(*(a + 2) + 2));
				f();
			}

			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

