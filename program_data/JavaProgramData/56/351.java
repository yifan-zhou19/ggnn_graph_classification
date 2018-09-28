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
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
			if (a < 10)
			{
				System.out.printf("%d",a);
			}
			else
			{
				if (a >= 10 && a < 100)
				{
					b = a / 10 + (a - a / 10) * 10;
				System.out.printf("%d",b);
				}
				else
				{
					if (a >= 100 && a < 1000)
					{
					c = a / 100 + (a / 10 - (a / 100) * 10) * 10 + (a - (a / 10) * 10) * 100;
				System.out.printf("%d",c);
					}
				else
				{
					if (a >= 1000 && a < 10000)
					{
					d = a / 1000 + (a / 100 - (a / 1000) * 10) * 10 + (a / 10 - (a / 100) * 10) * 100 + (a - (a / 10) * 10) * 1000;
				System.out.printf("%d",d);
					}
				else
				{
					if (a >= 10000)
					{
					e = a / 10000 + (a / 1000 - (a / 10000) * 10) * 10 + (a / 100 - (a / 1000) * 10) * 100 + (a / 10 - (a / 100) * 10) * 1000 + (a - (a / 10) * 10) * 10000;
				System.out.printf("%d",e);
					}
				}
				}
				}
			}
		return 0;
	}


}

