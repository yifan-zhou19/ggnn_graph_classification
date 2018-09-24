package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		int[] word = new int[4];
		String rank = new String(new char[4]);
		for (A = 1;A <= 3;A++) //??????????????1?2?3
		{
			for (B = 1;B <= 3;B++)
			{
				if (B == A)
				{
					continue; //?????
				}
				else
				{
					for (C = 1;C <= 3;C++)
					{
						if ((C == B) || (C == A))
						{
							continue;
						}
						else
						{
							word[A] = (B > A) + (C == A);
							word[B] = (A > B) + (A > C);
							word[C] = (C > B) + (B > A); //?????????
							rank = tangible.StringFunctions.changeCharacter(rank, A, 'A');
							rank = tangible.StringFunctions.changeCharacter(rank, B, 'B');
							rank = tangible.StringFunctions.changeCharacter(rank, C, 'C');
							if ((word[1] > word[2]) && (word[2] > word[3])) //????????
							{
								System.out.print(rank.charAt(1));
								System.out.print(rank.charAt(2));
								System.out.print(rank.charAt(3));
								System.out.print("\n");
							}
						}
					}
				}
			}
		}
		return 0;
	}




}

