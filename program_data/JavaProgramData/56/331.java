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
		int num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		a = num / 10000;
		b = (int)(num - a * 10000) / 1000;
		c = (int)(num - a * 10000 - b * 1000) / 100;
		d = (int)(num - a * 10000 - b * 1000 - c * 100) / 10;
		e = (int)(num - a * 10000 - b * 1000 - c * 100 - d * 10);
		if (num > 9999)
		{
			System.out.printf("%d%d%d%d%d\n",e,d,c,b,a);
		}
		else if (num > 999)
		{
			System.out.printf("%d%d%d%d\n",e,d,c,b);
		}
		else if (num > 99)
		{
			System.out.printf("%d%d%d\n",e,d,c);
		}
		else if (num > 9)
		{
			System.out.printf("%d%d\n",e,d);
		}
		else
		{
			System.out.printf("%d\n",e);
		}
		return 0;

	}

}

