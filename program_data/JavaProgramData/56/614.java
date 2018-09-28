package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int x;
		int y;
		int a;
		int b;
		int c;
		int d;
		int e;
		int p;
		int q;
		int r;
		int h;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		a = x / 10000;
		p = x % 10000;
		b = p / 1000;
		q = p % 1000;
		c = q / 100;
		r = q % 100;
		d = r / 10;
		e = r % 10;
		y = e * 10000 + d * 1000 + c * 100 + b * 10 + a;
		h = y % 10;
		i = y % 100;
		j = y % 1000;
		k = y % 10000;
		if (h == 0)
		{
		  if (i == 0)
		  {
			if (j == 0)
			{
			  if (k == 0)
			  {
				System.out.printf("%d",e);
			  }
			  else
			  {
				System.out.printf("%d%d",e,d);
			  }
			}
			else
			{
			  System.out.printf("%d%d%d",e,d,c);
			}
		  }
		  else
		  {
			System.out.printf("%d%d%d%d",e,d,c,b);
		  }
		}
		else
		{
		  System.out.printf("%d%d%d%d%d",e,d,c,b,a);
		}
	}

}

