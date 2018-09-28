package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
	for (i = 1;i <= 4;i++)
	{
		int yuan;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			yuan = Integer.parseInt(tempVar);
		}
	int a;
	int b;
	int c;
	int d;
	int e;
	a = yuan % 10;
	b = ((yuan - a) % 100) / 10;
	c = ((yuan - 10 * b - a) % 1000) / 100;
	d = ((yuan - 100 * c - 10 * b - a) % 10000) / 1000;
	e = (yuan - 1000 * d - 100 * c - 10 * b - a) / 10000;
	int m;
	if (e == 0 && d == 0 && c == 0 && b == 0)
	{
		m = a;
	}
	else if (e == 0 && d == 0 && c == 0)
	{
		m = a * 10 + b;
	}
		 else if (e == 0 && d == 0)
		 {
			 m = a * 100 + b * 10 + c;
		 }
			  else if (e == 0)
			  {
				  m = a * 1000 + b * 100 + c * 10 + d;
			  }
				   else
				   {
					   m = a * 10000 + b * 1000 + c * 100 + d * 10 + e;
				   }
	System.out.printf("%d\n",m);
	}
	}
}

