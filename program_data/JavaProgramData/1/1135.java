package <missing>;

public class GlobalMembers
{
	public static int make(int x,int t)
	{
		int ans = 0;
		int i;
		if (x == 1)
		{
			return 1;
		}
		for (i = t;i <= x;i++)
		{
		if (x % i == 0)
		{
			ans += make(x / i, i);
		}
		}
		return ans;
	}
	public static int Main()
	{
		int i;
		int k;
		int j;
		int p;
		int n;
		int t;
		int m;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (p = 1;p <= t;p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			x = make(n, 2);
			System.out.printf("%d\n",x);
		}
	}
}

