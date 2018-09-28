package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		int h;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
			if (a / 10 == 0)
			{
				b = a;
				System.out.printf("%d",b);
			}
			else if (a / 100 == 0)
			{
				c = a / 10;
				b = a - c * 10;
				g = b;
				h = c;
				System.out.printf("%d%d",g,h);
			}

			else if (a / 1000 == 0)
			{
				d = a / 100;
				c = (a - 100 * d) / 10;
				b = a - d * 100 - c * 10;
				g = b;
				h = c;
				i = d;
				System.out.printf("%d%d%d",g,h,i);
			}

			else if (a / 10000 == 0)
			{
				e = a / 1000;
				d = (a - 1000 * e) / 100;
				c = (a - 1000 * e - d * 100) / 10;
				b = a - 1000 * e-100 * d - 10 * c;
				g = b;
				h = c;
				i = d;
				j = e;
				System.out.printf("%d%d%d%d",g,h,i,j);
			}
			else if (a / 100000 == 0)
			{
				f = a / 10000;
				e = (a - 10000 * f) / 1000;
				d = (a - 10000 * f - 1000 * e) / 100;
				c = (a - 10000 * f - 1000 * e-100 * d) / 10;
				b = a - 10000 * f - 1000 * e-100 * d - 10 * c;
				g = b;
				h = c;
				i = d;
				j = e;
				k = f;
				System.out.printf("%d%d%d%d%d",g,h,i,j,k);
			}




	}

}

