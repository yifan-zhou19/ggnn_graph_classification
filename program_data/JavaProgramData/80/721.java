package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int s;
		int t;
		int i;
		int y;
		int m;
		int d;
		int Y;
		int M;
		int D;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			Y = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			M = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			D = Integer.parseInt(tempVar6);
		}
		s = 0;
		t = 0;
		for (i = 1;i <= y - 1;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				s = s + 366;
			}
			else
			{
				s = s + 365;
			}
		}
		for (i = 1;i <= m - 1;i++)
		{
			switch (i)
			{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				s = s + 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				s = s + 30;
				break;
			case 2:
			{
				if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
				{
					s = s + 29;
				}
				else
				{
					s = s + 28;
				}
			}
			}
		}
		s = s + d;
		for (i = 1;i <= Y - 1;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				t = t + 366;
			}
			else
			{
				t = t + 365;
			}
		}
		for (i = 1;i <= M - 1;i++)
		{
			switch (i)
			{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				t = t + 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				t = t + 30;
				break;
			case 2:
			{
				if ((Y % 4 == 0 && Y % 100 != 0) || (Y % 400 == 0))
				{
					t = t + 29;
				}
				else
				{
					t = t + 28;
				}
			}
			}
		}
		t = t + D;
		n = t - s;
		System.out.printf("%d",n);
	}
}

