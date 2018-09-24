package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int a;
		int b;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		if (x == 10000)
		{
			System.out.print("00001\n");
		}
		else
		{
			a = x / 1000;
			b = (x - a * 1000) / 100;
			c = (x - a * 1000 - b * 100) / 10;
			d = x - a * 1000 - b * 100 - c * 10;
			if (a != 0)
			{
				System.out.printf("%d%d%d%d\n",d,c,b,a);
			}
			else
			{
				if (b != 0)
				{
					System.out.printf("%d%d%d\n",d,c,b);
				}
				else
				{
					if (c != 0)
					{
						System.out.printf("%d%d\n",d,c);
					}
					else
					{
						System.out.printf("%d\n",d);
					}
				}
			}
		}
	}

}

