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
		b = 0;
		while (a != 0)
		{
			b = a % 10;
			System.out.printf("%d",b);
			a = a / 10;
		}
		return 0;
	}

}

