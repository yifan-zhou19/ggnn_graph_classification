package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
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
		b = a / 100;
		c = (a - b * 100) / 50;
		d = (a - b * 100 - c * 50) / 20;
		e = (a - b * 100 - c * 50 - d * 20) / 10;
		f = (a - b * 100 - c * 50 - d * 20 - e * 10) / 5;
		g = a - b * 100 - c * 50 - d * 20 - e * 10 - f * 5;
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",b,c,d,e,f,g);
		return 0;
	}
}

