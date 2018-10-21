package <missing>;

public class GlobalMembers
{
	public static int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int[] leapday = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int leapyear(int n)
	{
		return ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0));
	}
	public static int count(int a,int b,int c)
	{
		int leapyear = int n;
		int m = 0;
		int i;
		if (leapyear(a) == 0)
		{
			for (i = 0;i < b;i++)
			{
				m = m + day[i];
			}
		}
		else
		{
			for (i = 0;i < b;i++)
			{
				m = m + leapday[i];
			}
		}
		m = m + c;
		return m;
	}
	public static int Main()
	{
		int j;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int sum = 0;
		int leapyear = int n;
		int count = new int(int a,int b,int c);
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
		String tempVar4 = ConsoleInput.scanfRead("\n");
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
		if (a < d)
		{
			for (j = a;j < d;j++)
			{
				if (leapyear(j) == 0)
				{
					sum = sum + 365;
				}
				else if (leapyear(j) == 1)
				{
					sum = sum + 366;
				}
			}
			sum = sum + count(d, e, f) - count(a, b, c);
		}
		else if (a == d)
		{
			sum = count(d, e, f) - count(a, b, c);
		}
		System.out.printf("%d",sum);
		return 0;
	}

}

