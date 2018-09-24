package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int i;
	public static int j;
	public static int k;
	public static int limit;
	public static int s;
	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2;i <= n;i += 2)
		{
			for (j = 3;j <= i / 2;j += 2)
			{
				int flag = 1;
				limit = Math.sqrt(j);
				for (k = 3;k <= limit;k += 2)
				{
					if (j % k == 0)
					{
						flag = 0;
						break;
					}
				}
				if (flag == 0)
				{
					continue;
				}
				limit = Math.sqrt(i - j);
				for (k = 3;k <= limit;k += 2)
				{
					if ((i - j) % k == 0)
					{
						flag = 0;
						break;
					}
				}
				if (flag != 0)
				{
					System.out.printf("%d=%d+%d\n",i,j,i - j);
					break;
				}
			}
		}
		return 0;
	}
}

