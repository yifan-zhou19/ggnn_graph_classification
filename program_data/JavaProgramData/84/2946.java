package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int first = -1;
		int second = -1;
		int i;
		int n;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			if (i == 2)
			{
				if (a > first)
				{
					second = first;
					first = a;
				}
				else
				{
					second = a;
				}
			}
			if (a > first)
			{
				second = first;
				first = a;
			}
			else
			{
				continue;
			}
		}
		System.out.printf("%d\n%d",first,second);
		return 0;
	}


}

