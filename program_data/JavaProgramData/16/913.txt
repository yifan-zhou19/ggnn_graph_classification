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

		if (a >= 0 && a < 10)
		{
			System.out.printf("%d\n",a);
		}
		else if (a >= 10 && a < 100)
		{
			b = a % 10;
			c = (a - b) / 10;
			d = b * 10 + c;
			System.out.printf("%02d\n",d);
		}
		else if (a >= 100 && a < 1000)
		{
			b = a % 10;
			c = (a - b) % 100;
			d = (a - b - c) / 100;
			e = b * 100 + c + d;
			System.out.printf("%03d\n",e);
		}
		else if (a >= 1000 && a < 10000)
		{
			b = a % 10;
			c = (a - b) % 100;
			d = (a - b - c) % 1000;
			e = (a - b - c - d) / 1000;
			f = b * 1000 + c * 10 + d / 10 + e;
			System.out.printf("%04d\n",f);
		}
		System.out.print("\n");
		return 0;
	}
}

