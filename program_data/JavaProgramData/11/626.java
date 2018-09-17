package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int x;
	int y;
	int d;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		x = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		y = Integer.parseInt(tempVar3);
	}
	d = 0;
	if ((x > 2) && (n % 400 == 0))
	{
	d = 1;
	}
	if ((x > 2) && (n % 100 != 0) && (n % 4 == 0))
	{
	 d = 1;
	}
	d = d + y;
	x--;
	switch (x)
	{
	case 11:
		d = d + 30;
	case 10:
		d = d + 31;
	case 9:
		d = d + 30;
	case 8:
		d = d + 31;
	case 7:
		d = d + 31;
	case 6:
		d = d + 30;
	case 5:
		d = d + 31;
	case 4:
		d = d + 30;
	case 3:
		d = d + 31;
	case 2:
		d = d + 28;
	case 1:
		d = d + 31;
	}
	System.out.printf("%d\n",d);
	return 0;
	}

}

