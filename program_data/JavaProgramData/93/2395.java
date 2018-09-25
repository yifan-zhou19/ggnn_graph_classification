package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int b = 0;
		int sp = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n % 3 == 0)
		{
			System.out.print("3");
			sp = 1;
			b = 1;
		}
		if (n % 5 == 0)
		{
			if (sp != 0)
			{
				System.out.print(" ");
			}
			System.out.print("5");
			sp = 1;
			b = 1;
		}
		if (n % 7 == 0)
		{
			if (sp != 0)
			{
				System.out.print(" ");
			}
			System.out.print("7");
			b = 1;
		}
		if (b == 0)
		{
			System.out.print("n");
		}
	}
}

