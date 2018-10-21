package <missing>;

public class GlobalMembers
{
	//***************************************************************************************
	//*? ? ?:????.cpp                                                                *
	//*?    ?:??? 1000012817                                                           *   
	//*????:2010-11-12                                                                  *                                 
	//*????:????,??????                                                       *
	//***************************************************************************************
	public static int Main() //???
	{
		int A; //???????A?B?C????3??????
		int B;
		int C;
		int i;
		int[] num = new int[4]; //?????????????????????????
		int[] rank = new int[4];
		String name = new String(new char[4]); //????????????
		for (A = 1;A <= 3;A++)
		{ //for?????????
			for (B = 1;B <= 3;B++)
			{
				if (B == A)
				{
					continue;
				}
				C = 6 - B - A;
				num[1] = (B > A) + (C == A);
				num[2] = (A > B) + (A > C);
				num[3] = (C > B) + (B > A); //???????????????
				rank[A] = A;
				rank[B] = B;
				rank[C] = C; //????
				name = tangible.StringFunctions.changeCharacter(name, A, 'A');
				name = tangible.StringFunctions.changeCharacter(name, B, 'B');
				name = tangible.StringFunctions.changeCharacter(name, C, 'C'); //????
				if (num[1] + rank[A] == 3 && num[2] + rank[B] == 3 && num[3] + rank[C] == 3) //??????????????
				{
					for (i = 1;i <= 3;i++)
					{
						System.out.print(name.charAt(i));
					}
				}
			}
		}
		System.out.print("\n");
		return 0;
	} //?????

}

