package <missing>;

public class GlobalMembers
{
	public static int[][] f = new int[11][11];
	//stiring?
	public static int PutApple(int m,int n)
	{
		if (f[m][n] != 0)
		{
			return f[m][n];
		}
		else if (m == 1 || n == 1)
		{
			f[m][n] = 1;
			return f[m][n];
		}
		else if (m < n)
		{
			f[m][n] = PutApple(m, m);
			return f[m][n];
		}
		else if (m == n)
		{
			f[m][n] = 1 + PutApple(m, m - 1);
			return f[m][n];
		}
		else
		{
			f[m][n] = PutApple(m - n, n) + PutApple(m, n - 1);
			return f[m][n];
		}
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int l;
		int m;
		int[] A = new int[100];
		for (int i = 0;i < n;++i)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(f,0,(Integer.SIZE / Byte.SIZE));
			l = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			A[i] = PutApple(l, m);
		}
		for (int i = 0;i < n;++i)
		{
			System.out.print(A[i]);
			System.out.print("\n");
		}
		return 0;
	}


}

