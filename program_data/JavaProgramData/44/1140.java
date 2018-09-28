package <missing>;

public class GlobalMembers
{
	public static int f(int x)
	{
		int a;
		int c;
		if (x < 10)
		{
			return x;
		}
		c = 10;
		while (c <= x)
		{
			c = c * 10;
		}
		c = c / 10;
		a = x % 10;
		a = f(x / 10) + a * c;
		return a;
	}
	public static int Main()
	{
		int n;
		int i;
		int sig;
		int ans;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n >= 0)
			{
				sig = 0;
			}
			else
			{
				n = -n;
				sig = 1;
			}
			ans = f(n);
			if (sig == 1)
			{
				ans = -ans;
			}
			System.out.printf("%d\n",ans);
		}
		return 0;
	}

}

