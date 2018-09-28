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
		b = a % 100;
		c = b % 50;
		d = c % 20;
		e = d % 10;
		f = e % 5;
		g = (a - b) / 100;
		h = (b - c) / 50;
		i = (c - d) / 20;
		j = (d - e) / 10;
		k = (e - f) / 5;
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",g,h,i,j,k,f);
		return 0;
	}
}

