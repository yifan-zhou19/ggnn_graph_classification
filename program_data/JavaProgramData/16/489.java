package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		c = 0;
		if (n != 0)
		{
		for (;n != 0;n = n / 10)
		{
		a = n % 10;
		System.out.printf("%d",a);

		}
		}
		else
		{
		 System.out.print("0");
		}
		return (0);


	}
}

