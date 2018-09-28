package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z; //????????
		int q;
		int s;
		int l;
		int[] word = new int[3]; //????????
		String rank = new String(new char[6]); //????
		for (int i = 0;i < 6;i++)
		{
			   rank = tangible.StringFunctions.changeCharacter(rank, i, '\0'); //?rank???
		}
		for (z = 1;z <= 5;z++) //?????????????????????
		{
			for (q = 1;q <= 5;q++)
			{
				if (q == z)
				{
				continue;
				}
				for (s = 1;s <= 5;s++)
				{
					 if ((s == q) || (s == z))
					 {
					 continue;
					 }
					 for (l = 1;l <= 5;l++)
					 {
						 if ((l == z) || (l == q) || (l == s))
						 {
						 continue;
						 }
						 else
						 {
							 word[0] = ((z + q) == (s + l));
							 word[1] = ((z + l) > (s + q));
							 word[2] = ((z + s) < q);
							 if (word[0] + word[1] + word[2] == 3) //????????
							 {
								 rank = tangible.StringFunctions.changeCharacter(rank, 6 - z, 'z'); //????
								 rank = tangible.StringFunctions.changeCharacter(rank, 6 - q, 'q');
								 rank = tangible.StringFunctions.changeCharacter(rank, 6 - s, 's');
								 rank = tangible.StringFunctions.changeCharacter(rank, 6 - l, 'l');
							 }
						 }
					 }
				}
			}
		}
		for (int i = 1;i <= 5;i++) //??
		{
				if (rank.charAt(i) == '\0')
				{
				continue;
				}
				else
				{
				System.out.print(rank.charAt(i));
				System.out.print(' ');
				System.out.print(10 * (6 - i));
				System.out.print("\n");
				}
		}
		return 0;
	}

}

