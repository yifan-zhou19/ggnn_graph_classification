package <missing>;

public class GlobalMembers
{
	public static int p(int a,int b,int c)
	{
		int i;
		int day = 0;
		for (i = 1;i < a;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				day += 366;
			}
			else
			{
				day += 365;
			}
		}
		for (i = 1;i < b;i++)
		{
			switch (i)
			{
			case 1:
				day += 31;
				break;
			case 2:
				if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))
				{
					day += 29;
				}
				else
				{
					day += 28;
				}
				break;
			case 3:
				day += 31;
				break;
			case 4:
				day += 30;
				break;
			case 5:
				day += 31;
				break;
			case 6:
				day += 30;
				break;
			case 7:
				day += 31;
				break;
			case 8:
				day += 31;
				break;
			case 9:
				day += 30;
				break;
			case 10:
				day += 31;
				break;
			case 11:
				day += 30;
				break;
			case 12:
				day += 31;
				break;
			}
		}
		day += c;
		return (day);
	}
	public static void Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int x;
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
		String tempVar4 = ConsoleInput.scanfRead();
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
		x = p(d, e, f) - p(a, b, c);
		System.out.printf("%d",x);
	}


}

