package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int di = new int(int x,int y,int z);
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int day1;
		int day2;
		int sum = 0;
		int i;
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
		for (i = a;i < d;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				sum += 366;
			}
			else
			{
				sum += 365;
			}
		}
		day1 = di(a, b, c);
		day2 = di(d, e, f);
		sum = sum + day2 - day1;
		System.out.printf("%d",sum);
		return 0;
	}
	public static int di(int x,int y,int z)
	{
		int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int wei;
		int j;
		if ((x % 4 == 0 && x % 100 != 0) || (x % 400 == 0))
		{
			day[2]++;
		}
		wei = z;
		for (j = 1;j < y;j++)
		{
			wei += day[j];
		}
		return wei;
	}
}

