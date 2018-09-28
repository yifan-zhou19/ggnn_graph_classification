package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int s;
		int b;
		int b1;
		int b2;
		int b3;
		int g;
		int g1;
		int g2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = n / 100;
		b = n / 10 % 10;
		g = n % 10;
		if (b >= 5)
		{
			b1 = b / 5;
			b2 = (b - b1 * 5) / 2;
			b3 = b - b1 * 5 - b2 * 2;
		}
		if (b < 5 && b >= 2)
		{
			b1 = 0;
			b2 = b / 2;
			b3 = b - b2 * 2;
		}
		if (b < 2)
		{
			b1 = 0;
			b2 = 0;
			b3 = b;
		}
		if (g >= 5)
		{
			g1 = 1;
			g2 = g - g1 * 5;
		}
		if (g < 5)
		{
			g1 = 0;
			g2 = g;
		}
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d",s,b1,b2,b3,g1,g2);
		return 0;
	}
}

