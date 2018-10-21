package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int a;
		int b;
		int t;
		int x;
		int c;
		int d;
		int[] z = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a = 0;a <= n - 1;a++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (b = 0;b <= m - 1;b++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					z[b] = Integer.parseInt(tempVar3);
				}
			}
			if (m == 0)
			{
				System.out.print("60\n");
			}

			else
			{
				t = 60;
				x = 0;
				c = 0;
				d = 0;
				while (t > 0)
				{
					t--;
					if (d == 0)
					{
						if (c < m)
						{
						if (x == z[c] - 1)
						{
							d = 3;
							c++;
						}
						}
						x++;
					}
					else
					{
						d--;
					}
				}
				System.out.printf("%d\n",x);
			}

		}
		return 0;
	}
}

