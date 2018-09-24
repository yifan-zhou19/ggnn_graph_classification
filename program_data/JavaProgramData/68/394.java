package <missing>;

public class GlobalMembers
{
	public static int num_f(int x)
	{
		int i;
		for (i = 2; i * i <= x; i++)
		{
			if (x % i == 0)
			{
				break;
			}
		}
			if (i * i > x)
			{
				return 1;
			}
			else
			{
				return 0;
			}
	}
	public static int Main()
	{
		int num;
		int a;
		int b;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (t = 6; t <= num;)
		{
			for (a = 3; a <= t / 2;)
			{
					b = t - a;
					if (num_f(a) == 1 && num_f(b) == 1)
					{
						System.out.printf("%d=%d+%d\n", t, a, b);
						t += 2;
						break;
					}
					else
					{
						a += 2;
					}
			}

		}
		return 0;
	}
}

