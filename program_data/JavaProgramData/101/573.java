package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		int i = 0;
		int[] state = new int[3];
		String name = new String(new char[3]);
		for (A = 0;A < 3;A++)
		{
			for (B = 0;B < 3;B++)
			{
				if (A == B)
				{
					continue;
				}
				C = 3 - A - B;
				state[A] = (B > A) + (C == A);
				state[B] = (A > B) + (A > C);
				state[C] = (C > B) + (B > A);
				if (state[A] + A == 2 && state[B] + B == 2 && state[C] + C == 2)
				{
					name = tangible.StringFunctions.changeCharacter(name, A, 'A');
					name = tangible.StringFunctions.changeCharacter(name, B, 'B');
					name = tangible.StringFunctions.changeCharacter(name, C, 'C');
					for (i = 0;i < 3;i++)
					{
						System.out.print(name.charAt(i));
					}
				}
			}
		}
		System.out.print("\n");
		return 0;
	}
}

