package <missing>;

public class GlobalMembers
{
	public static int reverse(int x)
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int y;
		a = x / 10000;
		b = x / 1000 % 10;
		c = x / 100 % 10;
		d = x / 10 % 10;
		e = x % 10;
		if (a != 0)
		{
		y = e * 10000 + d * 1000 + c * 100 + b * 10 + a;
		}
		  else if (b != 0)
		  {
			  y = e * 1000 + d * 100 + c * 10 + b;
		  }
		  else if (c != 0)
		  {
			  y = e * 100 + d * 10 + c;
		  }
		  else if (d != 0)
		  {
			   y = e * 10 + d;
		  }
		  else
		  {
			  y = e;
		  }

		return y;
	}
	public static int Main()
	{
		int re_num;
		int num;
		int i;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				num = Integer.parseInt(tempVar);
			}
			re_num = reverse(num);
			System.out.printf("%d\n",re_num);
		}
		return 0;
	}
}

