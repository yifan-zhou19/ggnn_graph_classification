package <missing>;

public class GlobalMembers
{
	/*
	*?????
	*??
	*2011?11?06?
	*?????
	*/
	public static int Main()
	{
		int[] num = new int[6]; //num[6]????????
		int money;
		money = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		num[0] = (money - money % 100) / 100;
		num[1] = (money - 100 * num[0]) / 50;
		num[2] = (money - 100 * num[0] - 50 * num[1]) / 20;
		num[3] = (money - 100 * num[0] - 50 * num[1] - 20 * num[2]) / 10;
		num[4] = (money - 100 * num[0] - 50 * num[1] - 20 * num[2] - 10 * num[3]) / 5;
		num[5] = (money - 100 * num[0] - 50 * num[1] - 20 * num[2] - 10 * num[3] - 5 * num[4]);
		for (int i = 0;i < 6;i++)
		{
			System.out.print(num[i]);
			System.out.print("\n");
		}
		return 0;
	}

}

