package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x1;
		int x2;
		int x3;
		int x4;
		int x5;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		x1 = n / 10000;
		x2 = (int)(n - x1 * 10000) / 1000;
		x3 = (int)(n - x1 * 10000 - x2 * 1000) / 100;
		x4 = (int)(n - x1 * 10000 - x2 * 1000 - x3 * 100) / 10;
		x5 = (int)(n - x1 * 10000 - x2 * 1000 - x3 * 100 - x4 * 10);
		if (n > 9999)
		{
			System.out.printf("%d%d%d%d%d",x5,x4,x3,x2,x1);
		}
		else if (n > 999)
		{
			System.out.printf("%d%d%d%d",x5,x4,x3,x2);
		}
		else if (n > 99)
		{
			System.out.printf("%d%d%d",x5,x4,x3);
		}
		else if (n > 9)
		{
			System.out.printf("%d%d",x5,x4);
		}
		else
		{
			System.out.printf("%d",x5);
		}
		return 0;
	}
}

