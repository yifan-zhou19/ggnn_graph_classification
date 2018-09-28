package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int d = 0;
		int a = 3;
		int b = 5;
		int c = 7;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		if (x % a == 0 && x % b == 0 && x % c == 0)
		{
			System.out.print("3 5 7");
		}
		else if (x % a == 0 && x % b == 0 && x % c != 0)
		{
			System.out.print("3 5");
		}
		else if (x % a == 0 && x % b != 0 && x % c == 0)
		{
			System.out.print("3 7");
		}
		else if (x % a != 0 && x % b == 0 && x % c == 0)
		{
			System.out.print("5 7");
		}
		else if (x % a == 0 && x % b != 0 && x % c != 0)
		{
			System.out.print("3");
		}
		else if (x % a != 0 && x % b == 0 && x % c != 0)
		{
			System.out.print("5");
		}
		else if (x % a != 0 && x % b != 0 && x % c == 0)
		{
			System.out.print("7");
		}
		else if (x % a != 0 && x % b != 0 && x % c != 0)
		{
			System.out.print("n");
		}
		return 0;
	}
}

