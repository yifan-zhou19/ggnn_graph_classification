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
		int h;
		int m;
		int s;
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
			d += 12;
			if (e > b)
			{
				if (f >= c)
				{
					h = d - a;
					m = e - b;
					s = f - c;
				}
				else
				{
					h = d - a;
					m = e - b - 1;
					s = f + 60 - c;
				}
			}
			else if (e == b)
			{
				if (f >= c)
				{
					h = d - a;
					m = e - b;
					s = f - c;
				}
				else
				{
					h = d - a - 1;
					m = 59;
					s = f + 60 - c;
				}
			}
			else if (e < b)
			{
				if (f >= c)
				{
					h = d - a - 1;
					m = e - b + 60;
					s = f - c;
				}
				else
				{
					h = d - a - 1;
					m = e - b + 60 - 1;
					s = f + 60 - c;
				}

			}
			sum = h * 3600 + m * 60 + s;
			System.out.printf("%d\n",sum);
		}
		return 0;
	}
}

