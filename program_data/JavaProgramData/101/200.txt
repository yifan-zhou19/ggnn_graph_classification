package <missing>;

public class GlobalMembers
{
	//**********************************************
	//*      ???                                *
	//*                      10.11.10 ???       *
	//**********************************************

	public static int Main()
	{
		int A;
		int B;
		int C;
		String rank = new String(new char[4]); //rank[1],rank[2],rank[3]???
		String word = new String(new char[4]); //word[1~3]?????
		for (A = 1;A <= 3;A++)
		{
			for (B = 1;B <= 3;B++)
			{
				if (A == B)
				{
					continue; // ??????a,b,c????
				}
				C = 6 - A - B;
				word = tangible.StringFunctions.changeCharacter(word, A, (B < A) + (C == A)); //a,b,c?????????????word[1~3]??????????
				rank = tangible.StringFunctions.changeCharacter(rank, A, 'A'); //rank[1~3]??????
				word = tangible.StringFunctions.changeCharacter(word, B, (A < B) + (A < C));
				rank = tangible.StringFunctions.changeCharacter(rank, B, 'B');
				word = tangible.StringFunctions.changeCharacter(word, C, (C < B) + (B < A));
				rank = tangible.StringFunctions.changeCharacter(rank, C, 'C');
				if (word.charAt(3) > word.charAt(2) && word.charAt(2) > word.charAt(1)) //????????????????
				{
					System.out.print(rank.charAt(3));
					System.out.print(rank.charAt(2));
					System.out.print(rank.charAt(1));
					System.out.print("\n");
				}
			}
		}


		return 0;
	}
}

