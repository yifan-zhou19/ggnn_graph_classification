package <missing>;

public class GlobalMembers
{
	/**
	* @file 1000012800_1.cpp
	* @author ??
	* @date 2010-11-18
	* @description
	* ??????:????
	*/


	public static int Main()
	{
		char A;
		char B;
		char C;

		String rank = new String(new char[4]);
		for (A = 1; A <= 3; A++)
		{

			for (B = 1; B <= 3; B++)
			{
				if (A == B)
				{
					continue;
				}

				for (C = 1; C <= 3; C++)
				{

					int[] a = new int[4];
					if (A == C || B == C)
					{
						continue;
					}
					rank = tangible.StringFunctions.changeCharacter(rank, A, 'A');
					rank = tangible.StringFunctions.changeCharacter(rank, B, 'B');
					rank = tangible.StringFunctions.changeCharacter(rank, C, 'C');
					if (B < A)
					{
						a[A]++;
					}
					if (C == A)
					{
						a[A]++;
					}
					if (A < B)
					{
						a[B]++;
					}
					if (A < C)
					{
						a[B]++;
					}
					if (C < B)
					{
						a[C]++;
					}
					if (B < A)
					{
						a[C]++;
					}
					if (a[1] < a[2] && a[2] < a[3])
					{
						System.out.print(rank.charAt(3));
						System.out.print(rank.charAt(2));
						System.out.print(rank.charAt(1));
						System.out.print("\n");
					}
				}
			}
		}
			return 0;
	}


}

