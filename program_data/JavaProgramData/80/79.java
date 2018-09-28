package <missing>;

public class GlobalMembers
{
	public static int sum(int y,int m,int d)
	{
	int i;
	int[] x = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int s = 0;
	for (i = 1;i < y;i++)
	{
		  if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
		  {
			  s += 366;
		  }
	  else
	  {
		  s += 365;
	  }
	}
	if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
	{
		x[2] = 29;
	}
	for (i = 0;i < m;i++)
	{
		s += x[i];
	}
	s += d;
	return s;
	}
	public static void Main()
	{
	int y1;
	int y2;
	int m1;
	int m2;
	int d1;
	int d2;
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
	System.out.printf("%ld",sum(y2, m2, d2) - sum(y1, m1, d1));
	}
}

