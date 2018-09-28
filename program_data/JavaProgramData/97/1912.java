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
	System.out.printf("%d\n\n",n / 100);
	 System.out.printf("%d\n\n",(n % 100) / 50);
	 System.out.printf("%d\n\n",(n % 50) / 20);
	a = n % 50;
	 System.out.printf("%d\n\n",(a % 20) / 10);
	 System.out.printf("%d\n\n",(n % 10) / 5);
	 System.out.printf("%d\n\n",n % 5);
	return 0;
	}
}

