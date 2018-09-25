package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a; //a,b,c????A,B,C????
		int b;
		int c;
		int[] word = new int[4]; //word?k????k????????????
		String rank = new String(new char[4]); //rank?t????t?????
		for (a = 1;a <= 3;a++)
		{
						 for (b = 1;b <= 3;b++)
						 {
										  if (a != b)
										  {
												  for (c = 1;c <= 3;c++)
												  {
																   if (c != a && c != b) //a,b,c???1?3 ????????
																   {
																				 rank = tangible.StringFunctions.changeCharacter(rank, a, 'A');
																				 rank = tangible.StringFunctions.changeCharacter(rank, b, 'B');
																				 rank = tangible.StringFunctions.changeCharacter(rank, c, 'C'); //?????? ???abc???????ABC
																				 word[a] = (b > a) + (c == b);
																				 word[b] = (a > b) + (a > c);
																				 word[c] = (c > b) + (b > a); //??????
																				 if (word[1] > word[2] > word[3])
																				 {
																											System.out.print(rank.charAt(1));
																											System.out.print(rank.charAt(2));
																											System.out.print(rank.charAt(3));
																				 } //???????? ????????????????
																   }
												  }
										  }
						 }
		}
		return 0;
	}

}

