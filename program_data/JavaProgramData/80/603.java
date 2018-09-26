package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int y1;
	int y2;
	int m1;
	int m2;
	int d1;
	int d2;
	int i;
	int m = 0;
	int temp;
	int s1 = 0;
	int s2 = 0;
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
	if (y1 == y2)
	{
		for (i = 0;i < m1 - 1;i++)
		{
			s1 += month[i];
		}
		for (i = 0;i < m2 - 1;i++)
		{
			s2 += month[i];
		}
		m = s2 - s1 + d2 - d1;
		if (m < 0)
		{
			m = -m;
		}
		System.out.printf("%d\n",m);
	}
	else
	{
		if (y2 - y1 < 0)
		{
	temp = y1;
	y1 = y2;
	y2 = temp;
		}
	for (i = 0;i < m1 - 1;i++)
	{
	s1 += month[i];
	}
	for (i = 0;i < m2 - 1;i++)
	{
	s2 += month[i];
	}
	if (m1 > 2)
	{
		s2 += 365;
		y1++;
	}
	if (m2 > 2)
	{
		s2 -= 365;
		y2++;
	}
	for (i = y1;i < y2;i++)
	{
		if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
		{
			s2 += 366;
		}
		else
		{
			s2 += 365;
		}
	}
	System.out.printf("%d\n",s2 - s1 + d2 - d1);
	}
	return 0;
	}


}

