package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {10, 20, 30, 40, 50};
		int z;
		int q;
		int s;
		int l;
		int i;
		int i2;
		int i3;
		int i4;
		for (i = 0; i < 5; i++)
		{
			z = a[i];
			for (i2 = 0; i2 < 5;i2++)
			{
				if (i2 == i)
				{
					continue;
				}
				else
				{
					q = a[i2];
					for (i3 = 0; i3 < 5; i3++)
					{
						if ((i3 == i2) || (i3 == i))
						{
							continue;
						}
						else
						{
							s = a[i3];
							for (i4 = 0; i4 < 5; i4++)
							{
								if ((i4 == i) || (i4 == i2) || (i4 == i3))
								{
									continue;
								}
								else
								{
									l = a[i4];
									if ((z + q == s + l) && (z + l > s + q) && (z + s < q)) //lqzs
									{
										System.out.print("l");
										System.out.print(" ");
										System.out.print(l);
										System.out.print("\n");
										System.out.print("q");
										System.out.print(" ");
										System.out.print(q);
										System.out.print("\n");
										System.out.print("z");
										System.out.print(" ");
										System.out.print(z);
										System.out.print("\n");
										System.out.print("s");
										System.out.print(" ");
										System.out.print(s);
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
