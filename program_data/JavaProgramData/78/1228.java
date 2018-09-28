package <missing>;

public class GlobalMembers
{
	///////////////////////
	//??????       //
	//??????       //
	//???1200012823   //
	//???2012?10?8?//
	//????????   //
	///////////////////////



	public static int Main()
	{
		int z; // ??????????????????
		int q;
		int s;
		int l;
		for (z = 1; z <= 5; z++) // ?????????
		{
			for (q = 1; q <= 5; q++) // ?????????
			{
				if (z == q)
				{
					continue; // ????????????
				}
				for (s = 1; s <= 5; s++) // ?????????
				{
					if ((q == s) || (z == s))
					{
						continue; // ????????????
					}
					for (l = 1; l <= 5; l++) // ?????????
					{
						if ((z == l) || (q == l) || (s == l))
						{
							continue; // ????????????
						}
						if ((z + q == s + l) && (z + l > s + q) && (z + s < q)) // ????????
						{
							for (int i = 5; i > 0; i--) // ???????????
							{
								if (z == i)
								{
									System.out.print("z ");
									System.out.print(z * 10);
									System.out.print("\n");
								}
								if (q == i)
								{
									System.out.print("q ");
									System.out.print(q * 10);
									System.out.print("\n");
								}
								if (s == i)
								{
									System.out.print("s ");
									System.out.print(s * 10);
									System.out.print("\n");
								}
								if (l == i)
								{
									System.out.print("l ");
									System.out.print(l * 10);
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
