package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int a;
		int b;
		int c;
		int d;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		System.out.print("6=3+3\n8=3+5\n10=3+7\n12=5+7\n");
		for (a = 14;a <= m;a = a + 2)
		{
			for (b = 3;b < a;b = b + 2)
			{
				d = a - b;
				for (c = 3;c < Math.sqrt(b);c = c + 2)
				{
					if (b % c == 0)
					{
						break;
					}
				}
				for (e = 3;e < Math.sqrt(d);e = e+2)
				{
					if (d % e == 0)
					{
						break;
					}
				}

				if (c > Math.sqrt(b))
				{
					if (e > Math.sqrt(d))
					{
						break;
					}
				}
			}
			System.out.printf("%d=%d+%d\n", a, b, d);
		}
	}
}

