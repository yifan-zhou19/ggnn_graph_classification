package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int k = 0;
		int i1;
		int i2;
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i1 = 3;i1 <= (m / 2);i1 = i1 + 2)
		{

			i2 = m - i1;
			for (x = 3;x < i1;x++)
			{
				if ((i1 % x) == 0)
				{
					k = 1;

					break;
				}
			}

			if (k != 1)
			{
				for (y = 3;y < i2;y++)
				{
				if ((i2 % y) == 0)
				{
					k = 1;

					break;
				}
				}

			}
			if (k != 1)
			{
				System.out.printf("%d %d\n",i1,i2);
			}
			k = 0;
		}
		return 0;
	}
}

