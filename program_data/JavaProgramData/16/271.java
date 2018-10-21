package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int b;
		int c;
		int d;
		int e;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a == 10000)
		{
			System.out.print("00001");
		}
		else
		{
			if (a >= 1000)
			{
				e = (int)(a / 1000),d = (int)((a - 1000 * e) / 100),c = (int)((a - 1000 * e-100 * d) / 10),b = a % 10;
				System.out.printf("%d%d%d%d",b,c,d,e);
			}
			else
			{
				if (a >= 100)
				{
					d = (int)(a / 100),c = (int)((a - 100 * d) / 10),b = a % 10;
					System.out.printf("%d%d%d",b,c,d);
				}
				else
				{
					if (a >= 10)
					{
						c = (int)(a / 10),b = a % 10;
						System.out.printf("%d%d",b,c);
					}
					else
					{
						System.out.printf("%d",a);
					}
				}
			}
		}
		return 0;
	}
}

