package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int f = new int(int m,int n);
		int d;
		int M;
		int N;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			d = Integer.parseInt(tempVar);
		}
		for (;d > 0;d--)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			M = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			N = Integer.parseInt(tempVar3);
		}
		System.out.printf("%d\n",f(M, N));
		}
	}
	public static int f(int m,int n)
	{
		if ((m == 1) || (n == 1))
		{
			return 1;
		}
		else if (m <= n)
		{
			return (f(m, m - 1) + 1);
		}
		else
		{
			return (f(m, n - 1) + f(m - n, n));
		}
	}

}

