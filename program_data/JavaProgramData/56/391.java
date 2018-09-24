package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n - 10000 > 0)
		{
			a = (n - n / 10 * 10) * 10000 + (n / 10 - n / 100 * 10) * 1000 + (n / 100 - n / 1000 * 10) * 100 + (n / 1000 - n / 10000 * 10) * 10 + n / 10000;
		}
		if ((n - 10000 < 0) && (n - 1000>0))
		{
			a = (n - n / 10 * 10) * 1000 + (n / 10 - n / 100 * 10) * 100 + (n / 100 - n / 1000 * 10) * 10 + n / 1000;
		}
		if ((n - 1000 < 0) && (n - 100>0))
		{
			a = (n - n / 10 * 10) * 100 + (n / 10 - n / 100 * 10) * 10 + n / 100;
		}
		if ((n - 100 < 0) && (n - 10>0))
		{
			a = (n - n / 10 * 10) * 10 + n / 10;
		}
		if (n - 10 < 0)
		{
			a = n;
		}
		System.out.printf("%d",a);
		return 0;
	}
}

