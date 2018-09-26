package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = n / 100;
		b = n / 10 - n / 100 * 10;
		c = n - n / 100 * 100 - (n / 10 - n / 100 * 10) * 10;

		if (a != 0)
		{
			System.out.printf("%d\n",a);
		}
		else
		{
			System.out.print("0\n");
		}

		if (b >= 5)
		{
			System.out.printf("%d\n",b / 5);
			b = b - 5;
		}
		else
		{
			System.out.print("0\n");
		}
		if (b >= 2 && b < 5)
		{
			System.out.printf("%d\n",b / 2);
			b = b - 2;
		}
		else
		{
			System.out.print("0\n");
		}
		if (b == 1)
		{
			System.out.printf("%d\n",b);
		}
		else
		{
			System.out.print("0\n");
		}
		if (c >= 5)
		{
			System.out.printf("%d\n",c / 5);
			c = c - 5;
		}
		else
		{
			System.out.print("0\n");
		}
		if (c >= 1 && c < 5)
		{
			System.out.printf("%d\n",c);
		}
		else
		{
			System.out.print("0\n");
		}

		return 0;
	}


}

