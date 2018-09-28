package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		int a;
		int b;
		int c;
		a = x % 3;
		b = x % 5;
		c = x % 7;
		if (a == 0 && b == 0 && c == 0)
		{
			System.out.print("3 5 7");
		}
		else
		{
		x = x;
		}
		if (a != 0 && b == 0 && c == 0)
		{
			System.out.print("5 7");
		}
		else
		{
		x = x;
		}
		if (a == 0 && b != 0 && c == 0)
		{
			System.out.print("3 7");
		}
		else
		{
		x = x;
		}
		if (a == 0 && b == 0 && c != 0)
		{
			System.out.print("3 5");
		}
		else
		{
		x = x;
		}
		if (a != 0 && b != 0 && c == 0)
		{
			System.out.print("7");
		}
		else
		{
		x = x;
		}
		if (a != 0 && b == 0 && c != 0)
		{
			System.out.print("5");
		}
		else
		{
		x = x;
		}
		if (a == 0 && b != 0 && c != 0)
		{
			System.out.print("3");
		}
		else
		{
		x = x;
		}
		if (a != 0 && b != 0 && c != 0)
		{
			System.out.print("n");
		}
		else
		{
		x = x;
		}
		return 0;
	}
}

