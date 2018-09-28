package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = Integer.parseInt(tempVar);
		}
		int a;
		int b;
		int c;
		int d;
		int e;
		a = s % 10;
		b = (s % 100) / 10;
		c = (s % 1000) / 100;
		d = (s % 10000) / 1000;
		e = (s % 100000) / 10000;
		if (a != 0)
		{
			System.out.printf("%d",a);
		}
		if (b != 0)
		{
			System.out.printf("%d",b);
		}
		if (c != 0)
		{
			System.out.printf("%d",c);
		}
		if (d != 0)
		{
			System.out.printf("%d",d);
		}
		if (e != 0)
		{
			System.out.printf("%d",e);
		}
		return 0;
	}

}

