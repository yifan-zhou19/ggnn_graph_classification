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
		int l = 0;
		for (i = 0;i < 1000;i++)
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
			if (a == 0 && b == 0 && c == 0 && d == 0 && e == 0 && e == 0 && f == 0)
			{
				break;
			}
			else
			{
				d = d + 12;
				if (f < c)
				{
					l = f + 60 - c;
					e = e-1;
				}
				else if (f >= c)
				{
					l = f - c;
				}
				if (e < b)
				{
					l += (e+60 - b) * 60;
					d = d - 1;
				}
				else if (e >= b)
				{
					l += (e - b) * 60;
				}
					l += (d - a) * 3600;
					System.out.printf("%d\n",l);
			}
		}
		return 0;
	}

}

