package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int p = 0;
		int q = 0;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a % 3 == 0)
		{
			p = 1;
		}
		if (a % 5 == 0)
		{
			q = 1;
		}
		if (a % 7 == 0)
		{
			t = 1;
		}
		if (p == 1 && q == 1 && t == 1)
		{
			System.out.print("3 5 7\n");
		}
		if (p == 1 && q == 1 && t == 0)
		{
			System.out.print("3 5\n");
		}
		if (p == 1 && q == 0 && t == 1)
		{
			System.out.print("3 7\n");
		}
		if (p == 1 && q == 0 && t == 0)
		{
			System.out.print("3\n");
		}
		if (p == 0 && q == 1 && t == 1)
		{
			System.out.print("5 7\n");
		}
		if (p == 0 && q == 1 && t == 0)
		{
			System.out.print("5\n");
		}
		if (p == 0 && q == 0 && t == 1)
		{
			System.out.print("7\n");
		}
		if (p == 0 && q == 0 && t == 0)
		{
			System.out.print("n\n");
		}
	}
}

