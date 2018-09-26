package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] deno = {100, 50, 20, 10, 5, 1};
		int money;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			money = Integer.parseInt(tempVar);
		}
		int[] count = new int[6];
		for (int i = 0;i < 6;++i)
		{
			count[i] = 0;
		}
		while (money != 0)
		{
			for (int i = 0;i < 6;++i)
			{
				if (money >= deno[i])
				{
					money -= deno[i];
					count[i]++;
					break;
				}
			}
		}
		for (int i = 0;i < 6;++i)
		{
			System.out.printf("%d\n",count[i]);
		}
		return 0;
	}
}

