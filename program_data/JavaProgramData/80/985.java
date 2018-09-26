package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y1;
		int m1;
		int d1;
		int y2;
		int m2;
		int d2;
		int ds1;
		int ds2;
		int sum = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			y2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			m2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			d2 = Integer.parseInt(tempVar6);
		}
		for (i = y1;i < y2;i++)
		{
			if ((i % 100 != 0 && i % 4 == 0) || (i % 400 == 0))
			{
				sum = sum + 366;
			}
			else
			{
				sum = sum + 365;
			}
		}
		int days = new int(int x,int y, int z);
		ds1 = days(y1, m1, d1);
		ds2 = days(y2, m2, d2);
		sum = sum + ds2 - ds1;
		System.out.printf("%d",sum);
		return 0;
	}
	public static int days(int x,int y,int z)
	{
		int sum = 0;
		int[] Months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			if ((x % 100 != 0 && x % 4 == 0) || (x % 400 == 0))
			{
				Months[1]++;
			}
			y--;
			while (y-- != 0)
			{
				sum = sum + Months[y];
			}
			sum = sum + z;
			return sum;
	}
}

