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
		int f;
		int g;
		int x;
		int h;
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		a = 3;
		b = 5;
		c = 7;
		d = a * b * c;
		e = a * b;
		f = a * c;
		g = b * c;
		h = x % d;
		i = x % e;
		j = x % f;
		k = x % g;
		l = x % a;
		m = x % b;
		n = x % c;
		s = l * m * n;
		if (h == 0)
		{
			System.out.printf("%d %d %d",a,b,c);
		}
		else if (i == 0)
		{
			System.out.printf("%d %d",a,b);
		}
			 else if (j == 0)
			 {
				 System.out.printf("%d %d",a,c);
			 }
				  else if (k == 0)
				  {
					  System.out.printf("%d %d",b,c);
				  }
					   else if (l == 0)
					   {
						   System.out.printf("%d",a);
					   }
					   else if (m == 0)
					   {
						   System.out.printf("%d",b);
					   }
					   else if (n == 0)
					   {
						   System.out.printf("%d",c);
					   }

					   else
					   {

		System.out.print("n");
					   }

	}
}

