package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] a = {'z', 'q', 's', 'l'};
		char d;
		int[] b = new int[4];
		int[] c = new int[4];
		int i;
		int j;
		int p;
		int e;
		int x;
		for (b[0] = 1; b[0] <= 5; b[0]++)
		{
			for (b[1] = 1; b[1] <= 5; b[1]++)
			{
				for (b[2] = 1; b[2] <= 5; b[2]++)
				{
					for (b[3] = 1; b[3] <= 5; b[3]++)
					{
						p = 0;
						for (i = 0; i < 3; i++)
						{
							for (j = i + 1; j < 4; j++)
							{
								if (b[i] == b[j])
								{
									p = 1;
									break;
								}
							}
						}

						if (p == 1)
						{
							continue;
						}
						if (((b[0] + b[1]) == (b[2] + b[3])) && ((b[0] + b[3]) > (b[2] + b[1])) && ((b[0] + b[2]) < b[1]))
						{
							for (i = 0; i < 4; i++)
							{
								c[i] = b[i];
							}
							break;
						}
					}
				}
			}
		}
		for (i = 0; i < 3; i++)
		{
			x = i;
			for (j = i + 1; j < 4; j++)
			{
				if (c[x] < c[j])
				{
					e = c[x];
					c[x] = c[j];
					c[j] = e;
					d = a[x];
					a[x] = a[j];
					a[j] = d;
				}
			}
		}
		for (i = 0; i < 4; i++)
		{
			System.out.print(a[i]);
			System.out.print(' ');
			System.out.print(c[i] * 10);
			System.out.print("\n");
		}
		return 0;
	}

}
