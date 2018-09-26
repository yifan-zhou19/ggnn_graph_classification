package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int x;
		int y;
		int s;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 5)
		{
			System.out.print("empty");
		}
		else
		{
			for (x = 3;x <= n - 2;x++)
			{
				for (i = x - 1;i > 1;i--)
				{
					if (x % i == 0)
					{
						s = 0;
						break;
					}
					else
					{
						s = 1;
					}
				}
				if (s == 1)
				{
					y = x + 2;
					for (i = x - 1;i > 1;i--)
					{
						if (y % i == 0)
						{
							t = 0;
							break;
						}
						else
						{
							t = 1;
						}
					}
				}
				else
				{
					t = 0;
				}
				if (t == 1)
				{
					System.out.printf("%d %d\n",x,y);
				}
			}
		}
		return 0;
	}


}

