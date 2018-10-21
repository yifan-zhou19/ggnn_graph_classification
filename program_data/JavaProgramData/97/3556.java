package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int money;
		int yuan100;
		int yuan50;
		int yuan20;
		int yuan10;
		int yuan5;
		int yuan1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			money = Integer.parseInt(tempVar);
		}
		if (money < 0)
		{
			System.out.print("Error!\n");
		}
		else
		{
			yuan100 = (money - (money % 100)) / 100;
			money = money - yuan100 * 100;
			yuan50 = (money - (money % 50)) / 50;
			money = money - yuan50 * 50;
			yuan20 = (money - (money % 20)) / 20;
			money = money - yuan20 * 20;
			yuan10 = (money - (money % 10)) / 10;
			money = money - yuan10 * 10;
			yuan5 = (money - (money % 5)) / 5;
			money = money - yuan5 * 5;
			yuan1 = money;

				System.out.printf("%d\n",yuan100);

				System.out.printf("%d\n",yuan50);

				System.out.printf("%d\n",yuan20);

				System.out.printf("%d\n",yuan10);

				System.out.printf("%d\n",yuan5);
			System.out.printf("%d\n",yuan1);
		}
		return 0;
	}

}

