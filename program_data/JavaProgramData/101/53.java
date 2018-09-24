package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A; //???????
		int B;
		int C;
		int[] word = new int[4]; //??????
		String rank = new String(new char[4]); //???????
		int i; //??????
		for (A = 1;A <= 3;A++) //A??
		{
			for (B = 1;B <= 3;B++) //B??
			{
				if (A == B)
				{
					continue; //??A=B
				}
				C = 6 - A - B; //??C
					 word[A] = (B < A) + (C == A); //A????
				word[B] = (A < B) + (A < C); //B????
				word[C] = (C < B) + (B < A); //C????
				if (word[1] < word[2] && word[2] < word[3]) //??????????
				{
					rank = tangible.StringFunctions.changeCharacter(rank, A, 'A');
					rank = tangible.StringFunctions.changeCharacter(rank, B, 'B');
					rank = tangible.StringFunctions.changeCharacter(rank, C, 'C');
					for (i = 3;i >= 1;i--) //????
					{
					System.out.print(rank.charAt(i));
					}
				}
			}
		}
		return 0;
	}
}

