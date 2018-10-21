package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		int i;
		String a = new String(new char[4]);
		for (A = 1;A <= 3;A++)
		{
			for (B = 1;B <= 3;B++)
			{
				for (C = 1;C <= 3;C++)
				{
					if ((B > A) + (C == A) == 3 - A && (A > B) + (A > C) == 3 - B && (C > B) + (B > A) == 3 - C)
					{
						a = tangible.StringFunctions.changeCharacter(a, A, 'A');
						a = tangible.StringFunctions.changeCharacter(a, B, 'B');
						a = tangible.StringFunctions.changeCharacter(a, C, 'C');
						for (i = 1;i <= 3;i++)
						{
							System.out.print(a.charAt(i));
						}
					}
				}

			}
		}
		return 0;
	}

}

