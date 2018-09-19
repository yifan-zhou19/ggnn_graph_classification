package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int[] c = {0, 0, 0, 0, 0, 0};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a / 10 > 0)
		{
			b = a / 10;
			c[1] = a - 10 * b;
			c[2] = b;
			a = b;
			if (a / 10 > 0)
			{
				b = a / 10;
				c[2] = a - 10 * b;
				c[3] = b;
				a = b;
				if (a / 10 > 0)
				{
					b = a / 10;
					c[3] = a - 10 * b;
					c[4] = b;
					a = b;
					if (a / 10 > 0)
					{
						b = a / 10;
						c[4] = a - 10 * b;
						c[5] = b;
						System.out.printf("%d%d%d%d%d",c[1],c[2],c[3],c[4],c[5]);
					}
					else
					{
						System.out.printf("%d%d%d%d",c[1],c[2],c[3],c[4]);
					}
				}
				else
				{
					System.out.printf("%d%d%d",c[1],c[2],c[3]);
				}
			}
			else
			{
				System.out.printf("%d%d",c[1],c[2]);
			}
		}
		else
		{
			c[1] = a;
		System.out.printf("%d",c[1]);
		}
		return 0;
	}
}

