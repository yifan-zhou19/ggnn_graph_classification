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
		if (a / 10000 == 0)
		{
			if (a / 1000 == 0)
			{
				if (a / 100 == 0)
				{
					if (a / 10 == 0)
					{
						System.out.printf("%d\n",a);
					}
					else
					{
						b = a % 10;
						c = a / 10;
						System.out.printf("%d%d\n",b,c);
					}
				}
				else
				{
						c = a / 100;
						d = (a - c * 100) / 10;
						b = (a - c * 100) % 10;
						System.out.printf("%d%d%d\n",b,d,c);
				}
			}
			else
			{
				b = a / 1000;
				c = (a - b * 1000) / 100;
				d = (a - b * 1000 - c * 100) / 10;
				e = (a - b * 1000 - c * 100) % 10;
				System.out.printf("%d%d%d%d\n",e,d,c,b);
			}
		}
		else
		{
			System.out.print("00001\n");
		}
		return 0;
	}
}

