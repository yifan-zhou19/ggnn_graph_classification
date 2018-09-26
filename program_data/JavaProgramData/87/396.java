package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int sum;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int h = 0;
		int m = 0;
		int s;
		char y;
		for (i = 0;;i++)
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
			if (a != 0)
			{
				if (e >= b != 0 && f >= c)
				{
					h = d + 12 - a;
					m = e - b;
					s = f - c;
				}
				if (e < b && f >= c)
				{
					h = d + 11 - a;
					m = e - b + 60;
					s = f - c;
				}
				if (e < b && f < c)
				{
					h = d + 11 - a;
					m = e - b + 59;
					s = f - c + 60;
				}
				if (e >= b != 0 && f < c)
				{
					h = d + 12 - a;
					m = e - b - 1;
					s = f - c + 60;
				}
			}
			if (a == 0)
			{
				break;
			}
			sum = h * 3600 + m * 60 + s;
			System.out.printf("%d\n",sum);
		}


		return 0;
	}
}

