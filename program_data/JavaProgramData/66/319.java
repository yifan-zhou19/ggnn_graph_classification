package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int c;
	int d;
	int e;
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
	if (((a % 4 == 0) && (a % 100 != 0)) || (a % 400 == 0))
	{
		a = a - 1;
		a = a % 2800;
		d = a / 400 * 146097 + (a % 400) / 100 * 36524 + (a % 100) / 4 * 1461 + (a % 4) * 365 + c;
		for (int i = 1;i <= b;i++)
		{
			if ((i == 2) || (i == 6) || (i == 8) || (i == 9) || (i == 11) || (i == 4))
			{
				d += 31;
			}
	else if (i == 3)
	{
		d += 29;
	}
	else if (i == 1)
	{
		d = d;
	}
	else
	{
		d += 30;
	}
		}
	}
	else
	{
		a = a - 1;
		a = a % 2800;
		d = a / 400 * 146097 + (a % 400) / 100 * 36524 + (a % 100) / 4 * 1461 + (a % 4) * 365 + c;
		for (int i = 1;i <= b;i++)
		{
		if ((i == 2) || (i == 4) || (i == 8) || (i == 9) || (i == 11) || (i == 6))
		{
			d += 31;
		}
	else if (i == 3)
	{
		d += 28;
	}
	else if (i == 1)
	{
		d = d;
	}
	else
	{
		d += 30;
	}
		}
	}
	e = d % 7;
	if (e == 1)
	{
		System.out.print("Mon.");
	}
	else if (e == 2)
	{
		System.out.print("Tue.");
	}
	else if (e == 3)
	{
		System.out.print("Wed.");
	}
	else if (e == 4)
	{
		System.out.print("Thu.");
	}
	else if (e == 5)
	{
		System.out.print("Fri.");
	}
	else if (e == 6)
	{
		System.out.print("Sat.");
	}
	else if (e == 0)
	{
		System.out.print("Sun.");
	}



	return 0;
	}


}

