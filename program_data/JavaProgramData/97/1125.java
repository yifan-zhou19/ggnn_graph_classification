package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int hundred;
		int fifty;
		int twenty;
		int ten;
		int five;
		int one;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		hundred = n / 100;
		fifty = n % 100 / 50;
		twenty = n % 50 / 20;
		ten = n % 50 % 20 / 10;
		five = n % 10 / 5;
		one = n % 5;
		System.out.print(hundred);
		System.out.print("\n");
		System.out.print(fifty);
		System.out.print("\n");
		System.out.print(twenty);
		System.out.print("\n");
		System.out.print(ten);
		System.out.print("\n");
		System.out.print(five);
		System.out.print("\n");
		System.out.print(one);
		return 0;
	}

}

