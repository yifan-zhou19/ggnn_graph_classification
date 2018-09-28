package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int a;
		int b;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		a = x % 3;
		b = x % 5;
		c = x % 7;
		if (a == 0 && b == 0 && c == 0)
		{
			System.out.print("3 5 7");
		}
		else if (a == 0 && b == 0 && c != 0)
		{
			System.out.print("3 5");
		}
		else if (a == 0 && b != 0 && c == 0)
		{
			System.out.print("3 7");
		}
		else if (a != 0 && b == 0 && c == 0)
		{
			System.out.print("5 7");
		}
		else if (a != 0 && b != 0 && c == 0)
		{
			System.out.print("7");
		}
		else if (a != 0 && b == 0 && c != 0)
		{
			System.out.print("5");
		}
		else if (a == 0 && b != 0 && c != 0)
		{
			System.out.print("3");
		}
		else
		{
			System.out.print("n");
		}
		return 0;
	}
}

