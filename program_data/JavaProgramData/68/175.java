package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int x = 2;
		int y;
		int m;
		int t = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i += 2)
		{

			for (x = 3;x <= (i / 2);x++)
			{
					t = 1;
					if (x % 2 == 0)
					{
						t = 0;
					}
					else
					{
				for (m = 3;m <= Math.sqrt(x);m += 2)
				{
					if (x % m == 0)
					{
						t = 0;
					}
				}
					}
				if (t == 1)
				{
					y = i - x;
					if (y % 2 == 0)
					{
						t = 0;
					}
					else
					{
					for (m = 3;m <= Math.sqrt(y);m += 2)
					{
					if (y % m == 0)
					{
						t = 0;
					}
					}
					}
					if (t == 1)
					{
						System.out.printf("%d=%d+%d\n",i,x,y);

						break;
					}
				}


			}
		}
		return 0;
	}



}

