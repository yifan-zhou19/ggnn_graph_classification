package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int h;
		int l;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		h = n / 100;
		l = n % 100;
		System.out.print(h);
		System.out.print("\n");
		h = l / 50;
		l = l % 50;
		System.out.print(h);
		System.out.print("\n");
		h = l / 20;
		l = l % 20;
		System.out.print(h);
		System.out.print("\n");
		h = l / 10;
		l = l % 10;
		System.out.print(h);
		System.out.print("\n");
		h = l / 5;
		l = l % 5;
		System.out.print(h);
		System.out.print("\n");
		h = l / 1;
		l = l % 1;
		System.out.print(h);
		System.out.print("\n");
		return 0;
	}
}

