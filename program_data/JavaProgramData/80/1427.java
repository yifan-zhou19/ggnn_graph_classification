package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] b = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int[] x = new int[2];
	int[] y = new int[2];
	int[] z = new int[2];
	int s = 0;
	int m;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		x[0] = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		y[0] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		z[0] = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		x[1] = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead(" ");
	if (tempVar5 != null)
	{
		y[1] = Integer.parseInt(tempVar5);
	}
	String tempVar6 = ConsoleInput.scanfRead(" ");
	if (tempVar6 != null)
	{
		z[1] = Integer.parseInt(tempVar6);
	}
	m = x[0];
	if (x[0] < x[1])
	{
		for (;x[0] < x[1];x[0]++)
		{
		if (x[0] % 4 == 0 && x[0] % 100 != 0 || x[0] % 400 == 0)
		{
	s = s + 366;
		}
	else
	{
		s = s + 365;
	}
		}
	}
	if (m % 4 == 0 && m % 100 != 0 || m % 400 == 0)
	{
		for (i = 0;i < y[0] - 1;i++)
		{
	s = s - b[i];
		}
	}
	else
	{
			for (i = 0;i < y[0] - 1;i++)
			{
		s = s - a[i];
			}
	}
		s = s - z[0];
		if (x[1] % 4 == 0 && x[1] % 100 != 0 || x[1] % 400 == 0)
		{
			for (i = 0;i < y[1] - 1;i++)
			{
		s = s + b[i];
			}
		}
		else
		{
				for (i = 0;i < y[1] - 1;i++)
				{
			s = s + a[i];
				}
		}
		s = s + z[1];
		System.out.printf("%d",s);
	}


}

