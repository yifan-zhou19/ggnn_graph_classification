package <missing>;

public class GlobalMembers
{
	//-------------------
	//      ????
	//       ???
	//-------------------


	public static int Main()
	{
		int a; //??????????????,i??
		int b;
		int c;
		int i;
		int[] words = new int[3]; //words[]???????????
		String rank = new String(new char[4]); //rank[]??????????
		for (a = 1;a <= 3;a++)
		{
		  for (b = 1;b <= 3;b++)
		  {
			   if (a != b)
			   {
			   for (c = 1;c <= 3;c++)
			   {
					if ((a != c) && (b != c))
					{
					 rank = tangible.StringFunctions.changeCharacter(rank, a - 1, 'A');
						  rank = tangible.StringFunctions.changeCharacter(rank, b - 1, 'B');
					 rank = tangible.StringFunctions.changeCharacter(rank, c - 1, 'C');
					 words[a - 1] = (b > a) + (c == a);
					 words[b - 1] = (a > b) + (a > c);
							   words[c - 1] = (c > b) + (b > a);
					 if (words[1] > words[2])
					 {
					 if (words[0] > words[1]) //??????????
					 {
						for (i = 0;i <= 2;i++)
						{
						System.out.print(rank.charAt(i));
						}
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

