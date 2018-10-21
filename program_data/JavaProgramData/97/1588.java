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
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b = a / 100;
		if (a % 100 >= 50)
		{
			c = 1;
			h = a % 100 - 50;
		}
		else
		{
			c = 0;
			h = a % 100;
		}
		d = h / 20;
		e = (h % 20) / 10;
		i = (h % 20) % 10;
		f = i / 5;
		g = i % 5;
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",b,c,d,e,f,g);
		return 0;
	}


}

