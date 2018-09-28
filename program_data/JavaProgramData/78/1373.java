package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int i;
		char[] a = {0, '\0', '\0', '\0', '\0', '\0'};
		for (z = 1; z <= 5; z++)
		{
			for (q = 1; q <= 5; q++)
			{
				for (s = 1; s <= 5; s++)
				{
					for (l = 1; l <= 5; l++)
					{
						if ((z + q == s + l) && (z + l > s + q) && (z + s < q) && z != q && z != s && z != l && q != s && q != l && s != l)
						{
							a[5 - z] = 'z';
							a[5 - q] = 'q';
							a[5 - s] = 's';
							a[5 - l] = 'l';
							for (i = 0; i < 5; i++)
							{
								if (a[i] != 0)
								{
									System.out.print(a[i]);
									System.out.print(' ');
									System.out.print((5 - i) * 10);
									System.out.print("\n");
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
