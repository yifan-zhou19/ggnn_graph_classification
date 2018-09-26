package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		int a;
		int b;
		int c;
		int max;
		int xmax;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		while (k >= 3)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c = Integer.parseInt(tempVar4);
			}
			if (a >= c)
			{
				if (c >= b)
				{
					max = a;
					xmax = c;
				}
				else if (a >= b)
				{
					max = a;
					xmax = b;
				}
				else
				{
					max = b;
					xmax = a;
				}
			}
			else
			{
				if (a >= b)
				{
					max = c;
					xmax = a;
				}
				else if (c >= b)
				{
					max = c;
					xmax = b;
				}
					 else
					 {
						 max = b;
						 xmax = c;
					 }
			}
			a = max;
			b = xmax;
			k--;
		}
		System.out.printf("%d\n%d\n",max,xmax);
	}
}

