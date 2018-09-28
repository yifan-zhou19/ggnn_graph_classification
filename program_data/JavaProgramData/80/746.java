package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int y1;
	int m1;
	int d1;
	int y2;
	int m2;
	int d2;
	int i;
	int j;
	int c1;
	int c2;
	int year;
	int n;
	int run;
	int h;
	int sum;
	year = 365;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		y1 = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m1 = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		d1 = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead("\n");
	if (tempVar4 != null)
	{
		y2 = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		m2 = Integer.parseInt(tempVar5);
	}
	String tempVar6 = ConsoleInput.scanfRead();
	if (tempVar6 != null)
	{
		d2 = Integer.parseInt(tempVar6);
	}
	if (y2 > y1)
	{
	if ((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0))
	{
	days[2]++;
	year++;
	}
	c1 = d1;
	for (i = 1;i < m1;i++)
	{
	c1 += days[i];
	}
	c1 = year - c1;
	days[2] = 28;
	if ((y2 % 4 == 0 && y2 % 100 != 0) || (y2 % 400 == 0))
	{
	days[2]++;
	}
	c2 = d2;
	for (j = 1;j < m2;j++)
	{
	c2 += days[j];
	}
	n = y2 - y1 - 1;
	run = 0;
	for (h = y1 + 1;h <= y2 - 1;h++)
	{
	if ((h % 4 == 0 && h % 100 != 0) || (h % 400 == 0))
	{
	run++;
	}
	}
	n = n - run;
	sum = c1 + c2 + n * 365 + run * 366;
	}
	if (y2 == y1)
	{
	if ((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0))
	{
	days[2]++;

	}
	c1 = d1;
	for (i = 1;i < m1;i++)
	{
	c1 += days[i];
	}
	days[2] = 28;
	if ((y2 % 4 == 0 && y2 % 100 != 0) || (y2 % 400 == 0))
	{
	days[2]++;
	}
	c2 = d2;
	for (j = 1;j < m2;j++)
	{
	c2 += days[j];
	}
	sum = c2 - c1;
	}
	System.out.printf("%d",sum);

	return 0;
	}





}

