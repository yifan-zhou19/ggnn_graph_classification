package <missing>;

public class GlobalMembers
{
	public static int RY(int year)
	{
		int k;
		if (year % 4 == 0)
		{
			if (year % 100 == 0)
			{
			if (year % 400 == 0)
			{
				k = 1;
			}
			else
			{
				k = 0;
			}
			}
			else
			{
				k = 1;
			}
		}
		else
		{
			k = 0;
		}
		return (k);
	}
	public static int NO(int a,int b,int c)
	{
		int NO;
		int i;
		int j;
		NO = 0;
		for (i = 0;i < a;i++)
		{
			if (RY(i) == 1)
			{
				NO = NO + 366;
			}
			else
			{
				NO = NO + 365;
			}
		}
		for (j = 1 ;j < b;j++)
		{
			if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
			{
				NO = NO + 31;
			}
			else if (j == 4 || j == 6 || j == 9 || j == 11)
			{
				NO = NO + 30;
			}
			else if (RY(a) == 1)
			{
				NO = NO + 29;
			}
			else
			{
				NO = NO + 28;
			}
		}
		NO = NO + c;
		return (NO);
	}
	public static void Main()
	{
		int a1;
		int b1;
		int c1;
		int a2;
		int b2;
		int c2;
		int x;
		int y;
		int z;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			a2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			b2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			c2 = Integer.parseInt(tempVar6);
		}
		x = NO(a1, b1, c1);
		y = NO(a2, b2, c2);
		z = y - x;
		System.out.printf("%d",z);
	}

}

