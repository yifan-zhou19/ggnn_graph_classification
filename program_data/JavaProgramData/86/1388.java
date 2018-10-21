package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int g;
		int t;
		int[] a = new int[20];
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m == 0)
			{
				System.out.print("60\n");
			}
			else
			{
				g = 0;
				t = 0;
				for (j = 0;j < m;j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						a[j] = Integer.parseInt(tempVar3);
					}
				}
				for (j = 0;j < m;j++)
				{
					if (j == 0)
					{
						for (k = 0;k < a[j];k++)
						{
							t++;
							if (t < 60)
							{
								g++;
							}
						}
					}
					else
					{
						for (k = 0;k < (a[j] - a[j - 1]);k++)
						{
							t++;
							if (t <= 60)
							{
								g++;
							}
						}
					}
					t += 3;
					if (t >= 60)
					{
							break;
					}
				}
				while (t < 60)
				{
					g++;
					t++;
				}
				System.out.printf("%d\n",g);
			}
		}


		return 0;
	}

}

