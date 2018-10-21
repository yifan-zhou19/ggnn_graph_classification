package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		a = x / 1000;
		b = (x - 1000 * a) / 100;
		c = (x - 1000 * a - 100 * b) / 10;
		d = x - 1000 * a - 100 * b - 10 * c;
		if (a == 0)
		{
			y = d * 100 + c * 10 + b;
			if (b == 0)
			{
			  y = d * 10 + c;
			  if (c == 0)
			  {
				  y = d;
			  }
			}
		}
		else
		{
			y = d * 1000 + c * 100 + b * 10 + a;
		}
		if (d != 0)
		{
			System.out.printf("%d",y);
		}
		if ((d == 0) && (c != 0))
		{
			System.out.printf("0%d",y);
		}
		if ((d == 0) && (c == 0) && (b != 0))
		{
			System.out.printf("00%d",y);
		}
		if ((d == 0) && (c == 0) && (b == 0))
		{
			System.out.printf("000%d",y);
		}
		return 0;
	}

}

