package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int q;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			q = Integer.parseInt(tempVar);
		}
		a = q / 100;
		if ((q - a * 100) >= 50)
		{
			b = 1;
		}
		q = q - a * 100 - b * 50;
		if (q >= 20)
		{
			c = q / 20;
		}
		q = q - 20 * c;
		if (q >= 10)
		{
			d = q / 10;
		}
		q = q - 10 * d;
		if (q >= 5)
		{
			e = q / 5;
		}
		q = q - 5 * e;
		f = q;
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",a,b,c,d,e,f);
		return 0;
	}
}

