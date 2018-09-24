package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int y;
		int z;
		int w;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n <= 9)
		{
			System.out.printf("%d",n);
		}
		else
		{
			x = n % 10;
			if (n <= 99)
			{
			y = (n - x) / 10;
				System.out.printf("%d%d",x,y);
			}
			else
			{
				y = ((n - x) / 10) % 10;
				t = x + 10 * y;
				if (n <= 999)
				{
				z = (n - t) / 100;
					System.out.printf("%d%d%d",x,y,z);
				}
				else
				{
					z = ((n - t) / 100) % 10;
					t = x + 10 * y + 100 * z;
					if (n <= 9999)
					{
					w = (n - t) / 1000;
						System.out.printf("%d%d%d%d",x,y,z,w);
					}
					else
					{
						System.out.print("00001");
					}
				}
			}
		}
		 return 0;
	}
}

