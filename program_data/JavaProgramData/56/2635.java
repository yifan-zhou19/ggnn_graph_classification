package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		if (x < 10)
		{
			System.out.printf("%d",x);
		}
		else if (9 < x && x < 100)
		{
			System.out.printf("%d",x % 10 * 10 + x / 10);
		}
		else if (99 < x && x < 1000)
		{
			System.out.printf("%d",x % 10 * 100 + x % 100 / 10 * 10 + x / 100);
		}
		else if (999 < x && x < 10000)
		{
			System.out.printf("%d",x % 10 * 1000 + x % 100 / 10 * 100 + x % 1000 / 100 * 10 + x / 1000);
		}
		else if (9999 < x && x < 100000)
		{
			System.out.printf("%d",x % 10 * 10000 + x % 100 / 10 * 1000 + x % 1000 / 100 * 100 + x % 10000 / 1000 * 10 + x / 10000);
		}
	}
}

