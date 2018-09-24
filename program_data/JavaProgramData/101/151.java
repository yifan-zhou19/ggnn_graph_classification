package <missing>;

public class GlobalMembers
{
	// 3???????.cpp : Defines the entry point for the console application.
	// ???????????????
	public static int Main()
	{
		int A; //????A?B?C????A?B?C?????1??????
		int B;
		int C;
		int[] words = new int[4]; //???? words[4]???A?B?C??????
		String a = new String(new char[4]); //?????a[4]
		for (A = 1;A <= 3;A++) //for????
		{
			for (B = 1;B <= 3;B++)
			{
				if (A == B)
				{
					continue;
				}
				C = 6 - A - B;
				words[1] = (B > A) + (A == C); //words[1]?A????
				words[2] = (A > B) + (A > C); //words[2]?B????
				words[3] = (C > B) + (B > A); //words[3]?C????
				if (!((A > B && words[1] <= words[2]) || (A> C && words[1] <= words[3]) || (B> C && words[2] <= words[3]) || (B> A && words[2] <= words[1]) || (C> B && words[3] <= words[2]) || (C> A && words[3] <= words[1])) == 0)
				{
					//????????????????????
					a = tangible.StringFunctions.changeCharacter(a, A, 'A');
				}
				a = tangible.StringFunctions.changeCharacter(a, B, 'B');
				a = tangible.StringFunctions.changeCharacter(a, C, 'C');
				if ((words[1] + A == 3) && (words[2] + B == 3) && (words[3] + C == 3)) //?????????????3
				{
				for (int i = 1;i <= 3;i++) //????for??????
				{
					System.out.print(a.charAt(i));
				}
				}
			}
		}
		return 0;

	}
}

