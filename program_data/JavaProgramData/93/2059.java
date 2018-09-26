package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		char b;
		b = 'n';
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a % 3 == 0 && a % 5 == 0 && a % 7 == 0)
		{
			System.out.print("3 5 7");
		}
		else if (a % 3 == 0 && a % 5 == 0 && a % 7 != 0)
		{
			System.out.print("3 5\n");
		}
		else if (a % 3 == 0 && a % 5 != 0 && a % 7 == 0)
		{
			System.out.print("3 7\n");
		}
		else if (a % 3 != 0 && a % 5 == 0 && a % 7 == 0)
		{
			System.out.print("5 7\n");
		}
		else if (a % 3 == 0 && a % 5 != 0 && a % 7 != 0)
		{
			System.out.print("3\n");
		}
		else if (a % 3 != 0 && a % 5 != 0 && a % 7 == 0)
		{
			System.out.print("7\n");
		}
		else if (a % 3 != 0 && a % 5 == 0 && a % 7 != 0)
		{
			System.out.print("5\n");
		}
		else
		{
			System.out.printf("%c",b);
		}
		return 0;
	}
}

