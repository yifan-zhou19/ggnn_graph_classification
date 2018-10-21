package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int n;
		c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a = 0;10 * a <= n;a++)
		{
			for (b = 0;b <= 9 && (10 * a + b) <= n;b++)
			{
				if (a != 7 && b != 7 && (10 * a + b) % 7 != 0)
				{
					c += ((10 * a + b) * (10 * a + b));
				}
			}
		}
		System.out.printf("%d",c);
		return 0;
	}
}

