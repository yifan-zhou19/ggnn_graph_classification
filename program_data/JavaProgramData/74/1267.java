package <missing>;

public class GlobalMembers
{
	public static int chengfang(int n)
	{
		int i;
		int ans = 1;
		for (i = 1;i <= n;i++)
		{
			ans *= 10;
		}
		return ans;
	}

	public static int ws(int n)
	{
		int i;
		for (i = 1;i < 32;i++)
		{
			if (n / chengfang(i) == 0)
			{
				return i;
				break;
			}
		}
	}

	public static int sushu(int n)
	{
		int i;
		int ans = 1;
		for (i = 2;i <= Math.sqrt(n);i++)
		{
			if (n % i == 0)
			{
				ans = 0;
			}
		}
		return ans;
	}

	public static int huiwen(int n)
	{
		int i;
		int t = ws(n);
		int ans = 1;
		for (i = 1;i <= t / 2;i++)
		{
			if (n / chengfang(i - 1) % 10 != n / chengfang(t - i) % 10)
			{
				ans = 0;
			}
		}
		return ans;
	}

	public static int Main()
	{
		int n;
		int m;
		int i;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = n;i <= m;i++)
		{
			if (sushu(i) == 1)
			{
				if (huiwen(i) == 1)
				{
					System.out.printf("%d",i);
					t = i;
					break;
				}
			}
		}
		if (t == 0)
		{
			System.out.print("no");
		}
		else
		{
		for (i = t + 1;i <= m;i++)
		{
			if (sushu(i) == 1)
			{
				if (huiwen(i) == 1)
				{
					System.out.printf(",%d",i);
				}
			}
		}
		}
		return 0;
	}
}

