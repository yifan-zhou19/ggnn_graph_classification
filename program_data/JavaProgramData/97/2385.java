package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int note100 = 0;
		int note50 = 0;
		int note20 = 0;
		int note10 = 0;
		int note5 = 0;
		int note1 = 0;
		int i;
		int j;
		int money;
		money = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (money >= 100)
		{
			money = money - 100;
			note100++;
		}
		while (money >= 50)
		{
			money = money - 50;
			note50++;
		}while (money >= 20)
		{
			money = money - 20;
			note20++;
		}while (money >= 10)
		{
			money = money - 10;
			note10++;
		}while (money >= 5)
		{
			money = money - 5;
			note5++;
		}while (money >= 1)
		{
			money = money - 1;
			note1++;
	}
		System.out.print(note100);
		System.out.print("\n");
		System.out.print(note50);
		System.out.print("\n");
		System.out.print(note20);
		System.out.print("\n");
		System.out.print(note10);
		System.out.print("\n");
		System.out.print(note5);
		System.out.print("\n");
		System.out.print(note1);
		return 0;
	}
}

