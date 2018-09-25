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
	if (n > 9999)
	{
		System.out.print("00001");
	}
	else if (n > 999)
	{
		System.out.printf("%d%d%d%d",n % 1000 % 100 % 10,n % 1000 % 100 / 10,n % 1000 / 100,n / 1000);
	}
	else if (n > 99)
	{
		System.out.printf("%d%d%d",n % 100 % 10,n % 100 / 10,n / 100);
	}
	else if (n > 9)
	{
		System.out.printf("%d%d",n % 10,n / 10);
	}
	else
	{
		System.out.printf("%d",n);
	}
	return 0;
	}
}

