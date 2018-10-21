package <missing>;

public class GlobalMembers
{
	public static int Main() //?????
	{ //?????
	int A; //??3?????
	int B;
	int C;
	int[] words = new int[4]; //??3?????
	String rank = new String(new char[4]);
	for (A = 1;A <= 3;A++)
	{ //???????A
		for (B = 1;B <= 3;B++)
		{ //???????B
			if (A == B)
			{
				continue;
			}
			for (C = 1;C <= 3;C++)
			{ //???????C
				if (A == C || B == C)
				{
					continue;
				}
				words[1] = (B > A) + (A == C); //A???
				words[2] = (A > B) + (A > C); //B???
				words[3] = (C > B) + (B > A); //C???
				//????????????????
				if (!(A < B && words[1] <= words[2] != 0 || A < C && words[1] <= words[3] != 0 || B < A && words[2] <= words[1] != 0 || B < C && words[2] <= words[3] != 0 || C < A && words[3] <= words[1] != 0 || C < B && words[3] <= words[2]))
				{
								 //????????????
							 rank = tangible.StringFunctions.changeCharacter(rank, A, 'A');
							 rank = tangible.StringFunctions.changeCharacter(rank, B, 'B');
							 rank = tangible.StringFunctions.changeCharacter(rank, C, 'C');
							 System.out.print(rank.charAt(1));
							 System.out.print(rank.charAt(2));
							 System.out.print(rank.charAt(3));
							 System.out.print("\n");
				}
			}
		}
	}
	return 0; //???????????????????
	} //????
}

