package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.out.printf("%d\n",n / 100);
		n %= 100;
		if (n >= 50)
		{
			System.out.print("1\n");
			n -= 50;
		}
		else
		{
			System.out.print("0\n");
		}
		System.out.printf("%d\n",n / 20);
		n -= 20 * (n / 20);
		if (n >= 10)
		{
			System.out.print("1\n");
			n -= 10;
		}
		else
		{
			System.out.print("0\n");
		}
		if (n >= 5)
		{
			System.out.print("1\n");
			n -= 5;
		}
		else
		{
			System.out.print("0\n");
		}
		System.out.printf("%d\n",n);
		return 0;
	}
}

