package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int a;
		int b;
		int x;
		int y;
		int l;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			y = Integer.parseInt(tempVar3);
		}
		if (x > y)
		{
			a = x;
			b = y;
		}
		else
		{
			a = y;
			b = x;
		}
		while (i <= n - 3)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				l = Integer.parseInt(tempVar4);
			}
			if (l > a)
			{
				b = a;
				a = l;
			}
			else
			{
				if (l > b)
				{
					b = l;
				}
			}
			i++;
		}
		System.out.printf("%d\n%d",a,b);
			return 0;
	}
}

