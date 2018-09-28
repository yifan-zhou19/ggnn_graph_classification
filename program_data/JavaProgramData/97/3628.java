package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int left = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(n / 100);
		System.out.print("\n");
		left = n % 100;
		System.out.print(left / 50);
		System.out.print("\n");
		left = left % 50;
		System.out.print(left / 20);
		System.out.print("\n");
		left = left % 20;
		System.out.print(left / 10);
		System.out.print("\n");
		left = left % 10;
		System.out.print(left / 5);
		System.out.print("\n");
		left = left % 5;
		System.out.printf("%d", "\n");




		return 0;
	}
}

