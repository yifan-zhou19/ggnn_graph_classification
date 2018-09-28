package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a - 0 >= 0 && a - 10 < 0)
		{
			b = a;
		}
		else if (a - 10 >= 0 && a - 100 < 0)
		{
			b = a % 10 * 10 + a / 10;
		}
		else if (a - 100 >= 0 && a - 1000 < 0)
		{
			b = a % 10 * 100 + (a % 100 - a % 10) + a / 100;
		}
		else if (a - 1000 >= 0 && a - 10000 < 0)
		{
			b = a % 10 * 1000 + (a % 100 - a % 10) * 10 + (a % 1000 - a % 100) / 10 + a / 1000;
		}
		else if (a - 10000 >= 0 && a - 100000 < 0)
		{
			b = a % 10 * 10000 + (a % 100 - a % 10) * 100 + (a % 1000 - a % 100) + (a % 10000 - a % 1000) / 100 + a / 10000;
		}
		System.out.printf("%d", b);
		return 0;
	}
}

