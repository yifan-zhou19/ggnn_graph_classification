package <missing>;

public class GlobalMembers
{
	/*
	 * ????weight.cpp
	 * ??????
	 * ????: 2012-11-5
	 * ??:?????????????????
	 */

	public static int Main()
	{
		int z; //??????????????10??????10???
		int q;
		int s;
		int l;
		for (z = 1;z <= 5;z++)
		{
			for (q = 1;q <= 5;q++)
			{
				for (s = 1;s <= 5;s++)
				{
					for (l = 1;l <= 5;l++)
					{
					if ((z + q) == (s + l) && (z + l) > (q + s) && (z + s) < q)
					{ //????????
						int[] a = new int[5]; //????????
						int i;
						int j;
						int temp;
						a[0] = z;
						a[1] = q;
						a[2] = s;
						a[3] = l;
						for (i = 0;i <= 3;i++)
						{
							for (j = 0;j <= 3 - i;j++)
							{
								temp = a[j];
								if (a[j] > a[j + 1])
								{
									a[j] = a[j + 1];
									a[j + 1] = temp;
								}
							}
						}
						for (i = 3;0 <= i;i--)
						{ //???????????????????????
							if (z == a[i])
							{
								System.out.print("z ");
								System.out.print(a[i] * 10);
								System.out.print("\n");
							}
							if (q == a[i])
							{
								System.out.print("q ");
								System.out.print(a[i] * 10);
								System.out.print("\n");
							}
							if (s == a[i])
							{
								System.out.print("s ");
								System.out.print(a[i] * 10);
								System.out.print("\n");
							}
							if (l == a[i])
							{
								System.out.print("l ");
								System.out.print(a[i] * 10);
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
