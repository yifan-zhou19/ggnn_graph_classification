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
		int sum = 0;
		int s;
		int m;
		int h;
		int i;
		for (i = 1;i > 0;i++)
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
			else
			{
			d = d + 12;
			if (f >= c)
			{
				s = f - c;
			}
			else
			{
				s = 60 + f - c;
				e = e-1;
			}
			if (e >= b)
			{
				m = e - b;
			}
			else
			{
				m = 60 + e - b;
				d = d - 1;
			}
			h = d - a;
			sum = 3600 * h + (60 * m) + s;
			System.out.printf("%d\n",sum);
			}
		}
		return 0;
	}
}

