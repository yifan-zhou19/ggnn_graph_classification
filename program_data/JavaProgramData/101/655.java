package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A; //???????A,B,C,???????a,b,c?????????????words?
		int B;
		int C;
		int a;
		int b;
		int c;
		int[] words = new int[4];
		String rank = new String(new char[4]);
		for (A = 1;A < 4;A++) //??A?B?C????????
		{
			for (B = 1;B < 4;B++)
			{
				for (C = 1;C < 4;C++)
				{
					words[1] = (B > A) + (C == A);
					words[2] = (A > B) + (A > C);
					words[3] = (C > B) + (B > A);
					a = 3 - words[1]; //??????????????
					b = 3 - words[2];
					c = 3 - words[3];
					if ((a != b) && (a != c) && (b != c) && (a == A) && (b == B) && (c == C)) //?????????????????????????????
					{
						rank = tangible.StringFunctions.changeCharacter(rank, A, 'A');
					rank = tangible.StringFunctions.changeCharacter(rank, B, 'B');
					rank = tangible.StringFunctions.changeCharacter(rank, C, 'C');
					for (int i = 1;i < 4;i++) //????????????????
					{
						System.out.print(rank.charAt(i));
					}
					}
				}
			}
		}
		return 0;
	}

}

