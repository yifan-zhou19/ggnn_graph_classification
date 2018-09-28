package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int x;
		int y;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2;i <= (n / 2.0);i++)
		{
		  for (x = 2;x < i;x++)
		  {
				  y = i % x;
				if (y == 0)
				{
					break;
				}
		  }
		   if (y != 0)
		   {
			j = n - i;
			for (t = 2;t <= j / 2.0;t++)
			{
				y = j % t;
				if (y == 0)
				{
				break;
				}
			}
			if (y != 0)
			{
				System.out.printf("%d %d\n",i,j);
			}
		   }
		}
		return 0;
	}
}

