package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a = 0;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 1)
		{
			System.out.print("End");
		}
		if (n > 1)
		{
		for (a = 0;a = 1;a = 0)
		{
			if (n % 2 != 0)
			{
				b = n;
				n = n * 3 + 1;
			System.out.printf("%d*3+1=%d\n",b,n);
			}
			if (n % 2 == 0)
			{
				b = n;
				n = n / 2;
			System.out.printf("%d/2=%d\n",b,n);
			}
			if (n == 1)
			{
				break;
			}
		}
		System.out.print("End");
		}
	return 0;
	}

}

