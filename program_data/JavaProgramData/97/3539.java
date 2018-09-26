package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int money;
		money = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] num = new int[6];

		while (money >= 100)
		{
			money = money - 100;
			num[0] = num[0] + 1;
		}
		while (money >= 50)
		{
			money = money - 50;
			num[1] = num[1] + 1;
		}
		while (money >= 20)
		{
			money = money - 20;
			num[2] = num[2] + 1;
		}
		while (money >= 10)
		{
			money = money - 10;
			num[3] = num[3] + 1;
		}
		while (money >= 5)
		{
			money = money - 5;
			num[4] = num[4] + 1;
		}
		while (money >= 1)
		{

			money = money - 1;
			num[5] = num[5] + 1;
		}
		int i;
		for (i = 0;i < 6;i++)
		{
			System.out.print(num[i]);
			System.out.print("\n");
		}








		return 0;
	}
}

