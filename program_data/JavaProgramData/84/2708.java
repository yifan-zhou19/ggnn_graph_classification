package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int first;
		int second;
		for (i = 1;i <= n;i++)
		{
			if (i < n)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					x = Integer.parseInt(tempVar2);
				}
			}
			else
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x = Integer.parseInt(tempVar3);
				}
			}

			if (i == 1)
			{
				first = x;
			}
			else if (i == 2)
			{
				if (x > first)
				{
					second = first;
					first = x;
				}
				else
				{
					second = x;
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
		System.out.printf("%d\n", first);
		System.out.printf("%d\n", second);
	}

}

