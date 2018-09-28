package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int bill;
		int count = 0;
		bill = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (bill > 0)
		{
			System.out.print(bill / 100);
			System.out.print("\n");
			bill -= bill / 100 * 100;
			System.out.print(bill / 50);
			System.out.print("\n");
			bill -= bill / 50 * 50;
			System.out.print(bill / 20);
			System.out.print("\n");
			bill -= bill / 20 * 20;
			System.out.print(bill / 10);
			System.out.print("\n");
			bill -= bill / 10 * 10;
			System.out.print(bill / 5);
			System.out.print("\n");
			bill -= bill / 5 * 5;
			System.out.print(bill);
			System.out.print("\n");
			bill -= bill;
		}
		return 0;
	}
}

