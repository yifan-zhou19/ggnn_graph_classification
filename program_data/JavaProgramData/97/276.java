package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		if (m / 100 == 0)
		{
			System.out.print("0\n");
		}
		else
		{
			System.out.printf("%d\n",m / 100);
		}
		a = m - 100 * (m / 100);
		if (a / 50 == 0)
		{
			System.out.print("0\n");
		}
		else
		{
			System.out.printf("%d\n",a / 50);
		}
		b = a - 50 * (a / 50);
		if (b / 20 == 0)
		{
			System.out.print("0\n");
		}
		else
		{
			System.out.printf("%d\n",b / 20);
		}
		c = b - 20 * (b / 20);
		if (c / 10 == 0)
		{
			System.out.print("0\n");
		}
		else
		{
			System.out.printf("%d\n",c / 10);
		}
		d = c - 10 * (c / 10);
		if (d / 5 == 0)
		{
			System.out.print("0\n");
		}
		else
		{
			System.out.printf("%d\n",d / 5);
		}
		e = d - 5 * (d / 5);
		if (e / 1 == 0)
		{
			System.out.print("0\n");
		}
		else
		{
			System.out.printf("%d\n",e / 1);
		}
		return 0;





	}
}

