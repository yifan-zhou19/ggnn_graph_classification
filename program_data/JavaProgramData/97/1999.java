package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
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
			x = Integer.parseInt(tempVar);
		}
		a = x / 100;
		b = x % 100;
		c = b / 50;
		d = b % 50;
		e = d / 20;
		f = d % 20;
		g = f / 10;
		h = f % 10;
		i = h / 5;
		j = h % 5;
		k = j;
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",a,c,e,g,i,k);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		return 0;
	}

}

