package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int a;
		int b;
		int c;
		int d;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		a = m % 3;
		b = m % 5;
		c = m % 7;
		if (a == 0 && b == 0 && c == 0)
		{
			System.out.print("3 5 7\n");
		}
		else if (a != 0 && b == 0 && c == 0)
		{
			System.out.print("5 7\n");
		}
		else if (a == 0 && b != 0 && c == 0)
		{
			System.out.print("3 7\n");
		}
		else if (a == 0 && b == 0 && c != 0)
		{
			System.out.print("3 5\n");
		}
		else if (a != 0 && b != 0 && c == 0)
		{
			System.out.print("7\n");
		}
		else if (a != 0 && b == 0 && c != 0)
		{
			System.out.print("5\n");
		}
		else if (a == 0 && b != 0 && c != 0)
		{
			System.out.print("3\n");
		}
		else
		{
			System.out.print("n\n");
		}
	}
}

