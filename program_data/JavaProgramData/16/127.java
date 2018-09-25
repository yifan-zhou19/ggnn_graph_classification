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
		for (;a != 0;a = (a - (a % 10)) / 10)
		{
			b = (a % 10);
			System.out.printf("%d",b);
		}
			return 0;
	}
}

