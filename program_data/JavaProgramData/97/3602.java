package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int x1;
		int x2;
		int x3;
		int x4;
		int x5;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if ((a < 1000) && (a >= 100))
		{
				b = a / 100;
		c = (a - 100 * b) / 10;
		if (c < 5)
		{
			x1 = 0;
		if (c % 2 == 0)
		{
		  x2 = c / 2;
	   x3 = 0;
		}
	   if (c % 2 == 1)
	   {
		  x2 = (c - 1) / 2;
	   x3 = 1;
	   }
		}
		else
		{
		if (c >= 5)
		{
		x1 = 1;
		if (c % 2 == 1)
		{
		   x2 = (c - 5) / 2;
	   x3 = 0;
		}
	   if (c % 2 == 0)
	   {
		  x2 = (c - 6) / 2;
	   x3 = 1;
	   }
		}
		}
		d = a % 10;
		if (d < 5)
		{
			x4 = 0;
		x5 = d;
		}
		if (d >= 5)
		{
			x4 = 1;
		x5 = d - 5;
		}
		}
		if ((a >= 10) && (a < 99))
		{
			b = 0;
		if (a < 50)
		{
			x1 = 0;
		if ((a / 10) % 2 == 0)
		{
			x2 = a / 20;
		x3 = 0;
		}
		if ((a / 10) % 2 == 1)
		{
		   x2 = (a / 10) / 2;
		x3 = 1;
		}
		d = a % 10;
		if (d < 5)
		{
			x4 = 0;
		x5 = d;
		}
		if (d >= 5)
		{
			x4 = 1;
		x5 = d - 5;
		}
		}
		if (a >= 50)
		{
			x1 = 1;
		a = a - 50;
		if ((a / 10) % 2 == 0)
		{
			x2 = a / 20;
		x3 = 0;
		}
		if ((a / 10) % 2 == 1)
		{
		   x2 = (a / 10) / 2;
		x3 = 1;
		}
		d = a % 10;
		if (d < 5)
		{
			x4 = 0;
		x5 = d;
		}
		if (d >= 5)
		{
			x4 = 1;
		x5 = d - 5;
		}
		}
		}
		if (a < 10)
		{
			b = 0;
		x1 = 0;
		x2 = 0;
		x3 = 0;
		if (a < 5)
		{
			x4 = 0;
		x5 = a;
		}
		if (a >= 5)
		{
			x4 = 1;
		x5 = a - 5;
		}
		}
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",b,x1,x2,x3,x4,x5);
		return 0;





	}




}

