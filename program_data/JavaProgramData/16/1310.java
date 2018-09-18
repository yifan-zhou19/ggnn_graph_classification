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
		if (n == 0)
		{
			System.out.print("0");
		}
		while (n > 0)
		{
			System.out.printf("%d", n % 10);
			n /= 10;
		}

		return 0;
	}

}

