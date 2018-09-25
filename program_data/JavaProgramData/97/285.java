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
		System.out.printf("%d\n",(n % 100) / 50);
		System.out.printf("%d\n",((n % 100) % 50) / 20);
		System.out.printf("%d\n",(((n % 100) % 50) % 20) / 10);
		System.out.printf("%d\n",((((n % 100) % 50) % 20) % 10) / 5);
		System.out.printf("%d\n",(((((n % 100) % 50) % 20) % 10) % 5) / 1);
		return 0;
	}
}

