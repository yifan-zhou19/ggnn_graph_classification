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
		int i;
		int j;
		int k;
		while (true)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			d = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			e = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			f = Integer.parseInt(tempVar6);
		}
		if (a == 0 && b == 0 && c == 0 && d == 0 && e == 0 && f == 0)
		{
			break;
		}
		if (c == 0 && e == 0 && f == 0)
		{
			a = 23 - a;
			b = 60 - b;
			c = 60 - c;
		}
		else
		{
			a = d + 11 - a;
			b = e+59 - b;
			c = f + 60 - c;
		}
		k = a * 3600 + b * 60 + c;
		System.out.printf("%d\n",k);
		}
		return 0;
	}
}

