package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int a = (m % 3 == 0);
		int b = (m % 5 == 0);
		int c = (m % 7 == 0);
		if (a == 1 && b == 1 && c == 1)
		{
			System.out.print("3 5 7");
		}
		else if (a == 1 && b == 1 && c != 1)
		{
			System.out.print("3 5");
		}
		else if (a == 1 && b != 1 && c == 1)
		{
			System.out.print("3 7");
		}
		else if (a != 1 && b == 1 && c == 1)
		{
			System.out.print("5 7");
		}
		else if (a == 1 && b != 1 && c != 1)
		{
			System.out.print("3");
		}
		else if (a != 1 && b == 1 && c != 1)
		{
			System.out.print("5");
		}
		else if (a != 1 && b != 1 && c == 1)
		{
			System.out.print("7");
		}
		else
		{
			System.out.print("n");
		}
		return 0;
	}
}

