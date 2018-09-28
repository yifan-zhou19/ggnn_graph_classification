package <missing>;

public class GlobalMembers
{
	public static int hw(int m)
	{
		int s = 0;
		int t = m;
		for (; m != 0;m = m / 10)
		{
			s = 10 * s + m % 10;

		}
		if (s == t)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int zx(int m)
	{
		int i;
		if (m % 2 == 0)
		{
			return 0;
		}
		for (i = 3; i < m / 2; i += 2)
		{
			if (m % i == 0)
			{
				return 0;
			}
		}
			return 1;
	}
	public static int Main()
	{
		int i;
		int m;
		int n;
		int k = 0;
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
		for (i = m; i < n + 1; i++)
		{
			if (hw(i) == 1 && zx(i) == 1)
			{
				if (k == 0)
				{
					k = 1;
				}
				else
				{
					System.out.print(",");
				}
				System.out.printf("%d", i);
			};
		}
	if (k == 0)
	{
		System.out.print("no");
	}
			return 0;
	}
}

