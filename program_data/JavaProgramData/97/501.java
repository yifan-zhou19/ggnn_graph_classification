package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		m = n / 100;
		System.out.printf("%d\n",m);
		m = (n % 100) / 50;
		System.out.printf("%d\n",m);
		m = ((n % 100) % 50) / 20;
		System.out.printf("%d\n",m);
		m = (((n % 100) % 50) % 20) / 10;
		System.out.printf("%d\n",m);
		m = ((((n % 100) % 50) % 20) % 10) / 5;
		System.out.printf("%d\n",m);
		m = (((((n % 100) % 50) % 20) % 10) % 5) / 1;
		System.out.printf("%d\n",m);
		return 0;
	}


}

