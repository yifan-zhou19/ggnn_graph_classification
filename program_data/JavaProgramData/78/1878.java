package <missing>;

public class GlobalMembers
{
	/*
	 * ????chengtizhong.cpp
	 * ??????????????????????????????????????
	 * ????: 2012-11-5
	 * ?? : ? ?
	 */



	public static int Main()
	{
		int z = 0;
		int q = 0;
		int s = 0;
		int l = 0;
		for (z = 1; z <= 5; z++)
		{
			for (q = 1; q <= 5; q++)
			{
				for (s = 1; s <= 5; s++)
				{
					for (l = 1; l <= 5; l++)
					{
						if (((z + q) == (s + l)) && ((z + l) > (s + q)) && ((z + s) < q) && (z != q) && (q != s) && (s != l) && (l != z))
						{
							System.out.print('l');
							System.out.print(' ');
							System.out.print((l * 10));
							System.out.print("\n");
							System.out.print('q');
							System.out.print(' ');
							System.out.print((q * 10));
							System.out.print("\n");
							System.out.print('z');
							System.out.print(' ');
							System.out.print((z * 10));
							System.out.print("\n");
							System.out.print('s');
							System.out.print(' ');
							System.out.print((s * 10));
							System.out.print("\n");
						}

					}
				}
			}
		}
		return 0;
	}


}
