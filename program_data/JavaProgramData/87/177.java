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
		int s;
		int m;
		int n;
		int v;
		int i;
		for (i = 0;i < 100;i++)
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
		if (a == 0)
		{
			break;
		}
		d = d + 12;
		if (c <= f)
		{
			v = f - c;
		}
		if (c > f)
		{
			v = f + 60 - c;
			e = e-1;
		}
		if (b <= e)
		{
			n = e - b;
		}
		if (b > e)
		{
			n = e+60 - b;
			d = d - 1;
		}
		m = d - a;
		s = 3600 * m + 60 * n + v;
		System.out.printf("%d\n",s);
		}
		return 0;
	}



}

