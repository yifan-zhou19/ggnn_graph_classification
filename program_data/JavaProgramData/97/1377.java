package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = n / 100;
		n -= a * 100;
		b = n / 50;
		n -= b * 50;
		c = n / 20;
		n -= c * 20;
		d = n / 10;
		n -= d * 10;
		e = n / 5;
		n -= e * 5;
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d",a,b,c,d,e,n);

		return 0;
	}

}

