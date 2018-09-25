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
		int a = x % 3;
		int b = x % 5;
		int c = x % 7;

		if (a == 0 && b == 0 && c == 0)
		{
		System.out.print("3 5 7");
		}
		if (a == 0 && b == 0 && c != 0)
		{
		System.out.print("3 5");
		}
		if (a == 0 && b != 0 && c == 0)
		{
			System.out.print("3 7");
		}
		if (a != 0 && b == 0 && c == 0)
		{
			System.out.print("5 7");
		}
		if (a != 0 && b != 0 && c != 0)
		{
			System.out.print("n");
		}
		if (a == 0 && b != 0 && c != 0)
		{
			System.out.print("3");
		}
		if (a != 0 && b == 0 && c != 0)
		{
			System.out.print("5");
		}
		if (a != 0 && b != 0 && c == 0)
		{
			System.out.print("7");
		}


		return 0;
	}


}

