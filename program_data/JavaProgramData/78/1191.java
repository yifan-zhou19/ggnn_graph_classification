package <missing>;

public class GlobalMembers
{
	//**************************************************************
	//*  ?  ?:???                                             *
	//*  ?  ?:???  1200012861                                 *
	//*  ?  ?:2012?10?8?                                      *
	//**************************************************************
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int i;
		int j;
		int[] order = new int[5];
		int temp;
		for (z = 1; z <= 5; z++)
		{
			for (q = 1; q <= 5; q++)
			{
				for (s = 1; s <= 5; s++)
				{
					for (l = 1; l <= 5; l++)
					{
						if (((z + q) == (s + l)) && ((z + l) > (s + q)) && ((z + s) < q))
						{
																	//????????????
							order[1] = z; //????????
							order[2] = q; //????????
							order[3] = s; //????????
							order[4] = l; //????????
							break; //????
						}
					}
				}
			}
		}

		z = order[1]; //????????z
		q = order[2]; //????????q
		s = order[3]; //????????s
		l = order[4]; //????????l

		for (j = 1; j <= 3; j++) //????????
		{
			for (i = 1; i <= (4 - j); i++) //????
			{
				if (order[i] < order[i + 1]) //????????
				{
					temp = order[i];
					order[i] = order[i + 1];
					order[i + 1] = temp; //???????
				}
			}
		}

		for (i = 1; i <= 4; i++)
		{
			if (order[i] == z) //????????i?
			{
				System.out.print("z ");
				System.out.print(10 * order[i]);
				System.out.print("\n");
			}
			if (order[i] == q) //????????i?
			{
				System.out.print("q ");
				System.out.print(10 * order[i]);
				System.out.print("\n");
			}
			if (order[i] == s) //????????i?
			{
				System.out.print("s ");
				System.out.print(10 * order[i]);
				System.out.print("\n");
			}
			if (order[i] == l) //????????i?
			{
				System.out.print("l ");
				System.out.print(10 * order[i]);
				System.out.print("\n");
			}
		}
		return 0;
	}
}
