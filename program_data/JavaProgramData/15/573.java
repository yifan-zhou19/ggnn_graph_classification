package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		int b = 0;
		int i = 0;
		int j = 0;
		int p = 0;
		int q = 0;
		int m = 0;
		int n = 0;
		int x1 = 0;
		int y = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x1 = Integer.parseInt(tempVar);
		}
		y = 0;
		for (i = 1;i <= x1;i++)
		{
			for (j = 1;j <= x1;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a = Integer.parseInt(tempVar2);
				}
				if ((a == 0) && (y == 0))
				{
					p = i;
					q = j;
					y = 1;
				}
				else if (a == 0)
				{
					m = i;
					n = j;
				}
			}
		}
		b = (m - p - 1) * (n - q - 1);
		System.out.printf("%d",b);
		return 0;
	}


}

