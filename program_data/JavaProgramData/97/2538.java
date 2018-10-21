package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int money;
		int i;
		int[] num = {0, 0, 0, 0, 0, 0};
		int[] mon = {100, 50, 20, 10, 5, 1};

		money = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < 6; i++)
		{
			num[i] = money / mon[i];
			money = money % mon[i];

		}
		for (i = 0; i < 6; i++)
		{
			  System.out.print(num [i]);
			  System.out.print("\n");
		}
		return 0;
	}
}

