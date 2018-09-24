package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int i;
		int l = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (c = 6; c < n + 1; c += 2)
		{
			for (a = 3; a < c; a += 2)
			{
				l = 1;
				for (i = 3; i <= Math.sqrt(a); i += 2)
				{
					if (a % i == 0)
					{
						l = 0;
						break;
					}
				}
				if (l == 0)
				{
					continue;
				}
				b = c - a;
				for (i = 3; i <= Math.sqrt(b); i += 2)
				{
					if (b % i == 0)
					{
						l = 0;
						break;
					}
				}
				if (l == 1)
				{
					System.out.printf("%d=%d+%d\n", c, a, b);
					break;
				}
			}
		}
		return 0;
	}

}

