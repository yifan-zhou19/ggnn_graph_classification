package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int a = 0;
		int b = 0;
		int c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			z = Integer.parseInt(tempVar);
		}
		if (z % 3 == 0)
		{
			a = 3;
		}
		if (z % 5 == 0)
		{
			b = 5;
		}
		if (z % 7 == 0)
		{
			c = 7;
		}
		if (a != 0)
		{
			System.out.printf("%d",a);
		}
		if (b != 0)
		{
				if (a != 0)
				{
				System.out.printf(" %d",b);
				}
			else
			{
				System.out.printf("%d",b);
			}
		}
		if (c != 0)
		{
				if (a != 0 || b != 0)
				{
				System.out.printf(" %d",c);
				}
			else
			{
				System.out.printf("%d",c);
			}
		}
		if (a + b + c == 0)
		{
			System.out.print("n");
		}
		return 0;
	}
}

