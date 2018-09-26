package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int p;
		int x;
		int y;
		x = y = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					p = Integer.parseInt(tempVar2);
				}
			if (p > x)
			{
				y = x;
				x = p;
			}
			else
			{
				if (p > y)
				{
					y = p;
				}
			}
		}
		System.out.printf("%d\n%d",x,y);
	}

}

