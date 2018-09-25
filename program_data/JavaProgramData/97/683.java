package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		if (m / 100 > 0)
		{
			System.out.printf("%d\n",m / 100);
			m = m % 100;
		}
		else
		{
			System.out.print("0\n");
			m = m % 100;
		}
		if (m / 50 > 0)
		{
			System.out.printf("%d\n",m / 50);
			m = m - 50;
		}
		else
		{
			System.out.printf("%d\n",0);
		}
		if (m / 20 > 0)
		{
			System.out.printf("%d\n",m / 20);
			m = m - 20 * (m / 20);
		}
		else
		{
			System.out.print("0\n");
		}
		if (m / 10 > 0)
		{
			System.out.printf("%d\n",m / 10);
			m = m - 10 * (m / 10);
		}
		else
		{
			System.out.print("0\n");
		}
		if (m / 5 > 0)
		{
			System.out.printf("%d\n",m / 5);
			m = m - 5;
		}
		else
		{
			System.out.print("0\n");
		}
		if (m > 0)
		{
			System.out.printf("%d\n",m);
		}
		else
		{
			System.out.print("0\n");
		}
	return 0;
	}
}

