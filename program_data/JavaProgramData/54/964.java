package <missing>;

public class GlobalMembers
{
	public static int apple(int n, int k)
	{
		int i;
		int s;
		int p;
		int t;
		s = 0;
		if (n == 1)
		{
			return 1 * n + k;
		}
		if (n >= 2)
		{
			for (i = 1;i <= 100000000;i++)
			{
				t = 0;
				s = i * n + k;
				for (p = 1;p <= n - 1;p++)
				{
					if (s % (n - 1) == 0)
					{
						s = s * n / (n - 1) + k;
						t++;
					}
					else
					{
						break;
					}
				}
				if (t == n - 1)
				{
					break;
				}
			}
			return s;
		}
	}
	public static int Main()
	{
		int n0;
		int k0;
		int num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n0 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k0 = Integer.parseInt(tempVar2);
		}
		num = apple(n0, k0);
		System.out.printf("%d",num);
		return 0;
	}
}

