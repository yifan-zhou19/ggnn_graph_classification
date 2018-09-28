package <missing>;

public class GlobalMembers
{
	public static int jiaogu(int n)
	{
		if (n == 1)
		{
			System.out.print("End");
		}
	else
	{
		if (n % 2 == 1)
		{
			System.out.printf("%d*3+1=%d\n",n,3 * n + 1);
			jiaogu(3 * n + 1);
		}
	else
	{
		System.out.printf("%d/2=%d\n",n,n / 2);
		jiaogu(n / 2);
	}
	}
	return 0;
	}

	public static int Main()
	{
		int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	jiaogu(n);
	return 0;
	}
}

