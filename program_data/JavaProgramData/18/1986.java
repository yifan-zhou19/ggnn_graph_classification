package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[1001][1001];
	public static int sum = 0;
	public static void reduce(int[][] a, int n)
	{

		int i;
		int j;
		for (i = 0; i < n; i++) //??????
		{
			int min = a[i][0];
			for (j = 0; j < n; j++)
			{
				if (a[i][j] < min)
				{
					min = a[i][j];
				}
			}
			for (j = 0; j < n; j++)
			{
				a[i][j] -= min;
			}
		}
		for (j = 0; j < n; j++) //??????
		{
			int min = a[0][j];
			for (i = 0; i < n; i++)
			{
				if (a[i][j] < min)
				{
					min = a[i][j];
				}
			}
			for (i = 0; i < n; i++)
			{
				a[i][j] -= min;
			}
		}
		sum += a[1][1];
		for (i = 0; i < n; i++) //?????
		{
			for (j = 1; j < n; j++)
			{
				a[i][j] = a[i][j + 1];
			}
		}
		for (j = 0; j < n; j++)
		{
			for (i = 1; i < n; i++)
			{
				a[i][j] = a[i + 1][j];
			}
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0; k < n; k++)
		{
			sum = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a, 0, (Integer.SIZE / Byte.SIZE));
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (i = n; i > 1; i--)
			{
				reduce(a, i);
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

