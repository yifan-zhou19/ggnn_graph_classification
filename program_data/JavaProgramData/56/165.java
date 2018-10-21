package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int m;
		int x1;
		int x2;
		int x3;
		int x4;
		int x5;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		if (m > 9999)
		{
			x5 = m / 10000;
			x4 = (m - x5 * 10000) / 1000;
			x3 = (m % 1000) / 100;
			x2 = (m % 100) / 10;
			x1 = m % 10;
			System.out.printf("%d%d%d%d%d",x1,x2,x3,x4,x5);

		}
		else if (m > 999)
		{
			x4 = m / 1000;
			x3 = (m % 1000) / 100;
			x2 = (m % 100) / 10;
			x1 = m % 10;
			System.out.printf("%d%d%d%d",x1,x2,x3,x4);

		}
		else if (m > 99)
		{
			x3 = m / 100;
			x2 = (m % 100) / 10;
			x1 = m % 10;
			System.out.printf("%d%d%d",x1,x2,x3);

		}
		else if (m > 9)
		{
			x2 = m / 10;
			x1 = m % 10;
			System.out.printf("%d%d",x1,x2);

		}
		else
		{
			x1 = m;
			System.out.printf("%d",x1);

		}

	}


}

