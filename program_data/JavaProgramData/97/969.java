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
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d",n / 100,n % 100 / 50,n % 50 / 20,n % 50 % 20 / 10,n % 10 / 5,n % 5);
		return 0;
	}

}

