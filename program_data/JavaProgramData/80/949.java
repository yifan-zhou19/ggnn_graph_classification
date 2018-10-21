package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] m1 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int[] m2 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int a1;
	int a2;
	int a3;
	int b1;
	int b2;
	int b3;
	int s;
	int i;
	int j;
	int y1 = 0;
	int y2 = 0;
	int y;
	int x1 = 0;
	int x2 = 0;
	int x;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a1 = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		a2 = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		a3 = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead("\n");
	if (tempVar4 != null)
	{
		b1 = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead(" ");
	if (tempVar5 != null)
	{
		b2 = Integer.parseInt(tempVar5);
	}
	String tempVar6 = ConsoleInput.scanfRead(" ");
	if (tempVar6 != null)
	{
		b3 = Integer.parseInt(tempVar6);
	}
	for (i = 1700;i < a1;i++)
	{

									if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0)
									{
					 y1 += 366;
									}
				 else
				 {
					 y1 += 365;
				 }
	}
	if ((a1 % 4 == 0 && a1 % 100 != 0) || a1 % 400 == 0)
	{
		for (i = 0;i < a2;i++)
		{
	y2 = y2 + m2[i];
		}
	}
	else
	{
		for (i = 0;i < a2;i++)
		{
	y2 = y2 + m1[i];
		}
	};
	y = y1 + y2 + a3;
	for (i = 1700;i < b1;i++)
	{

									if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0)
									{
					 x1 += 366;
									}
				 else
				 {
					 x1 += 365;
				 }
	}
	if ((b1 % 4 == 0 && b1 % 100 != 0) || b1 % 400 == 0)
	{
		for (i = 0;i < b2;i++)
		{
	x2 = x2 + m2[i];
		}
	}
	else
	{
		for (i = 0;i < b2;i++)
		{
	x2 = x2 + m1[i];
		}
	};
	x = x1 + x2 + b3;
	s = x - y;
	System.out.printf("%d",s);
	return 0;
	}

}

