package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int money;
		int num100;
		int num50;
		int num20;
		int num10;
		int num5;
		int num1;
		money = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (money / 100 > 0)
		{
			num100 = money / 100;
			money = money - 100 * num100;
			System.out.print(num100);
			System.out.print("\n");
		}
		else
		{
			System.out.print("0");
			System.out.print("\n");
		}
		if (money / 50 > 0)
		{
			num50 = money / 50;
			money = money - 50 * num50;
			System.out.print(num50);
			System.out.print("\n");
		}
		else
		{
			System.out.print("0");
			System.out.print("\n");
		}

		if (money / 20 > 0)
		{
			num20 = money / 20;
			money = money - 20 * num20;
			System.out.print(num20);
			System.out.print("\n");
		}
		else
		{
			System.out.print("0");
			System.out.print("\n");
		}
		if (money / 10 > 0)
		{
			num10 = money / 10;
			money = money - 10 * num10;
			System.out.print(num10);
			System.out.print("\n");
		}
		else
		{
			System.out.print("0");
			System.out.print("\n");
		}
		if (money / 5 > 0)
		{
			num5 = money / 5;
			money = money - 5 * num5;
			System.out.print(num5);
			System.out.print("\n");
		}
		else
		{
			System.out.print("0");
			System.out.print("\n");
		}
		System.out.print(money);
		return 0;
	}
}

