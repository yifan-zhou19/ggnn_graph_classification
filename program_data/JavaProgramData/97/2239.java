package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int money;
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
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			money = Integer.parseInt(tempVar);
		}
		a = money - money % 100;
		b = money - (money - a) % 50 - a;
		c = money - (money - a - b) % 20 - a - b;
		d = money - (money - a - b - c) % 10 - a - b - c;
		e = money - (money - a - b - c - d) % 5 - a - b - c - d;
		f = money - (money - a - b - c - d - e) % 1 - a - b - c - d - e;
		g = a / 100;
		h = b / 50;
		i = c / 20;
		j = d / 10;
		k = e / 5;
		l = f / 1;
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",g,h,i,j,k,l);
		return 0;
	}
}

