package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		int x;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = x / 100;
		b = (x % 100) / 50;
		c = (x % 50) / 20;
		d = (x - (a * 100 + b * 50 + c * 20)) / 10;
		e = (x % 10) / 5;
		f = (x % 5) / 1;
		System.out.print(a);
		System.out.print("\n");
		System.out.print(b);
		System.out.print("\n");
		System.out.print(c);
		System.out.print("\n");
		System.out.print(d);
		System.out.print("\n");
		System.out.print(e);
		System.out.print("\n");
		System.out.print(f);
		System.out.print("\n");
		return 0;


	}
}

