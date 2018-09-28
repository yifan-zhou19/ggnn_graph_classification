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
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b = (int)(a / 100);
		c = a % 100;
		d = (int)(c / 50);
		e = c % 50;
		f = (int)(e / 20);
		g = e % 20;
		h = (int)(g / 10);
		i = g % 10;
		j = (int)(i / 5);
		k = i % 5;
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",b,d,f,h,j,k);
		return 0;
	}
}

