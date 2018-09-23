package <missing>;

public class GlobalMembers
{
	/*
	* ???????.cpp
	* ??????
	* ?????2012.10.30
	* ????3???????
	*/
	public static int Main()
	{
		int A;
		int B;
		int C;
		String rank = new String(new char[4]);
		int a;
		int b;
		int c;
		int i;
		for (A = 1;A <= 3;A++)
		{
			for (B = 1;B <= 3;B++)
			{
				if (A == B)
				{
					continue;
				}
				C = 6 - A - B;
				a = (B < A) + (C == A);
				b = (A < B) + (A < C);
				c = (C < B) + (B < A);
				if (A == (a + 1) && B == (b + 1) && C == (c + 1))
				{
					rank = tangible.StringFunctions.changeCharacter(rank, A, 'A');
					rank = tangible.StringFunctions.changeCharacter(rank, B, 'B');
					rank = tangible.StringFunctions.changeCharacter(rank, C, 'C');
					for (i = 3;i >= 1;i--)
					{
						System.out.print(rank.charAt(i));
					}
				}

			}
		}
		return 0;
	}

}

