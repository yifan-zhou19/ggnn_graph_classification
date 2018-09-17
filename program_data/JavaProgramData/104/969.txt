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
			M = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			N = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d",f(M, N));
	}
	public static int f(int m,int n)
	{
		int a;
		if (m < n)
		{
			a = m;
			m = n;
			n = a;
		}
		if (m == n)
		{
			return m;
		}
		else
		{
			return f(m / 2, n);
		}
	}

}

