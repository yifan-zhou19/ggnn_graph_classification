package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a1;
		int a2;
		int a3;
		int a4;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n >= 1000)
		{
			a4 = n / 1000;
		 a3 = (n - a4 * 1000) / 100;
		 a2 = (n - a4 * 1000 - a3 * 100) / 10;
		 a1 = n - a4 * 1000 - a3 * 100 - a2 * 10;
		 System.out.printf("%d%d%d%d",a1,a2,a3,a4);
		}
		if (n >= 100 && n < 1000)
		{
			a3 = n / 100;
		 a2 = (n - a3 * 100) / 10;
		 a1 = n - a3 * 100 - a2 * 10;
		 System.out.printf("%d%d%d",a1,a2,a3);
		}
		if (n >= 10 && n < 100)
		{
			a2 = n / 10;
		 a1 = n - a2 * 10;
		 System.out.printf("%d%d",a1,a2);
		}
		if (n < 10)
		{
			System.out.printf("%d",n);
		}
		return 0;
	}

}

