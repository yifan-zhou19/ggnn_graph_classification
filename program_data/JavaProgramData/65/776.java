package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int q;
		int a;
		int b;
		a = 0;
		b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] sz = new int[n][2];
		for (i = 0;i < n;i++)
		{
			for (q = 0;q < 2;q++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[i][q] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i][0] == 0 && sz[i][1] == 1)
			{
				a = a + 1;
				b = b;
			}
			else
			{
				if (sz[i][0] == 1 && sz[i][1] == 2)
				{
					a = a + 1;
					b = b;
				}
				else
				{
					if (sz[i][0] == 2 && sz[i][1] == 0)
					{
						a = a + 1;
						b = b;
					}
					else
					{
						if (sz[i][0] == sz[i][1])
						{
							a = a;
							b = b;
						}
						else
						{
							a = a;
							b = b + 1;
						}
					}
				}
			}
		}
		if (a > b)
		{
			System.out.print("A");
		}
		else
		{
			if (a == b)
			{
				System.out.print("Tie");
			}
			else
			{
				System.out.print("B");
			}
		}
		return 0;
	}
}

