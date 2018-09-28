package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int a;
		int b;
		int q;
		int w;
		int r;
		int t;
		int y;
		int c;
		int d;
		int e;
		int f;
		int g;
		int h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		c = x % 100;
		d = c % 50;
		e = d % 20;
		f = e % 10;
		g = f % 5;
		h = g % 2;
		a = (x - c) / 100;
		b = (c - d) / 50;
		q = (d - e) / 20;
		w = (e - f) / 10;
		r = (f - g) / 5;
		t = (g - h) / 2;
		y = h;
		 System.out.printf("%d\n\n",a);
		 System.out.printf("%d\n\n",b);
		 System.out.printf("%d\n\n",q);
		 System.out.printf("%d\n\n",w);
		 System.out.printf("%d\n\n",r);
		 System.out.printf("%d\n\n",g);
		 return 0;
	}
}

