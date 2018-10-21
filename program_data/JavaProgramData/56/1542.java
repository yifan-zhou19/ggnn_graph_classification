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
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b = a / 10000;
		c = a / 1000;
		d = a / 100;
		e = a / 10;
		if (b > 0)
		{
			f = c % 10;
			g = (d % 100) % 10;
			h = ((e % 1000) % 100) % 10;
			i = (((a % 10000) % 1000) % 100) % 10;
			j = b + f * 10 + g * 100 + h * 1000 + i * 10000;
		}
		else if (c > 0)
		{
			f = d % 10;
			g = (e % 100) % 10;
			h = ((a % 1000) % 100) % 10;
			j = c + f * 10 + g * 100 + h * 1000;
		}
		else if (d > 0)
		{
			f = e % 10;
			g = (a % 100) % 10;
			j = d + f * 10 + g * 100;
		}
		else if (e > 0)
		{
			f = a % 10;
			j = f * 10 + e;
		}
		else
		{
			j = a;
		}
		System.out.printf("%d",j);
	}
}

