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
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = (int)(n / 100);
		n = n - 100 * a;
		b = (int)(n / 50);
		n = n - 50 * b;
		c = (int)(n / 20);
		n -= 20 * c;
		d = (int)(n / 10);
		n -= 10 * d;
		e = (int)(n / 5);
		n -= 5 * e;
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",a,b,c,d,e,n);
		return 0;
	}
}

