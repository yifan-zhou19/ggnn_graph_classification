package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.out.printf("%d\n",n / 100);
		System.out.printf("%d\n",(n - n / 100 * 100) / 50);
		System.out.printf("%d\n",(n - n / 100 * 100 - (n - n / 100 * 100) / 50 * 50) / 20);
		System.out.printf("%d\n",(n - n / 100 * 100 - (n - n / 100 * 100) / 50 * 50 - (n - n / 100 * 100 - (n - n / 100 * 100) / 50 * 50) / 20 * 20) / 10);
		System.out.printf("%d\n",(n - n / 100 * 100 - (n - n / 100 * 100) / 50 * 50 - (n - n / 100 * 100 - (n - n / 100 * 100) / 50 * 50) / 20 * 20 - (n - n / 100 * 100 - (n - n / 100 * 100) / 50 * 50 - (n - n / 100 * 100 - (n - n / 100 * 100) / 50 * 50) / 20 * 20) / 10 * 10) / 5);
		System.out.printf("%d\n",n % 5);
		return 0;
	}
}

