package <missing>;

public class GlobalMembers
{
	public static int Main() //???
	{
		int A;
		int B;
		int C;
		int i = 0;
		int[] n = new int[4];
		String m = new String(new char[4]); //????
		for (A = 1;A < 4;A++)
		{
			for (B = 1;B < 4;B++)
			{
				if (A == B)
				{
					continue;
				}
				C = 6 - A - B;
				m = tangible.StringFunctions.changeCharacter(m, A, 'A');
				m = tangible.StringFunctions.changeCharacter(m, B, 'B');
				m = tangible.StringFunctions.changeCharacter(m, C, 'C');
				n[A] = (B > A) + (C == A);
				n[B] = (A > B) + (A > C);
				n[C] = (C > B) + (B > A);
				if (((n[A] > n[B] && B > A) || (n[B] > n[A] && B < A)) + ((n[A]> n[C] && C > A) || (n[C] > n[A] && C < A)) + ((n[C]> n[B] && B > C) || (n[B] > n[C] && B < C)) == 3)
				{
					for (i = 1;i < 4;i++)
					{
						System.out.print(m.charAt(i));
					}
				}
			}
		}
		return 0; //??
	}
}

