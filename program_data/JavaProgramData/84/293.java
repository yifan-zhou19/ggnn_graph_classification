package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int a;
		int b;
		int c;
		int d;
		int i;
		int r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		b = a;
		c = a;
		for (i = 2;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				d = Integer.parseInt(tempVar3);
			}
			if (d > b)
			{
				r = b;
				b = d;
				if (r > c)
				{
					c = r;
				}
			}
			else if (d > c)
			{
				c = d;
			}
		}
		System.out.printf("%d\n%d\n",b,c);
	}



}

