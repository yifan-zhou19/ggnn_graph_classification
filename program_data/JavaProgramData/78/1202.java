package <missing>;

public class GlobalMembers
{
	//********************************************************
	//*  ???:8.cpp                                        *
	//*  ??????    1200012948                          *
	//*  ????: 2012 10 17                                *
	//*  ????:???                                     *
	//********************************************************
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int z1;
		int q1;
		int s1;
		int l1;
		int i;
		for (z = 1; z <= 5; z++)
		{
			for (q = 1; q <= 5; q++)
			{
				for (s = 1; s <= 5; s++)
				{
					for (l = 1; l <= 5; l++)
					{
						if ((z + q == s + l) && (z + l > s + q) && (z + s < q) && (z != s) && (z != q) && (z != l) && (s != q) && (s != l) && (q != l))
						{
							z1 = z;
							q1 = q;
							s1 = s;
							l1 = l;
						}


					}
				}
			}
		}
		for (i = 5; i >= 1; i--)
		{
			if (z1 == i)
			{
				System.out.print("z ");
				System.out.print(z1 * 10);
				System.out.print('\n');
			}
			if (q1 == i)
			{
				System.out.print("q ");
				System.out.print(q1 * 10);
				System.out.print('\n');
			}
			if (s1 == i)
			{
				System.out.print("s ");
				System.out.print(s1 * 10);
				System.out.print('\n');
			}
			if (l1 == i)
			{
				System.out.print("l ");
				System.out.print(l1 * 10);
				System.out.print('\n');
			}
		}
		return 0;
	}

}
