package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int x;
		int y;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		x = 0;
		y = 0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		y = a;
		for (i = 2;i <= n;i++)
		{
			int ai;
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				ai = Integer.parseInt(tempVar3);
			}
			if (ai >= x)
			{
				x = ai;
			}
			else
			{
				if (ai > y)
				{
					y = ai;
				}
			}
		}
		System.out.printf("%d\n",x);
		System.out.printf("%d\n",y);
	}


}

