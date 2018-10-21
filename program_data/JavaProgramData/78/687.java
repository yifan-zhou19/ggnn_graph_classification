package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z = 0;
		int q = 0;
		int s = 0;
		int l = 0;
		for (z = 10;z <= 50;z = z + 10)
		{
			for (q = 10;q <= 50;q = q + 10)
			{
				for (s = 10;s <= 50;s = s + 10)
				{
					for (l = 10;l <= 50;l = l + 10)
					{
						if ((((z + q) == (s + l)) + ((z + l) > (s + q)) + ((z + s) < q)) == 3)
						{
								int i;
								int j;
								int t;
								int[] a = {0, z, q, s, l};
							char u;
							char[] name = {'x', 'z', 'q', 's', 'l'};
							for (j = 1;j <= 3;j++)
							{
								for (i = 1;i <= 4 - j;i++)
								{
									if (a[i] > a[i + 1])
									{
										t = a[i];
										a[i] = a[i + 1];
										a[i + 1] = t;
									 u = name[i];
									 name[i] = name[i + 1];
									 name[i + 1] = u;
									} //?????????????
								}
							}
									System.out.print(name[4]);
									System.out.print(' ');
									System.out.print(a[4]);
									System.out.print('\n');
									System.out.print(name[3]);
									System.out.print(' ');
									System.out.print(a[3]);
									System.out.print('\n');
									System.out.print(name[2]);
									System.out.print(' ');
									System.out.print(a[2]);
									System.out.print('\n');
									System.out.print(name[1]);
									System.out.print(' ');
									System.out.print(a[1]);
									System.out.print('\n');



						}

					}
				}
			}
		}

	}

}
