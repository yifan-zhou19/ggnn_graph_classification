package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = n % 3;
		b = n % 5;
		c = n % 7;
		if (a != 0 && b != 0 && c != 0)
		{
			System.out.print("n\n");
		}
		else if (a == 0)
		{
			System.out.print("3");
		}
		if (b == 0)
		{
			if (a == 0)
			{
		System.out.print(" 5");
			}
		else
		{
			System.out.print("5");
		}
		}
		if (c == 0)
		{
			if (b == 0 || a == 0)
			{
			System.out.print(" 7");
			}
			else
			{
				System.out.print("7");
			}
		}
		return 0;
	}
}

