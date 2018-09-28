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
		int j;
		int t;
		int[] a = new int[4];
		for (z = 1; z < 6; z++)
		{
			for (q = 1; q < 6; q++)
			{
				for (s = 1; s < 6; s++)
				{
					for (l = 1; l < 6; l++)
					{
						if (z + q == s + l && z + l > s + q && z + s < q)
						{
							a[0] = z;
							a[1] = q;
							a[2] = s;
							a[3] = l;
							for (i = 0; i < 3; i++)
							{
								for (j = 0; j < 3 - i; j++)
								{
									if (a[j] < a[j + 1])
									{
										t = a[j + 1];
										a[j + 1] = a[j];
										a [j] = t;
									}
								}
							}
							for (i = 0; i < 4;i++)
							{
								if (z == a[i])
								{
									System.out.print("z");
									System.out.print(" ");
									System.out.print(10 * a[i]);
									System.out.print("\n");
								}
								if (q == a[i])
								{
									System.out.print("q");
									System.out.print(" ");
									System.out.print(10 * a[i]);
									System.out.print("\n");
								}
								if (s == a[i])
								{
									System.out.print("s");
									System.out.print(" ");
									System.out.print(10 * a[i]);
									System.out.print("\n");
								}
								if (l == a[i])
								{
									System.out.print("l");
									System.out.print(" ");
									System.out.print(10 * a[i]);
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
