package <missing>;

public class GlobalMembers
{
	public static int[][] Matrix = new int[100][100];

	public static int[] a = new int[100];

	public static int[] b = new int[100];

	public static int N = 0;

	public static void f(int n)
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
		for (int i = 0;i < n;i++)
		{
				a[i] = Matrix[i][0];
				for (int k = 1;k < n;k++)
				{
					if (a[i] > Matrix[i][k])
					{
						a[i] = Matrix[i][k];
					}
				}
		}
			for (int i = 0;i < n;i++)
			{
				for (int j = 0;j < n;j++)
				{
					Matrix[i][j] -= a[i];
				}
			}
	}
	public static void g(int n)
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Integer.SIZE / Byte.SIZE));
		for (int i = 0;i < n;i++)
		{
				b[i] = Matrix[0][i];
				for (int k = 1;k < n;k++)
				{
					if (b[i] > Matrix[k][i])
					{
						b[i] = Matrix[k][i];
					}
				}
		}
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				Matrix[j][i] -= b[i];
			}
		}
	}
	public static int h(int n)
	{
		int k = 0;
		f(n);
		g(n);
		k = Matrix[1][1];
		if (n == 2)
		{
			return k;
		}
		for (int i = 1;i < n - 1;i++)
		{
			Matrix[0][i] = Matrix[0][i + 1];
			Matrix[i][0] = Matrix[i + 1][0];
			for (int j = 1;j < n - 1;j++)
			{
				Matrix[i][j] = Matrix[i + 1][j + 1];
			}
		}
		return k + h(n - 1);
	}
	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (int j = 0;j < N;j++)
		{
			for (int i = 0;i < N;i++)
			{
				for (int j = 0;j < N;j++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						Matrix[i][j] = Integer.parseInt(tempVar2);
					}
				}
			}
			System.out.printf("%d\n",h(N));
		}
		return 0;
	}
}

