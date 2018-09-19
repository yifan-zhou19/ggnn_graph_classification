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
		if (a < 10)
		{
			System.out.printf("%d",a);
		}
		else
		{
	while (a / 10 != 0)
	{
				b = a / 10;
				c = a - 10 * b;
				System.out.printf("%d",c);
				a = b;
	}
			System.out.printf("%d",a);
		}
	}

}

