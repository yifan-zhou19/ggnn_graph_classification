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
		int f;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(n / 100);
		System.out.print("\n");
		n = n % 100;
		System.out.print(n / 50);
		System.out.print("\n");
		n = n % 50;
		System.out.print(n / 20);
		System.out.print("\n");
		n = n % 20;
		System.out.print(n / 10);
		System.out.print("\n");
		n = n % 10;
		System.out.print(n / 5);
		System.out.print("\n");
		n = n % 5;
		System.out.print(n);
		System.out.print("\n");
		return 0;
	}
}

