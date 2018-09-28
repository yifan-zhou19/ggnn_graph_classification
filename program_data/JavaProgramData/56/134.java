package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a < 9)
		{
			System.out.printf("%d",a);
		}
		while (a > 9)
		{
		  b = (b + a - a / 10 * 10) * 10;
		   a = a / 10;
		}
			System.out.printf("%d",b + a);
		return 0;
	}
}

