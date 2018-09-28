package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		a = i % 3 == 0;
		b = i % 5 == 0;
		c = i % 7 == 0;
		if (a + b + c == 3)
		{
			System.out.print("3 5 7\n");
		}
		else if (a + b == 2)
		{
			System.out.print("3 5\n");
		}
		else if (a + c == 2)
		{
			System.out.print("3 7\n");
		}
		else if (b + c == 2)
		{
			System.out.print("5 7\n");
		}
		else if (a == 1)
		{
			System.out.print("3\n");
		}
		else if (b == 1)
		{
			System.out.print("5\n");
		}
		else if (c == 1)
		{
			System.out.print("7\n");
		}
		else
		{
			System.out.print("n\n");
		}
		return 0;
	}
}

