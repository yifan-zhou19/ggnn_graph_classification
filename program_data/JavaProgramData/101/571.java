package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		int i;
		int words;
		float[] word = new float[4];
		String name = new String(new char[4]);
		for (A = 1; A <= 3;A++)
		{
			for (B = 1;B <= 3;B++)
			{
				for (C = 1;C <= 3; C++)
				{
					word[1] = A / 10.0 - (B > A) - (C == A);
					word[2] = B / 10.0 - (A > B) - (A > C);
					word[3] = C / 10.0 - (C > B) - (B > A);
					if ((A - B) * (word[1] - word[2]) > 0 && (C - B) * (word[3] - word[2]) > 0 && (A - C) * (word[1] - word[3]) > 0)
					{
						name = tangible.StringFunctions.changeCharacter(name, A, 'A');
						name = tangible.StringFunctions.changeCharacter(name, B, 'B');
						name = tangible.StringFunctions.changeCharacter(name, C, 'C');
						for (i = 3; i > 0; i--)
						{
							System.out.print(name.charAt(i));
						}
						System.out.print("\n");
						return 0;
					}
				}
			}
		}


		return 0;
	}
}

