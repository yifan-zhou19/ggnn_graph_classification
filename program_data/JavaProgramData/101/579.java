package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		int i;
		int D;
		int E;
		int F;
		int H;
		int I;
		int J;
		for (A = 1;A <= 3;A++)
		{
		 for (B = 1;B <= 3;B++)
		 {
		  for (C = 1;C <= 3;C++)
		  {

			 D = (B > A);
			 H = (C == A);
			 E = (A > B);
			 I = (A > C);
			 F = (C > B);
			 J = (B > A);

			 if (D + H + A == 3 && E + I + B == 3 && F + J + C == 3)
			 {
					  String a = new String(new char[4]);
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

