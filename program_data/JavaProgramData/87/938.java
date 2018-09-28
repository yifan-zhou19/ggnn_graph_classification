package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int sum;
		for (;;)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			d = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			e = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			f = Integer.parseInt(tempVar6);
		}
		if (a == 0)
		{
			break;
		}
		else
		{
		d = 12 + d;
		sum = 3600 * (d - a - 1);
		a = d - 1;
		for (;;c = c + 1,sum = sum + 1)
		{
			if (c == 60)
			{
				c = 0;
				b = b + 1;
			}
			if (b == 60)
			{
				a = a + 1;
				b = 0;
			}
			if (a == d && b == e && c == f)
			{
				break;
			}
		}
	System.out.printf("%d\n",sum);
		}
		}
	return 0;
	}


}

