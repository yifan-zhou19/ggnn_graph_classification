package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int a = 0;
		int b;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = (int)n / 100;
		f = n - a * 100;
		System.out.printf("%d\n", a);
		b = f / 10;
		if (b == 0)
		{
			System.out.printf("%d\n%d\n%d\n", 0, 0, 0);
		}
		else if (b / 5 == 0)
		{
			if (b % 2 == 0)
			{
				System.out.printf("%d\n%d\n%d\n", 0, b / 2, 0);
			}

			else
			{
			 System.out.printf("%d\n%d\n%d\n", 0, (int)b / 2,1);
			}
		}

		if (b / 5 != 0)
		{
			e = b - 5;
			if (e % 2 == 0)
			{
				System.out.printf("%d\n%d\n%d\n", 1, e / 2, 0);
			}
			else
			{
			 System.out.printf("%d\n%d\n%d\n", 1, (int)e / 2,1);
			}
		}


		c = n - 100 * a - 10 * b;
		if (c == 0)
		{
			System.out.printf("%d\n%d\n", 0, 0);
		}
		else if (c / 5 == 0)
		{
			System.out.printf("%d\n%d\n", 0, c);
		}

		else
		{
		 d = c - 5;
			System.out.printf("%d\n%d\n", 1, d);

		}


	}


}

