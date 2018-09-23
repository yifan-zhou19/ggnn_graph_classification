package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a == 0)
		{
			System.out.printf("%d",a);
		}
		if (a != 0)
		{
		for (;a > 0;)
		{
			System.out.printf("%d",a % 10);
			a = a / 10;
		}
		}
		return 0;
	}

}

