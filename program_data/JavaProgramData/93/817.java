package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = n % 3;
		b = n % 5;
		c = n % 7;
		if (a == 0 && b == 0 && c == 0)
		{
			System.out.print("3 5 7");
		}
		if (a == 0 && b == 0 && !c == 0)
		{
			System.out.print("3 5");
		}
		if (a == 0 && c == 0 && !b == 0)
		{
			System.out.print("3 7");
		}
		if (b == 0 && c == 0 && !a == 0)
		{
			System.out.print("5 7");
		}
		if (a == 0 && !b == 0 && !c == 0)
		{
			System.out.print("3");
		}
		if (b == 0 && !a == 0 && !c == 0)
		{
			System.out.print("5");
		}
		if (c == 0 && !b == 0 && !a == 0)
		{
			System.out.print("7");
		}
		if (!c == 0 && !b == 0 && !a == 0)
		{
			System.out.print("n");
		}
	return 0;
	}
}

