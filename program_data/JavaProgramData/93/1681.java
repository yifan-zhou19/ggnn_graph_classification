package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		i = 0;
		if ((a % 3 == 0) && (a % 5 == 0) && (a % 7 == 0))
		{
			System.out.print("3 5 7\n");
			i = 1;
		}
		else if (a % 3 == 0 && a % 5 == 0)
		{
			System.out.print("3 5\n");
			i = 1;
		}
		else if (a % 3 == 0 && a % 7 == 0)
		{
			System.out.print("3 7\n");
			i = 1;
		}
		else if (a % 5 == 0 && a % 7 == 0)
		{
			System.out.print("5 7\n");
			i = 1;
		}
		else if (a % 3 == 0)
		{
			System.out.print("3\n");
			i = 1;
		}
		else if (a % 5 == 0)
		{
			System.out.print("5\n");
			i = 1;
		}
		else if (a % 7 == 0)
		{
			System.out.print("7\n");
			i = 1;
		}
		if (i == 0)
		{
			System.out.print("n\n");
		}
		return 0;
	}
}

