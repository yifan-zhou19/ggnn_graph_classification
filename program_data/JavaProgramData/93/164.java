package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int a = 0;
		int b = 0;
		int c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n % 3 == 0)
		{
			System.out.print("3");
		}
		else
		{
			a = 1;
		}
		if (n % 5 == 0 && a == 0)
		{
			System.out.print(" 5");
		}
		else if (n % 5 == 0 && a == 1)
		{
			System.out.print("5");
		}
		else
		{
			b = 1;
		}
		if (n % 7 == 0 && (a * b == 0))
		{
			System.out.print(" 7");
		}
		else if (n % 7 == 0 && (a * b == 1))
		{
			System.out.print("7");
		}
		else
		{
			c = 1;
		}
		if (a * b * c != 0)
		{
			System.out.print("n");
		}
	}
}

