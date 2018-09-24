package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A; //?A,B,C????
		int B;
		int C;
		int As; //As,Bs,Cs????????
		int Bs;
		int Cs;
		String word = new String(new char[4]);



		for (A = 1;A <= 3;A++) //?????????
		{
		  for (B = 1;B <= 3;B++)
		  {
			for (C = 1;C <= 3;C++)
			{
			  As = (B > A) + (C == A);
			  Bs = (A > B) + (A > C);
			  Cs = (C > B) + (B > A);

		if (!(A <= B != 0 && As <= Bs != 0 || A <= C != 0 && As <= Cs != 0 || B <= A != 0 && Bs <= As != 0 || B <= C != 0 && Bs <= Cs != 0 || C <= A != 0 && Cs <= As != 0 || C <= B != 0 && Cs <= Bs)) //??????
		{
			  word = tangible.StringFunctions.changeCharacter(word, A, 'A');
			  word = tangible.StringFunctions.changeCharacter(word, B, 'B');
			  word = tangible.StringFunctions.changeCharacter(word, C, 'C');
			  System.out.print(word.charAt(1));
			  System.out.print(word.charAt(2));
			  System.out.print(word.charAt(3));
		} //??????
			}
		  }
		}

	return 0;
	}




}

