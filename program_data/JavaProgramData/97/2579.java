package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int money;
		int[] change = new int[6];
		int i;
		int[] mon = {100, 50, 20, 10, 5, 1};
		int p;
		money = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < 6;i++)
		{
			p = money;
			change[i] = money / mon[i];
			money = p - change[i] * mon[i];
		}
		for (i = 0;i < 6;i++)
		{
			System.out.print(change[i]);
			System.out.print("\n");
		}
		return 0;
	}
}

