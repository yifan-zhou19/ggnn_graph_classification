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
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n > 9999)
		{
			y = 5;
		}
		else if (n > 999)
		{
			y = 4;
		}
		else if (n > 99)
		{
			y = 3;
		}
		else if (n > 9)
		{
			y = 2;
		}
		else
		{
			y = 1;
		}
		a = n / 1000;
		b = (n - a * 1000) / 100;
		c = (n - a * 1000 - b * 100) / 10;
		d = (n - a * 1000 - b * 100 - c * 10);
		switch (y)
		{
		case 5:
			System.out.print("10000");
			break;
		case 4:
			System.out.printf("%d%d%d%d",d,c,b,a);
			break;
		case 3:
			System.out.printf("%d%d%d",d,c,b);
			break;
		case 2:
			System.out.printf("%d%d",d,c);
			break;
		case 1:
			System.out.printf("%d",d);
		}
		return 0;
	}
}

