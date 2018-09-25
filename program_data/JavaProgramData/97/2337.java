package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = (int)(n / 100);
		b = (int)((n % 100) / 50);
		c = (int)(((n % 100) % 50) / 20);
		d = (int)((((n % 100) % 50) % 20) / 10);
		e = (int)(((((n % 100) % 50) % 20) % 10) / 5);
		f = (int)(((((n % 100) % 50) % 20) % 10) % 5);
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",a,b,c,d,e,f);
		return 0;
	}
}

