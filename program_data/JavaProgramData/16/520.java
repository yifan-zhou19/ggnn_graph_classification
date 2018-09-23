package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int d;
		int e;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int x;
		x = n;
		a = n / 10000;
		n = n - a * 10000;
		b = n / 1000;
		n = n - b * 1000;
		c = n / 100;
		n = n - c * 100;
		d = n / 10;
		e = n - d * 10;
		if (x < 10)
		{
			System.out.print(e);
			System.out.print("\n");
		}
		else if ((x >= 10) && (x < 100))
		{
			System.out.print(e);
			System.out.print(d);
			System.out.print("\n");
		}
		else if ((x >= 100) && (x < 1000))
		{
			System.out.print(e);
			System.out.print(d);
			System.out.print(c);
			System.out.print("\n");
		}
		else if ((x >= 1000) && (x < 10000))
		{
			System.out.print(e);
			System.out.print(d);
			System.out.print(c);
			System.out.print(b);
			System.out.print("\n");
		}
		else
		{
			System.out.print("00001");
			System.out.print("\n");
		}
		return 0;
	}
}

