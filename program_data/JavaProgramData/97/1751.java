package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int m;
		int g;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		a = m / 100;

		b = m / 10;
		c = b - 10 * a;

		System.out.printf("%d\n",a);
		if (c >= 5)
		{
			System.out.print("1\n");
			d = (c - 5) / 2;
			System.out.printf("%d\n",d);

			if ((c - 5) % 2 == 0)
			{
				System.out.print("0\n");
			}
			else
			{
				System.out.print("1\n");
			}
		}
		else
		{
			System.out.print("0\n");
			System.out.printf("%d\n",d = c / 2);

			if (c % 2 == 0)
			{
				System.out.print("0\n");
			}
			else
			{
				System.out.print("1\n");
			}
		}
		e = m - 10 * b;
		if (e >= 5)
		{
			System.out.print("1\n");
			System.out.printf("%d\n",g = e-5);
		}
		else
		{
			System.out.print("0\n");
			System.out.printf("%d\n",e);
		}
		return 0;
	}

}

