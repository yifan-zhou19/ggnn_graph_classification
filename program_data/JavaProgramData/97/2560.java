package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a1;
		int a2;
		int a3;
		int a4;
		int a5;
		int a6;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a1 = n / 100;
		n = n % 100;
		a2 = n / 50;
		n = n % 50;
		a3 = n / 20;
		n = n % 20;
		a4 = n / 10;
		n = n % 10;
		a5 = n / 5;
		n = n % 5;
		a6 = n;
		System.out.print(a1);
		System.out.print("\n");
		System.out.print(a2);
		System.out.print("\n");
		System.out.print(a3);
		System.out.print("\n");
		System.out.print(a4);
		System.out.print("\n");
		System.out.print(a5);
		System.out.print("\n");
		System.out.print(a6);
		System.out.print("\n");
		return 0;
	}
}

