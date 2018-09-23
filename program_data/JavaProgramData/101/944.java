package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A; //????
		int B;
		int C;
		int a;
		int b;
		int c;
		String m = new String(new char[4]); //??????????
		for (A = 1;A <= 3;A++) //??
		{
			for (B = 1;B <= 3;B++)
			{
				for (C = 1;C <= 3;C++)
				{
					a = (B > A) + (C == A); //???????
					b = (A > B) + (A > C);
					c = (C > B) + (B > A);
					if ((A - B) * (a - b) <= 0 && (A - C) * (a - c) <= 0 && (B - C) * (b - c) <= 0) //????
					{
						if ((A == B) + (a == b) != 1 && (A == C) + (a == c) != 1 && (B == C) + (b == c) != 1) //??????
						{
							m = tangible.StringFunctions.changeCharacter(m, A, 'A'); //??????
							m = tangible.StringFunctions.changeCharacter(m, B, 'B');
							m = tangible.StringFunctions.changeCharacter(m, C, 'C');
							for (int i = 1;i <= 3;i++)
							{
								System.out.print(m.charAt(i));
							}
						}
					}
				}
			}
		}
		System.out.print("\n");
		return 0;
	}

}

