package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			f = Integer.parseInt(tempVar);
		}
		if (f == 10000)
		{
			System.out.print("00001\n");
		}
		else if (f > 999 && f <= 9999)
		{
			int a;
			int b;
			int c;
			int d;
		a = 1;
		while (f - a * 1000 >= 0)
		{
			a++;
		}
		a = a - 1;
		b = 1;
		while (f - a * 1000 - b * 100 >= 0)
		{
			b++;
		}
			c = 1;
			b = b - 1;
		while (f - a * 1000 - b * 100 - c * 10 >= 0)
		{
			c++;
		}
			d = 1;
			c = c - 1;
		while (f - a * 1000 - b * 100 - c * 10 - d * 1 >= 0)
		{
			d++;
		}
		d = d - 1;
		System.out.printf("%d%d%d%d",d,c,b,a);
		}
		else if (f > 99 && f <= 999)
		{
				int a;
				int b;
				int c;
		a = 1;
		while (f - a * 100 >= 0)
		{
			a++;
		}
		a = a - 1;
		b = 1;
		while (f - a * 100 - b * 10 >= 0)
		{
			b++;
		}
			c = 1;
			b = b - 1;
		while (f - a * 100 - b * 10 - c * 1 >= 0)
		{
			c++;
		}
			c = c - 1;
			System.out.printf("%d%d%d",c,b,a);
		}
		else if (f > 9 && f <= 99)
		{
				int a;
				int b;
		a = 1;
		while (f - a * 10 >= 0)
		{
			a++;
		}
		a = a - 1;
		b = 1;
		while (f - a * 10 - b * 1 >= 0)
		{
			b++;
		}
			b = b - 1;
			System.out.printf("%d%d",b,a);
		}
		else
		{
			System.out.printf("%d",f);
		}
		return 0;
	}
}

