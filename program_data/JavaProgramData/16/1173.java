package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int x;
	int k;
	int a;
	int b;
	int c;
	int d;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		x = Integer.parseInt(tempVar);
	}
	if (x > 999)
	{
	k = 4;
	}
	else
	{
	if (x > 99)
	{
	k = 3;
	}
	else
	{
	if (x > 9)
	{
	k = 2;
	}
	else
	{
	k = 1;
	}
	}
	}
	switch (k)
	{
	case 1:
		d = x;
	System.out.printf("%d\n",d);
	break;
	case 2:
		c = x / 10;
	d = x - 10 * c;
	System.out.printf("%d%d\n",d,c);
	break;
	case 3:
		b = x / 100;
	c = (x - 100 * b) / 10;
	d = x - 100 * b - 10 * c;
	System.out.printf("%d%d%d",d,c,b);
	break;
	case 4:
		a = x / 1000;
	b = (x - 1000 * a) / 100;
	c = (x - 1000 * a - 100 * b) / 10;
	d = x - 1000 * a - 100 * b - 10 * c;
	System.out.printf("%d%d%d%d\n",d,c,b,a);
	break;
	}

		return 0;
	}

}

