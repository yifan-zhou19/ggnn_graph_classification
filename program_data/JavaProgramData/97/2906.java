package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int k;
	a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	System.out.print(a / 100);
	System.out.print("\n");
	k = a / 100;
	a = a - 100 * k;
	System.out.print(a / 50);
	System.out.print("\n");
	k = a / 50;
	a = a - 50 * k;
	System.out.print(a / 20);
	System.out.print("\n");
	k = a / 20;
	a = a - 20 * k;
	System.out.print(a / 10);
	System.out.print("\n");
	k = a / 10;
	a = a - 10 * k;
	System.out.print(a / 5);
	System.out.print("\n");
	System.out.print(a % 5);
	System.out.print("\n");
	}
}

