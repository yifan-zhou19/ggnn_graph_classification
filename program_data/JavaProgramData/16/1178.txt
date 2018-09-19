package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int x;
	int a;
	int b;
	int c;
	int d;
	int e;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		x = Integer.parseInt(tempVar);
	}
	if (x > 9999)
	{
	 n = 5;
	}
	else
	{
	if (x > 999)
	{
	n = 4;
	}
	   else
	   {
		 if (x > 99)
		 {
		 n = 3;
		 }
		 else
		 {
		   if (x > 9)
		   {
		   n = 2;
		   }
		   else
		   {
		   n = 1;
		   }
		 }
	   }
	}
	switch (n)
	{
	case 5:
	a = x / 10000;
	b = (x - a * 10000) / 1000;
	c = (x - a * 10000 - b * 1000) / 100;
	d = (x - a * 10000 - b * 1000 - c * 100) / 10;
	e = (x - a * 10000 - b * 1000 - c * 100 - d * 10);
	System.out.printf("%d%d%d%d%d\n",e,d,c,b,a);
	break;
	case 4:
	b = x / 1000;
	c = (x - b * 1000) / 100;
	d = (x - b * 1000 - c * 100) / 10;
	e = (x - b * 1000 - c * 100 - d * 10);
	System.out.printf("%d%d%d%d\n",e,d,c,b);
	break;
	case 3:
	c = x / 100;
	d = (x - c * 100) / 10;
	e = (x - c * 100 - d * 10);
	System.out.printf("%d%d%d\n",e,d,c);
	break;
	case 2:
	d = x / 10;
	e = (x - d * 10);
	System.out.printf("%d%d\n",e,d);
	break;
	case 1:
	System.out.printf("%d\n",x);
	}
	return 0;




	}
}

