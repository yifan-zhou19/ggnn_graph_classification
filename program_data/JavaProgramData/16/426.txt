package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a == 0)
		{
			System.out.print("0");
		}
		else
		{
		while (a != 0)
		{
			b = a - a / 10 * 10;
			a = a / 10;
			System.out.printf("%d",b);
		}
		}
		return 0;
	}

}

