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
		int y;
		while (true)
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
			d = d + 12;
			if (e >= b != 0 && f >= c)
			{
				y = (d - a) * 3600 + (e - b) * 60 + f - c;
			}
			else if (e >= b != 0 && f <= c)
			{
				y = (d - a) * 3600 + (e - b - 1) * 60 + 60 + f - c;
			}
			else if (e <= b != 0 && f >= c)
			{
				y = (d - a - 1) * 3600 + 3600 + (e - b) * 60 + f - c;
			}
			else if (e <= b != 0 && f <= c)
			{
				y = (d - a - 1) * 3600 + 3600 + (e - b - 1) * 60 + 60 + f - c;
			}
			System.out.printf("%d\n",y);
		}
		return 0;

	}
}

