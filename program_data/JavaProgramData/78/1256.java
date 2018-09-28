package <missing>;

public class GlobalMembers
{
	//*********************************************
	//*            ????????               *
	//*             ??????                  *
	//*            ???1200012764               *
	//*           ???2012/10/12                *  
	//*********************************************
	public static int Main()
	{
		int z = 1; //???????????10?????
		int q = 1;
		int s = 1;
		int l = 1;
		int zx; //??????????????10?????
		int qx;
		int sx;
		int lx;
		for (z = 1 ; z <= 5 ; z++)
		{
			for (q = 1 ; q <= 5 ; q++) //?????????????????
			{
				for (s = 1 ; s <= 5 ; s++)
				{
					for (l = 1 ; l <= 5 ; l++)
					{
						if ((z + q == s + l) && (z + l > s + q) && (z + s < q))
						{
							zx = z;
							qx = q;
							sx = s;
							lx = l;
						}
					}
				}
			}
		}
					int[] weight = {0, zx, qx, sx, lx}; //??????????????
					char[] mweight = {'0', 'z', 'q', 's', 'l'}; //?????????????z q s l
					for (int k = 1 ; k <= 4 ; k++)
					{
						for (int r = 1 ; r <= 4 - k ; r++) //????????????
						{
							if (weight[r] < weight[r + 1])
							{
								int p = weight[r];
								weight[r] = weight[r + 1];
								weight[r + 1] = p;
								char q = mweight[r];
								mweight[r] = mweight[r + 1];
								mweight[r + 1] = q;
							}
						}
					}
					System.out.print(mweight[1]);
					System.out.print(" ");
					System.out.print(weight[1] * 10);
					System.out.print("\n");
					System.out.print(mweight[2]);
					System.out.print(" ");
					System.out.print(weight[2] * 10);
					System.out.print("\n");
					System.out.print(mweight[3]);
					System.out.print(" ");
					System.out.print(weight[3] * 10);
					System.out.print("\n");
					System.out.print(mweight[4]);
					System.out.print(" ");
					System.out.print(weight[4] * 10);
					System.out.print("\n");
					return 0;
	}

}
