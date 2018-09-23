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
		int h;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a <= 9)
		{
			System.out.printf("%d\n",a);
		}
		else
		{
			if (a <= 99)
			{
			b = a / 10;
			c = a - 10 * b;
		System.out.printf("%d%d",c,b);
			}
		else
		{
			if (a <= 999)
			{
			d = a / 100;
			e = (a - d * 100) / 10;
			f = a - 100 * d - 10 * e;
		System.out.printf("%d%d%d",f,e,d);
			}
		else
		{
		if (a <= 9999)
		{
			g = a / 1000;
			h = (a - 1000 * g) / 100;
			i = (a - 1000 * g - 100 * h) / 10;
			j = a - 1000 * g - 100 * h - 10 * i;
		System.out.printf("%d%d%d%d",j,i,h,g);
		}
		else
		{
		if (a = 10000)
		{
		System.out.print("00001\n");
		}
		}
		}
		}
		}
	  return 0;
	}

}

