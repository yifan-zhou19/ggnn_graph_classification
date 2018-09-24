package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int c;
	int i;
	int x = 0;
	int y = 0;
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
	if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
	{
		x = 1;
	}
	a %= 400;
	if (a == 0)
	{
		y = 5;
	}
	else
	{
	for (i = 1;i <= a - 1;i++)
	{
	if (i % 4 == 0 && i % 100 != 0)
	{
		y += 2;
	}
	else
	{
		y++;
	}
	}
	y %= 7;
	}
	for (i = 1;i <= b - 1;i++)
	{
	if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
	{
		y += 31;
	}
	else if (i == 4 || i == 6 || i == 9 || i == 11)
	{
		y += 30;
	}
	else if (x == 1)
	{
		y += 29;
	}
	else
	{
		y += 28;
	}
	}
	y = (y + c) % 7;
	switch (y)
	{
	case 1:
	{
	System.out.print("Mon.");
	break;
	}
	case 2:
	{
	System.out.print("Tue.");
	break;
	}
	case 3:
	{
	System.out.print("Wed.");
	break;
	}
	case 4:
	{
	System.out.print("Thu.");
	break;
	}
	case 5:
	{
	System.out.print("Fri.");
	break;
	}
	case 6:
	{
	System.out.print("Sat.");
	break;
	}
	case 0:
	{
	System.out.print("Sun.");
	break;
	}
	}
	return 0;
	}



}

