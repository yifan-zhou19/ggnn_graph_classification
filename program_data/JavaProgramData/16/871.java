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
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b = a / 10000;
		c = a / 1000;
		d = (a % 1000) / 100;
		e = (a % 100) / 10;
		f = a % 10;
		if (b != 0)
		{
			System.out.printf("%05d",b);
		}
		else if (c != 0)
		{
			System.out.printf("%d%d%d%d",f,e,d,c);
		}
		else if (d != 0)
		{
			System.out.printf("%d%d%d",f,e,d);
		}
		else if (e != 0)
		{
			System.out.printf("%d%d",f,e);
		}
		else
		{
			System.out.printf("%d",f);
		}
		return 0;
	}

}

