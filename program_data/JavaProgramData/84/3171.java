package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int x;
		int first;
		int second;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			if (i == 0)
			{
				first = x;
				second = x;
			}
			else if (i == 1)
			{
				if (x > first)
				{
					second = first;
					first = x;
				}
				else if (x = first)
				{
					second = x;
					first = x;
				}
			}
			else
			{
				if (x > first)
				{
					second = first;
					first = x;
				}
				else if (x > second)
				{
					second = x;
				}
			}
		}
		System.out.printf("%d\n",first);
		System.out.printf("%d\n",second);
		return 0;
	}

}

