package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int f = new int(int m,int n);
		int t;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		while (scanf("%d %d", m, n) == 2)
		{
			System.out.printf("%d\n",f(m, n));
		}
	}
	public static int f(int m,int n)
	{
		if (m == 0 || n == 1)
		{
			return (1);
		}
		else if (m < n)
		{
			return (f(m, m));
		}
		else
		{
			return (f(m, n - 1) + f(m - n, n));
		}
	}



}

