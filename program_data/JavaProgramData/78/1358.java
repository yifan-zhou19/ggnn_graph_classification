package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] b = {'z', 'q', 's', 'l'};
		int[] a = new int[4];
		int j;
		int i;
		for (a[0] = 10; a[0] <= 50; a[0] += 10)
		{
			for (a[1] = 10; a[1] <= 50; a[1] += 10)
			{
				if (a[0] == a[1])
				{
					continue;
				}
				for (a[2] = 10; a[2] <= 50; a[2] += 10)
				{
					if (a[2] == a[1] || a[2] == a[0])
					{
						continue;
					}
					for (a[3] = 10; a[3] <= 50; a[3] += 10)
					{
						if (a[3] == a[0] || a[3] == a[1] || a[2] == a[3])
						{
							continue;
						}
						if (a[0] + a[1] == a[2] + a[3] && a[0] + a[3] > a[1] + a[2] && a[0] + a[2] < a[1])
						{
							for (i = 50; i >= 10; i -= 10)
							{
								for (j = 0; j <= 3; j++)
								{
									if (a[j] == i)
									{
										System.out.print(b[j]);
										System.out.print(' ');
										System.out.print(i);
										System.out.print("\n");
									}
								}
							}
						}
					}
				}
			}
		}
		return 0;
	}
}
