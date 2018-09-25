package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] a = {'z', 'q', 's', 'l'};
		char m;
		int[] b = new int[4];
		int n;
		int k;
		int i;
		int j;
		for (b[0] = 10;b[0] <= 50;b[0] = b[0] + 10)
		{
			for (b[1] = 10;b[1] <= 50;b[1] = b[1] + 10)
			{
				if (b[0] == b[1])
				{
					continue;
				}
				for (b[2] = 10;b[2] <= 50;b[2] = b[2] + 10)
				{
					if (b[2] == b[0] || b[2] == b[1])
					{
						continue;
					}
					for (b[3] = 10;b[3] <= 50;b[3] = b[3] + 10)
					{
						if (b[3] == b[0] || b[3] == b[1] || b[3] == b[2])
						{
							continue;
						}
						if (b[0] + b[1] == b[2] + b[3] && b[0] + b[3] > b[1] + b[2] && b[0] + b[2] < b[1])
						{
							for (i = 0;i < 3;i++)
							{
								for (j = 3;j > i;j--)
								{
									if (b[j] > b[j - 1])
									{
										n = b[j];
										b[j] = b[j - 1];
										b[j - 1] = n;
										m = a[j];
										a[j] = a[j - 1];
										a[j - 1] = m;
									}
								}
							}
							for (k = 0;k < 4;k++)
							{
								   System.out.print(a[k]);
								   System.out.print(' ');
								   System.out.print(b[k]);
								   System.out.print("\n");
							}
						}
					}
				}
			}
		}
		return 0;
	}

}
