package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int input;
		int hundred;
		int fifty;
		int twenty;
		int ten;
		int five;
		input = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		hundred = (input - input % 100) / 100;
		input = input - hundred * 100;
		fifty = (input - input % 50) / 50;
		input = input - fifty * 50;
		twenty = (input - input % 20) / 20;
		input = input - twenty * 20;
		ten = (input - input % 10) / 10;
		input = input - ten * 10;
		five = (input - input % 5) / 5;
		input = input - five * 5;
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
		System.out.print(input);
		System.out.print("\n");
		return 0;
	}
}

