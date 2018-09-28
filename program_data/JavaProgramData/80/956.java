package <missing>;

public class GlobalMembers
{
	public static int[] mon = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};

	public static int days(int a,int b,int c)
	{
		int result = 0;
		int i;
		if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))
		{
			mon[2] = 29;
		}
		else
		{
			mon[2] = 28;
		}
		for (i = 1;i < b;i++)
		{
			result += mon[i];
		}
		result += c;
		return (result);
	}

	public static int Main()
	{
		int a1;
		int b1;
		int c1;
		int a2;
		int b2;
		int c2;
		int sum = 0;
		int temp;
		int x;
		int i;
		int j;
		int year;

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
		if (a1 == a2)
		{
			x = days(a1, b2, c2) - days(a2, b1, c1);
			if (x < 0)
			{
				x = -x;
			}
		}
		else
		{
			if (a2 < a1)
			{
				temp = a1;
				a1 = a2;
				a2 = temp;
				temp = b1;
				b1 = b2;
				b2 = temp;
				temp = c1;
				c1 = c2;
				c2 = temp;
			}
			for (year = a1;year < a2;year++)
			{
				  if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
				  {
					sum += 366;
				  }
				else
				{
					sum += 365;
				}
			}
			x = sum + days(a2, b2, c2) - days(a1, b1, c1);
		}
		System.out.printf("%d",x);
		return;
	}
}

