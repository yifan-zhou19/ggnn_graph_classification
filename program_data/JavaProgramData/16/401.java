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
		System.out.printf("%d",n % 10);
		if (n / 10 != 0)
		{
			System.out.printf("%d",(n % 100) / 10);
		}
		if (n / 100 != 0)
		{
			System.out.printf("%d",(n % 1000) / 100);
		}
		if (n / 1000 != 0)
		{
			System.out.printf("%d",(n % 10000) / 1000);
		}
		if (n / 10000 != 0)
		{
			System.out.printf("%d",n / 10000);
		}
	}
}

