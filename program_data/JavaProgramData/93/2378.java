package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int a;
		int b;
		int c;
		int A;
		int B;
		int C;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		a = x % 3;
		b = x % 5;
		c = x % 7;
		A = 3;
		B = 5;
		C = 7;
		if (a == 0 && b == 0 && c == 0)
		{
			System.out.print("3 5 7");
		}
		if (a == 0 && b == 0 && c != 0)
		{
			System.out.print("3 5");
		}
		if (a == 0 && c == 0 && b != 0)
		{
			System.out.print("3 7");
		}
		if (b == 0 && c == 0 && a != 0)
		{
			System.out.print("5 7");
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
		if (a != 0 && b != 0 && c != 0)
		{
			System.out.print("n");
		}
		return 0;

	}
}

