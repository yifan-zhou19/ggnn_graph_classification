package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int x;
	x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int x100 = x / 100;
	System.out.print(x100);
	System.out.print("\n");
	x = x % 100;
	int x50 = x / 50;
	System.out.print(x50);
	System.out.print("\n");
	x = x % 50;
	int x20 = x / 20;
	System.out.print(x20);
	System.out.print("\n");
	x = x % 20;
	int x10 = x / 10;
	System.out.print(x10);
	System.out.print("\n");
	x = x % 10;
	int x5 = x / 5;
	System.out.print(x5);
	System.out.print("\n");
	x = x % 5;
	System.out.print(x);
	System.out.print("\n");
	return 0;
	}
}

