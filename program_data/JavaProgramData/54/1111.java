package <missing>;

public class GlobalMembers
{
	public static int pseudo_main()
	{
		int monkeys;
		int throw_away;
		int apples;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			monkeys = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			throw_away = Integer.parseInt(tempVar2);
		}
		int last = 0;
		while (true)
		{
			 last++;
			 apples = last * monkeys + throw_away;
			int divides = 1;
			for (i = 1; (i < monkeys) && divides != 0;++i)
			{
				divides = (apples % (monkeys - 1) == 0);
				apples = apples / (monkeys - 1) * monkeys + throw_away;
			}
			if (divides != 0)
			{
				break;
			}
		}
		System.out.printf("%d\n", apples);
	}
	public static int Main()
	{
			pseudo_main();
	}
}

