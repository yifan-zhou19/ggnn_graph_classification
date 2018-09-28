package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int y;
		int a;
		int b;
		int[] z = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] r = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int t;
		int[] p = new int[201];
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b = Integer.parseInt(tempVar4);
			}

			p[i] = 0;
			if ((y % 4 == 0) && (((y % 100) != 0) || ((y % 400) == 0)))
			{
				t = 0;
				if (a > b)
				{
					for (j = b;j <= (a - 1);j++)
					{
						t = t + r[j];
					}
				}
				if (a < b)
				{
					for (j = a;j <= (b - 1);j++)
					{
						t = t + r[j];
					}
				}
				if ((t % 7) == 0)
				{
					p[i] = 1;
				}
				else
				{
					p[i] = 0;
				}
			}

			else
			{
				t = 0;
				if (a > b)
				{
					for (j = b;j <= (a - 1);j++)
					{
						t = t + z[j];
					}
				}
				if (a < b)
				{
					for (j = a;j <= (b - 1);j++)
					{
						t = t + z[j];
					}
				}
				if ((t % 7) == 0)
				{
					p[i] = 1;
				}
				else
				{
					p[i] = 0;
				}
			}
		}

		for (i = 1;i <= n;i++)
		{
			if (p[i] != 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}

	}

}

