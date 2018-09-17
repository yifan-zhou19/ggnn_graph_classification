package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		int[] sent = new int[5];
		int i;
		String b = new String(new char[5]);
		for (A = 1;A < 4;A++)
		{
			for (B = 1;B < 4;B++)
			{
				if (A == B)
				{
					continue;
				}
				for (C = 1;C < 4;C++)
				{
					if (A == C || B == C)
					{
						continue;
					}
					else
					{
						b = tangible.StringFunctions.changeCharacter(b, A, 'A');
						b = tangible.StringFunctions.changeCharacter(b, B, 'B');
						b = tangible.StringFunctions.changeCharacter(b, C, 'C');
						sent[A] = (B > A) + (C == A);
						sent[B] = (A > B) + (A > C);
						sent[C] = (C > B) + (B > A);
						for (i = 1;i < 4;i++)
						{
							if (sent[i] != (3 - i))
							{
								break;
							}
							else if (i == 3)
							{
								System.out.print(b.charAt(1));
								System.out.print(b.charAt(2));
								System.out.print(b.charAt(3));
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

