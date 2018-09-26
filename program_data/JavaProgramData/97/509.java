package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int money;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		money = n;

		for (i = 0;money > 0;i++)
		{
			money -= 100;
		}
		if (money < 0)
		{
			money += 100;
			i--;
		}
		System.out.printf("%d\n",i);

		for (i = 0;money > 0;i++)
		{
			money -= 50;
		}
		if (money < 0)
		{
			money += 50;
			i--;
		}
		System.out.printf("%d\n",i);

		for (i = 0;money > 0;i++)
		{
			money -= 20;
		}
		if (money < 0)
		{
			money += 20;
			i--;
		}
		System.out.printf("%d\n",i);

		for (i = 0;money > 0;i++)
		{
			money -= 10;
		}
		if (money < 0)
		{
			money += 10;
			i--;
		}
		System.out.printf("%d\n",i);

		for (i = 0;money > 0;i++)
		{
			money -= 5;
		}
		if (money < 0)
		{
			money += 5;
			i--;
		}
		System.out.printf("%d\n",i);
		System.out.printf("%d\n",money);
		return 0;
	}
}

