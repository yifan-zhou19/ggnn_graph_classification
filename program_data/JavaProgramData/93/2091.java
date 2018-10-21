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
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b = a % 3;
		c = a % 5;
		d = a % 7;
		e = b - 0;
		f = c - 0;
		g = d - 0;
		if (e == 0 && f == 0 && g > 0)
		{
			System.out.print("3 5");
		}
		else if (e == 0 && g == 0 && f > 0)
		{
			System.out.print("3 7");
		}
		else if (f == 0 && g == 0 && e > 0)
		{
			System.out.print("5 7");
		}
		else if (e == 0 && g > 0 && f > 0)
		{
			System.out.print("3");
		}
		else if (f == 0 && g > 0 && e > 0)
		{
			System.out.print("5");
		}
		else if (g == 0 && e > 0 && f > 0)
		{
			System.out.print("7");
		}
		else if (g > 0 && e > 0 && f > 0)
		{
			System.out.print("n");
		}
		else if (e == 0 && g == 0 && f == 0)
		{
			System.out.print("3 5 7");
		}
		return 0;
	}

}

