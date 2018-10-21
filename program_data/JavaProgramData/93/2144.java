package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int a = 0;
		int b = 0;
		int c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		if (i % 3 == 0)
		{
			a = 1;
		}
		if (i % 5 == 0)
		{
			b = 1;
		}
		if (i % 7 == 0)
		{
			c = 1;
		}
		if (a != 0 && b != 0 && c != 0)
		{
			System.out.print("3 5 7");
		}
		if (a != 0 && b != 0 && c == 0)
		{
			System.out.print("3 5");
		}
		if (a != 0 && c != 0 && b == 0)
		{
			System.out.print("3 7");
		}
		if (a == 0 && b != 0 && c != 0)
		{
			System.out.print("5 7");
		}
		if (a != 0 && b == 0 && c == 0)
		{
			System.out.print("3");
		}
		if (a == 0 && b != 0 && c == 0)
		{
			System.out.print("5");
		}
		if (a == 0 && b == 0 && c != 0)
		{
			System.out.print("7");
		}
		if (a == 0 && b == 0 && c == 0)
		{
			System.out.print("n");
		}
	}

}

