package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int w;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = n % 10;
		x = n / 10;
		if (x == 0)
		{
			w = 1;
		}
		else
		{
			{
				b = x % 10;
				x = x / 10;
		}
		if (x == 0)
		{
				w = 2;
		}
			else
			{
				{
					c = x % 10;
					x = x / 10;
			}
				if (x == 0)
				{
					w = 3;
				}
				else
				{
					{
						d = x % 10;
						x = x / 10;
				}
					if (x == 0)
					{
						w = 4;
					}
					else
					{
						w = 5;
						e = x % 10;
					}
				}
			}
		}
		switch (w)
		{
			case 5:
				System.out.printf("%d%d%d%d%d\n",a,b,c,d,e);
				break;
		 case 4:
			 System.out.printf("%d%d%d%d\n",a,b,c,d);
				break;
		 case 3:
			 System.out.printf("%d%d%d\n",a,b,c);
				break;
		 case 2:
			 System.out.printf("%d%d\n",a,b);
				break;
		 case 1:
			 System.out.printf("%d\n",a);
				break;
		}
		return 0;
	}

}

