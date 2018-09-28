package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int money;
		int i;
		int[] num = new int[6];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			money = Integer.parseInt(tempVar);
		}
		num[0] = money / 100;
		num[1] = (money - 100 * num[0]) / 50;
		num[2] = (money - 100 * num[0] - 50 * num[1]) / 20;
		num[3] = (money - 100 * num[0] - 50 * num[1] - 20 * num[2]) / 10;
		num[4] = (money - 100 * num[0] - 50 * num[1] - 20 * num[2] - 10 * num[3]) / 5;
		num[5] = money - 100 * num[0] - 50 * num[1] - 20 * num[2] - 10 * num[3] - 5 * num[4];
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",num[i]);
		}
		return 0;
	}
}

