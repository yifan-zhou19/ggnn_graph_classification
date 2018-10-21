package <missing>;

public class GlobalMembers
{
	public static int shu(int a)
	{
		int q;
		if (a % 2 == 0)
		{
				q = a / 2;
				System.out.printf("%d/2=%d\n",a,q);
				return q;
		}
		if (a % 2 != 0)
		{
				q = a * 3 + 1;
				System.out.printf("%d*3+1=%d\n",a,q);
				return q;
		}
	}

	public static int Main()
	{
		int n;
		int r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 1)
		{
			System.out.print("End\n");
			return 0;
		}
		if (n % 2 == 0)
		{
			r = n / 2;
			System.out.printf("%d/2=%d\n",n,r);
		}
		if (n % 2 != 0)
		{
			r = n * 3 + 1;
			System.out.printf("%d*3+1=%d\n",n,r);
		}
		while (r != 1)
		{
			r = shu(r);
		}
		if (r == 1)
		{
			System.out.print("End\n");
		}
		return 0;
	}

}

