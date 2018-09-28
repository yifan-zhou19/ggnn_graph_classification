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
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		a = x / 100;
		b = x % 100 / 50;
		c = x % 100 % 50 / 20;
		d = x % 100 % 50 % 20 / 10;
		e = x % 100 % 10 / 5;
		f = x % 100 % 10 % 5;
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",a,b,c,d,e,f);
		return 0;
	}
}

