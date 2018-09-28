package <missing>;

public class GlobalMembers
{
	public static int r(int n)
	{
		int m;
		int d = 0;
		m = n;
		while (m != 0)
		{
				   d = d * 10 + m % 10;
				   m = m / 10;
		}
		return n == d;
	}
	public static int test(int n)
	{
		int j;
		for (j = 2;j <= n / 2;j++)
		{
		if (n % j == 0)
		{
		return 0;
		}
		}
		return 1;
	}
	public static int Main()
	{
		int m;
		int n;
		int l = 0;
		int c = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
					   if (r(i) != 0 && test(i) != 0)
					   {
										if (l == 0)
										{
											System.out.printf("%d",i);
										l = 1;
										}
										else
										{
										System.out.printf(",%d",i);
										}
					   }
					   else
					   {
						   c++;
					   }

		}
		if (c == n - m + 1)
		{
		System.out.print("no");
		}
		System.in.read();
		System.in.read();

	}

}

