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
		int x = 0;
		int i;
		for (i = 0;i < 100;i++)
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
			 x = 0;
		if (a == 0 && b == 0 && c == 0 && d == 0 && e == 0 && f == 0)
		{
			break;
		}
		else
		{
		if (f >= c)
		{
			x += f - c;
		}
		else if (f < c)
		{
			x += 60 + f - c;
			e--;
		}
		if (e >= b)
		{
			x += 60 * (e - b);
		}
		else
		{
			x += 60 * (60 + e - b);
			d--;
		}
		d = d + 12;
			x += 3600 * (d - a);

		System.out.printf("%d\n",x);
		}
		}
		return 0;
	}


}

