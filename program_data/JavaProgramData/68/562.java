package <missing>;

public class GlobalMembers
{
	public static int sushu(int a)
	{
		if (a > 2 && a % 2 == 0)
		{
			return 0;
		}
		else
		{
				if (a == 2)
				{
					return 1;
				}
				else
				{
						for (int i = 3;i < Math.sqrt(a) + 1;i = i + 2)
						{
							if (a % i == 0)
							{
								return 0;
							}
						}

				}
		}
		return 1;

	}
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int i;
		int t;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = Integer.parseInt(tempVar);
		}
		for (m = 6;m <= c;m = m + 2)
		{
				d = 0;
			for (i = 3;i <= m / 2;i = i + 2)
			{
					t = m - i;
					if (sushu(i) != 0 && sushu(t) != 0)
					{
					System.out.printf("%d=%d+%d\n",m,i,t);
					break;

					}

			}
		}

	}

}

