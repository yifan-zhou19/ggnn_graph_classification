package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int y100;
		int y50;
		int y20;
		int y10;
		int y5;
		int y1;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		y100 = n / 100;
		y = n - 100 * y100;
		y50 = y / 50;
		y = y - 50 * y50;
		y20 = y / 20;
		y = y - 20 * y20;
		y10 = y / 10;
		y = y - 10 * y10;
		y5 = y / 5;
		y = y - 5 * y5;
		System.out.printf("%d\n",y100);
		System.out.printf("%d\n",y50);
		System.out.printf("%d\n",y20);
		System.out.printf("%d\n",y10);
		System.out.printf("%d\n",y5);
		System.out.printf("%d\n",y);
		return 0;
	}
}

