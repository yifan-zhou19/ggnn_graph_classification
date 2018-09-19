package <missing>;

public class GlobalMembers
{
	public static int[][] x = new int[102][102];
	public static int[] p = new int[102];
	public static int n;
	public static void f(int k)
	{
		int min;
		int i;
		int j;
		for (i = 0; i < n - k; i++)
		{
			min = 10000;
			for (j = 0; j < n - k; j++)
			{
				if (*(p[i] + j) < min)
				{
					min = (p[i] + j);
				}
			}
			for (j = 0; j < n - k; j++)
			{
				*(p[i] + j) -= min;
			}
		}
		for (i = 0; i < n - k; i++)
		{
			min = 10000;
			for (j = 0; j < n - k; j++)
			{
				if (*(p[j] + i) < min)
				{
					min = (p[j] + i);
				}
			}
			for (j = 0; j < n - k; j++)
			{
				*(p[j] + i) -= min;
			}
		}
	}
	public static int Main()
	{
		int i;
		int j;
		int k;
		int sum;
		p = x;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int t = 0; t < n; t++)
		{
			sum = 0;
			for (i = 0; i < n; i++)
			{
			for (j = 0; j < n; j++)
			{
				*(p[i] + j) = ConsoleInput.readToWhiteSpace(true);
			}
			}
			for (k = 0; k < n - 1; k++)
			{
				f(k);
				sum += *(p[1] + 1);
				for (i = 2; i < n; i++)
				{
					*(p[0] + i - 1) = *(p[0] + i);
					*(p[i - 1] + 0) = *(p[i] + 0);
				}
				for (i = 2; i < n; i++)
				{
					for (j = 2; j < n; j++)
					{
						*(p[i - 1] + j - 1) = *(p[i] + j);
					}
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

