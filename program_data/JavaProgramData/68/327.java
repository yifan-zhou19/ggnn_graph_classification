package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int k;
		int w;
		for (i = 6;i <= n;i = i + 2)
		{
			w = 0;
			for (j = 3;j < n;j += 2)
			{
				for (k = 2;k * k <= j;k++)
				{
					if (j % k == 0)
					{
						w = 1;
					}
				}
				if (w == 0)
				{
					for (k = 2;k * k <= (i - j);k++)
					{
						if ((i - j) % k == 0)
						{
							 w = 1;
						}
					}
				}
				if (w == 0)
				{
					System.out.printf("%d=%d+%d\n",i,j,i - j);
				}
				if (w == 0)
				{
					break;
				}
			w = 0;
			}
		}
		return 0;
	}
}

