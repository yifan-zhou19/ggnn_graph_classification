package <missing>;

public class GlobalMembers
{
	/************************************************************
	 * 03.cpp													*
	 *															*
	 *  Created on: 2010-11-20									*
	 *      Author: ??										*
	 ************************************************************/
	public static int Main()
	{
		int z; //????????
		int q;
		int s;
		int l;
		String m = new String(new char[6]); //??????
		int j;
		for (j = 0;j < 6;j++)
		{
			m = tangible.StringFunctions.changeCharacter(m, j, 'a'); //??????????????????
		}
		for (z = 10;z <= 50;z = z + 10) //?????????????????
		{
			for (q = 10;q <= 50;q = q + 10)
			{
				if (z == q)
				{
					continue;
				}
				for (s = 10;s <= 50;s = s + 10)
				{
					if (z == s || q == s)
					{
						continue;
					}
					for (l = 10;l <= 50;l = l + 10)
					{
						if (z == l || q == l || s == l)
						{
							continue;
						}
						if ((z + q == s + l) && (z + l > s + q) && (z + s < q))
						{
							m = tangible.StringFunctions.changeCharacter(m, z / 10, 'z'); //??????10??????????10?????????????????????
							m = tangible.StringFunctions.changeCharacter(m, q / 10, 'q');
							m = tangible.StringFunctions.changeCharacter(m, s / 10, 's');
							m = tangible.StringFunctions.changeCharacter(m, l / 10, 'l');
						}
						int i;
						for (i = 5;i > 0;i--)
						{
							if (m.charAt(i) == 'a')
							{
								continue;
							}
							else
							{
								System.out.print(m.charAt(i));
								System.out.print(" ");
								System.out.print(i * 10);
								System.out.print("\n");
								m = tangible.StringFunctions.changeCharacter(m, i, 'a');
							}
						}
					}
				}
			}
		}
		return 0;
	}

}

