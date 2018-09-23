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
		if (n < 10)
		{
			System.out.printf("%d",n);
		}
		else
		{
			while (n != 0)
			{
			System.out.printf("%d",n % 10);
		 n = n / 10;
			}
		}
		return 0;
	}

}

