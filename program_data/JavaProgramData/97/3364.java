package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		a = m / 100;
		m = m % 100;
		b = m / 50;
		m = m % 50;
		c = m / 20;
		m = m % 20;
		d = m / 10;
		m = m % 10;
		e = m / 5;
		f = m % 5;
	System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",a,b,c,d,e,f);
	return 0;
	}
}

