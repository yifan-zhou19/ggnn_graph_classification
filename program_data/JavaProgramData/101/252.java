package <missing>;

public class GlobalMembers
{
	//???
	//2010?11?17?
	//1000012753 ???
	public static int Main()
	{
		int A = 0;
		int B = 0;
		int C = 0;
		for (A = 0; A <= 2; A++)
		{
			for (B = 0; B <= 2; B++)
			{
				for (C = 0; C <= 2; C++)
				{
					if (A != B && B != C && A != C)
					{
						if ((B > A) + (B == C) + A == 2 && (A > B) + (A > C) + B == 2 && (C > B) + (B > A) + C == 2)
						{
							String output = new String(new char[5]);
							output = tangible.StringFunctions.changeCharacter(output, A, 'A');
							output = tangible.StringFunctions.changeCharacter(output, B, 'B');
							output = tangible.StringFunctions.changeCharacter(output, C, 'C');
							output = tangible.StringFunctions.changeCharacter(output, 3, '\0');
							System.out.print(output);
							System.out.print("\n");
						}
					}
				}
			}
		}

		return 0;
	}
}

