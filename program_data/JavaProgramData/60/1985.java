package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = int n;
		int N;
		int i;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 2;i <= N - 2;i++)
		{
			if (f(i) == 1 && f(i + 2) == 1)
			{
				System.out.printf("%d %d\n",i,i + 2);
				t = 1;
			}
		}
		if (t == 0)
		{
			System.out.print("empty\n");
		}
	}

	public static int f(int n)
	{
		int i;
		int m;
		m = (int)Math.sqrt(n);
		int t = 1;
		for (i = 2;i <= m;i++)
		{
			if (n % i == 0)
			{
				t = 0;
			}
		}
		return t;
	}
}

