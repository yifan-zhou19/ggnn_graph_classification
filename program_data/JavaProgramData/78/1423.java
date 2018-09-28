package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] a = {'a', 'z', 'q', 's', 'l'};
		char char_;
		int z;
		int q;
		int s;
		int l;
		int t;
		int[] b = new int[5];
		int i;
		int j;
		for (z = 1;z <= 5;z++)
		{
			for (q = 1;q <= 5;q++)
			{
				for (s = 1;s <= 5;s++)
				{
					for (l = 1;l <= 5;l++)
					{
						if ((z - q) * (z - s) * (z - l) * (q - s) * (q - l) * (s - l) != 0)
						{
							if (z + q == s + l)
							{
								if (z + l > s + q)
								{
									if (z + s < q)
									{
										b[1] = z;
										b[2] = q;
										b[3] = s;
										b[4] = l;
									}
								}
							}
						}
					}
				}
			}
		}
		for (i = 1;i <= 4;i++)
		{
			for (j = 1;j <= 4 - i;j++)
			{
				if (b[j] < b[j + 1])
				{
					t = b[j];
					b[j] = b[j + 1];
					b[j + 1] = t;
					char_ = a[j];
					a[j] = a[j + 1];
					a[j + 1] = char_;
				}
			}
		}
		for (i = 1;i <= 4;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
			System.out.print(b[i] * 10);
			System.out.print("\n");
		}
		return 0;
	}
}
