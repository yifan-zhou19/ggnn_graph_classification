package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2;i <= n;i = i + 2)
		{
			for (j = 2;j <= i;j++)
			{
				if (j == 2)
				{
					x = i - 2;
					if (x != 1)
					{
					y = 1;

					for (k = 3;k <= Math.sqrt(x);k = k + 2)
					{
						if ((x % k) == 0)
						{
							y = 0;
							break;
						}
					}
					if (x % 2 == 0)
					{
						y = 0;
					}
					if (y == 1)
					{
						System.out.printf("%d=2+%d\n",i,x);
					}
					}
				}
				else
				{
					y = 1;
					for (k = 3;k <= Math.sqrt(j);k = k + 2)
					{
						 if ((j % k) == 0)
						 {
							 y = 0;
							 break;
						 }
					}
					if (j % 2 == 0)
					{
						y = 0;
					}
					if (y == 1)
					{
						 x = i - j;
						 if (x != 1)
						 {
						 y = 1;
						 for (k = 3;k <= Math.sqrt(x);k = k + 2)
						 {
							 if ((x % k) == 0)
							 {
								 y = 0;
								 break;
							 }
						 }
						 if (x % 2 == 0)
						 {
							 y = 0;
						 }
						 if (y == 1)
						 {
							 System.out.printf("%d=%d+%d\n",i,j,x);
							 break;
						 }
						 }
					}
				}
			}
		}
		return 0;
	}
}

