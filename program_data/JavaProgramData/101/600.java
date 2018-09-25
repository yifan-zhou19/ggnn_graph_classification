package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		int i;
		int[] words = new int[4];
		String rank = new String(new char[3]);
		for (A = 0;A <= 2;A++)
		{
			for (B = 0;B <= 2;B++)
			{
			if (A == B)
			{
				continue;
			}
			C = 3 - A - B; //??????
			words[1] = (B > A) + (C == A);
			words[2] = (A > B) + (A > C);
			words[3] = (C > B) + (B > A); //???????????
			if (words[1] + A == 2 && words[2] + B == 2 && words[3] + C == 2) //????????????????????????3
			{
				rank = tangible.StringFunctions.changeCharacter(rank, A, 'A');
				rank = tangible.StringFunctions.changeCharacter(rank, B, 'B');
				rank = tangible.StringFunctions.changeCharacter(rank, C, 'C');
			}
			}
		}
				System.out.print(rank.charAt(0));
				System.out.print(rank.charAt(1));
				System.out.print(rank.charAt(2));
			return 0;
	}

}

