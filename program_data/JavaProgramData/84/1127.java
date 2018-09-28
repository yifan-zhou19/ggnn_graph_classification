package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int c;
		int n;
		int i;
		float d;
		float e;
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		for (i = 1;i <= (n - 2);i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c = Integer.parseInt(tempVar4);
			}
			d = (float)(a + b) / 2;
			e = (float)(a - b) / 2;
			if (c >= a)
			{
				if (c >= b)
				{
					a = c;
				b = d - e;
				c = d + e;
				}
			else
			{
				a = d - e;
				b = d + e;
				c = c;
			}
			}
				else
				{
					if (a <= b)
					{
						a = d - e;
					b = d + e;
					c = c;
					}
				else
				{
					a = d + e;
					b = d - e;
					c = c;
				}
				}
			if (b >= c)
			{
				b = b;
			}
			else
			{
				b = c;
			}
		}
		System.out.printf("%d\n%d",a,b);
	}

}

