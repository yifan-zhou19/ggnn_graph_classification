package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N = int y;
		int Z = int y;
		int m;
		int n;
		int y;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		y = m;
		a = N(y);
		b = Z(y);

		while ((a != y || b != 1) && y <= n)
		{
			y = y + 1;
			a = N(y);
			b = Z(y);
		}
		if (y == n + 1)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d",y);
		}
		  m = y;
		for (y = m + 1;y <= n;y++)
		{
			a = N(y);
			b = Z(y);
			if (a == y && b == 1)
			{
				System.out.printf(",%d",y);
			}
		}

		System.out.print("\n");
	}


	public static int Z(int y)
	{
	   int i;
	   int b;
	   for (i = 2;i <= y;i++)
	   {
			b = y % i;
			if (b == 0)
			{
				break;
			}
	   }
		if (i == y)
		{
			b = 1;
		}
			 else
			 {
				 b = 0;
			 }
	  return (b);
	}

	public static int N(int y)
	{
	 int f = 0;
	 int a = 0;
	 int b = 0;
	 int c = 0;
	 int d = 0;
	 int e;
	 int n = 1;
	 int x;
	 e = y % 10;
	 y = (y - e) / 10;
	 if (y > 0)
	 {
		 d = y % 10;
		 y = (y - d) / 10;
	 }
	 if (y > 0)
	 {
		 c = y % 10;
		 y = (y - c) / 10;
	 }
	 if (y > 0)
	 {
		 b = y % 10;
		 y = (y - b) / 10;
	 }
	 if (y > 0)
	 {
		 a = y % 10;
		 y = (y - a) / 10;
	 }
	 if (y > 0)
	 {
		 f = y % 10;
	 }


	 if (f != 0)
	 {
		 x = 100000 * e+10000 * d + 1000 * c + 100 * b + 10 * a + f;
	 }
	 else
	 {
	   if (a != 0)
	   {
		   x = 10000 * e+1000 * d + 100 * c + 10 * b + a;
	   }
	   else
	   {
		  if (b != 0)
		  {
			  x = 1000 * e+100 * d + 10 * c + b;
		  }
		  else
		  {
			 if (c != 0)
			 {
				 x = 100 * e+10 * d + c;
			 }
			 else
			 {
				if (d != 0)
				{
					x = 10 * e + d;
				}
				else
				{
					y = e;
				}
			 }
		  }
	   }
	 }
	 return (x);
	}
}

