package <missing>;

public class GlobalMembers
{
	public static int Main() //?????
	{
		int a = 0; //??ABC??
		int b = 0;
		int c = 0;
		void check(int x,int y,int z); //???????????
		for (a = 0;a < 3;a++)
		{
			for (b = 0;b < 3;b++)
			{
				if (a == b)
				{
					continue;
				}
				else
				{
					for (c = 0;c < 3;c++)
					{
						if (c == a || c == b)
						{
							continue; //?????????????
						}
						else
						{
							check(a, b, c); //????
						}
					}
				}
			}
		}
		return 0;
	}
	public static void check(int x,int y,int z) //??????
	{
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int i = 0;
		String rank = new String(new char[3]);
		n1 = (y > x) + (z == x);
		n2 = (x > y) + (x > z);
		n3 = (z > y) + (y > x); //??????????
		if ((n1 == 2 - x) && (n2 == 2 - y) && (n3 == 2 - z))
		{
			rank = tangible.StringFunctions.changeCharacter(rank, x, 'A');
			rank = tangible.StringFunctions.changeCharacter(rank, y, 'B');
			rank = tangible.StringFunctions.changeCharacter(rank, z, 'C'); //???????????
		for (i = 0;i < 3;i++)
		{
			System.out.print(rank.charAt(i));
		}
		}
	}

}

