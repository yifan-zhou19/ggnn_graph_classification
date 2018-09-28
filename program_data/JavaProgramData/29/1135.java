package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (int z = 0;z < m;z++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			double sum = 0;
			int x = 1;
			int y = 2;
			int tmp;
			for (int i = 0;i < n;i++)
			{
				sum = sum + (double)y / x;
				tmp = y;
				y = x + y;
				x = tmp;
			}
			if (z != 0)
			{
				System.out.print("\n");
			}
			System.out.printf("%.3lf",sum);
		}

		return 0;
	}
}

