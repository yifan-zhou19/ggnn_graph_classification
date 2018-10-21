package <missing>;

public class GlobalMembers
{
	public static int ir(int n)
	{
		if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0))
		{
		  return 1;
		}
	return 0;
	}
	public static int djt(int y, int m, int d)
	{
		 int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		int s = 0;
		for (i = 1;i < m;i++)
		{
			if (i == 2 && ir(y) != 0)
			{
				s += 29;
			}
			else
			{
				s += days[i];
			}

		}
		s += d;
		return s;
	}

	public static int Main()
	{
		int s1 = 0;
		int s2 = 0;
		int s = 0;
		int i;
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct ymd
	//	{
	//		int y,m,d;
	//	}
	//	n1,n2,t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n1.y = tempVar;
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n1.m = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n1.d = tempVar3;
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			n2.y = tempVar4;
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			n2.m = tempVar5;
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			n2.d = tempVar6;
		}
		if ((n1.y > n2.y) || (n1.y == n2.y && n1.m > n2.m) || (n1.y == n2.y && n1.m == n2.m && n1.d > n2.d))
		{
			t = n1;
			n1 = n2;
			n2 = t;
		}
		s1 = djt(n1.y, n1.m, n1.d);
		s2 = djt(n2.y, n2.m, n2.d);
		if (n1.y == n2.y)
		{
		  s = s2 - s1;

		}
		else
		{
			if (ir(n1.y) != 0)
			{
			   s1 = 366 - s1;
			}
			else
			{
			   s1 = 365 - s1;
			}
			for (i = n1.y + 1;i < n2.y;i++)
			{
				if (ir(i) != 0)
				{
				  s += 366;

				}
				else
				{
				  s += 365;
				}

			}
			s += s1 + s2;
		}
		System.out.printf("%d",s);

	   return 0;
	}

}

