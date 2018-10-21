package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b = 0;
		for (c = a % 10;a > 0;)
		{
			b = b * 10 + c;
			a = (a - c) / 10;
			c = a % 10;
		}
		System.out.printf("%d",b);
	}


}

