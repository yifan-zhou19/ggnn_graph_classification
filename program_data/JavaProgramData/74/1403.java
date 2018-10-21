package <missing>;

public class GlobalMembers
{
	public static int judge1(int x)
	{
		if (x == 1)
		{
			return 0;
		}
		else
		{
			int w = 1;
			int k = 2;
			while (k * k <= x)
			{
				if (x % k == 0)
				{
					w = 0;
					break;
				}

				k++;
			}

			return w;
		}
	}

	public static int judge2(int x)
	{
		int x1 = x;
		int y = 0;
		while (x1 > 0)
		{
			y = y * 10 + x1 % 10;
			x1 /= 10;
		}

		if (x == y)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static void Main()
	{
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}

		int k;
		int t = 0;
		for (k = m;k <= n;k++)
		{
			if (judge1(k) != 0 && judge2(k) != 0)
			{
				if (t != 0)
				{
					System.out.print(",");
				}

				System.out.printf("%d",k);

				t++;
			}
		}

		if (t == 0)
		{
			System.out.print("no");
		}

		System.out.print("\n");
	}
}

