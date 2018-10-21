package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int money = 0;
		int a = 0;
		money = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = money / 100;
		System.out.print(a);
		System.out.print("\n");
		money = money % 100;
		a = money / 50;
		System.out.print(a);
		System.out.print("\n");
		money = money % 50;
		a = money / 20;
		System.out.print(a);
		System.out.print("\n");
		money = money % 20;
		a = money / 10;
		System.out.print(a);
		System.out.print("\n");
		money = money % 10;
		a = money / 5;
		System.out.print(a);
		System.out.print("\n");
		money = money % 5;
		System.out.print(money);
		return 0;
	}
}

