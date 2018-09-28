package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int c;
		int space = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b = a % 3;
		c = a % 5;
		if (a % 3 == 0)
		{
			System.out.print("3");
			space = 1;
		}
		if (a % 5 == 0)
		{
			if (space == 1)
			{
				System.out.print(" ");
			}
			System.out.print("5");
			space = 1;
		}
		if (a % 7 == 0)
		{
			if (space == 1)
			{
				System.out.print(" ");
			}
			System.out.print("7");
		}
		else if (b > 0 && c > 0)
		{
			System.out.print("n");
		}
	}
}

