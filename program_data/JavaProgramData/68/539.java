package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i = i + 2)
		{
			for (a = 3;a <= i;a += 2)
			{
				b = 3;
				for (;b <= Math.sqrt(a);b += 2)
				{
				if (a % b == 0)
				{
					break;
				}
				}
				if (b > Math.sqrt(a))
				{
					c = i - a;
					d = 3;
					for (;d <= Math.sqrt(c);d += 2)
					{
						if (c % d == 0)
						{
							break;
						}
					}
						if (d > Math.sqrt(c))
						{
							System.out.printf("%ld=%ld+%ld\n",i,a,c);
							break;
						}
				}
			}

		}
	}
}

