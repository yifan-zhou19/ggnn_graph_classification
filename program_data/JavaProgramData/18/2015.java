package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[1001][1001];
	public static int[] r = new int[1001];
	public static int[] c = new int[1001];
	public static int s = 0;
	public static void f(int n)
	{
		for (int i = 0;i < n;i++)
		{
			r[i] = a[i][0];
			for (int j = 0;j < n;j++)
			{
			if (a[i][j] < r[i])
			{
				r[i] = a[i][j];
			}
			}
			for (int j = 0;j < n;j++)
			{
			a[i][j] -= r[i];
			}
		}
		for (int i = 0;i < n;i++)
		{
			r[i] = a[0][i];
			for (int j = 0;j < n;j++)
			{
			if (a[j][i] < r[i])
			{
				r[i] = a[j][i];
			}
			}
			for (int j = 0;j < n;j++)
			{
			a[j][i] -= r[i];
			}
		}
		s += a[1][1];
		if (n == 2)
		{
			System.out.print(s);
			System.out.print("\n");
			return;
		}
		for (int i = 1;i < n - 1;i++)
		{
		for (int j = 0;j < n;j++)
		{
			a[i][j] = a[i + 1][j];
		}
		}
	   for (int i = 1;i < n - 1;i++)
	   {
		for (int j = 0;j < n - 1;j++)
		{
			a[j][i] = a[j][i + 1];
		}
	   }
			f(n - 1);
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int t = n;
		while (t-- != 0)
		{
			s = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Integer.SIZE / Byte.SIZE));
			for (int i = 0;i < n;i++)
			{
			for (int j = 0;j < n;j++)
			{
			a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			}
			f(n);
		}


	}

}

