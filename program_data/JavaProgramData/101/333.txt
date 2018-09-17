package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A; //????,i???????
		int B;
		int C;
		int i;
		String words = new String(new char[3]); //????????????????????????
		String rank = new String(new char[3]);
		for (A = 0;A <= 2;A++) //?? ????
		{
			for (B = 0;B <= 2;B++)
			{
				if (B == A)
				{
					continue; //??????
				}
				for (C = 0;C <= 2;C++)
				{
					if (C == A || C == B)
					{
						continue;
					}
					words = tangible.StringFunctions.changeCharacter(words, 0, (B > A) + (C == A)); //????????
					words = tangible.StringFunctions.changeCharacter(words, 1, (A > B) + (A > C));
					words = tangible.StringFunctions.changeCharacter(words, 2, (C > B) + (B > A));
					rank = rank.substring(0, A);
					rank = tangible.StringFunctions.changeCharacter(rank, B, 1);
					rank = tangible.StringFunctions.changeCharacter(rank, C, 2);
					if ((A + words.charAt(rank.charAt(A))) == 2 && (B + words.charAt(rank.charAt(B))) == 2 && (C + words.charAt(rank.charAt(C))) == 2) //????????
					{
						for (i = 0;i <= 2;i++) //??
						{
							System.out.print((char)(rank.charAt(i) + 65));
						}
					}
				}
			}
		}
		return 0; //??0
	}


}

