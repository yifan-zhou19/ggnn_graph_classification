package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
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
		a = m / 100;
		System.out.printf("%d\n",a);
		b = m - a * 100;
		if (b < 50)
		{
			c = 0;
		System.out.printf("%d\n",c);
		d = b / 20;
		System.out.printf("%d\n",d);
		e = b - d * 20;
		f = e / 10;
		System.out.printf("%d\n",f);
		g = e - f * 10;
		h = g / 5;
		System.out.printf("%d\n",h);
		i = g - h * 5;
		j = i / 1;
		System.out.printf("%d\n",j);
		}
		else
		{
		c = 1;
		System.out.printf("%d\n",c);
		d = (b - 50) / 20;
		System.out.printf("%d\n",d);
		e = b - 50 - d * 20;
		f = e / 10;
		System.out.printf("%d\n",f);
		g = e - f * 10;
		h = g / 5;
		System.out.printf("%d\n",h);
		i = g - h * 5;
		j = i / 1;
		System.out.printf("%d\n",j);
		}
		//printf("Hello World!\n");
	}


}

