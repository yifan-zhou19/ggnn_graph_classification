package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		int h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b = a % 3;
		c = a % 5;
		d = a % 7;
		e = a % 15;
		f = a % 21;
		g = a % 35;
		h = a % 105;
		if (h == 0)
		{
		System.out.print("3 5 7\n");
		}
		else if (e == 0)
		{
		System.out.print("3 5\n");
		}
		else if (f == 0)
		{
		System.out.print("3 7\n");
		}
		else if (g == 0)
		{
		System.out.print("5 7\n");
		}
		else if (b == 0)
		{
		System.out.print("3\n");
		}
		else if (c == 0)
		{
		System.out.print("5\n");
		}
		else if (d == 0)
		{
		System.out.print("7\n");
		}
		else
		{
			System.out.print("n");
		}
		return 0;
	}

}

