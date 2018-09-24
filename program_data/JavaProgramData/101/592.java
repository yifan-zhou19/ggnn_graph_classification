package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		String quantity = new String(new char[4]);
		int As;
		int Bs;
		int Cs;
		for (A = 1;A <= 3;A++)
		{
			for (B = 1;B <= 3;B++)
			{
				for (C = 1;C <= 3;C++)
				{
					As = (B > A) + (C == A);
					Bs = (A > B) + (A > C);
					Cs = (C > B) + (B > A);
					if (!(A <= B != 0 && As <= Bs != 0 || A <= C != 0 && As <= Cs != 0 || B <= A != 0 && Bs <= As != 0 || B <= C != 0 && Bs <= Cs != 0 || C <= A != 0 && Cs <= As != 0 || C <= B != 0 && Cs <= Bs)) //?????????????????????????????
					{
						quantity = tangible.StringFunctions.changeCharacter(quantity, A, 'A');
						quantity = tangible.StringFunctions.changeCharacter(quantity, B, 'B');
						quantity = tangible.StringFunctions.changeCharacter(quantity, C, 'C');
						for (int i = 1;i <= 3;i++)
						{
							System.out.print(quantity.charAt(i));
						}
					}
				}
			}
		}
		System.out.print("\n");

		return 0;
	}
}

