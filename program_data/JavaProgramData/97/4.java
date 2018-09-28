package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int money = 0;
		int amount = 0;
		int value = 0;
		int i;
		int[] unit = new int[max];

		unit[0] = 100;
		unit[1] = 50;
		unit[2] = 20;
		unit[3] = 10;
		unit[4] = 5;
		unit[5] = 1;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			money = Integer.parseInt(tempVar);
		}

		for (i = 0; i < max; i++)
		{
			value = money / unit[i];
			System.out.printf("%d\n", value);
			money = money - value * unit[i];
		}

	}
}

