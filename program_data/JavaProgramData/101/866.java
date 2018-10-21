package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int A; //A,B,C???????????
	 int B;
	 int C;
	 int a; //a,b,c???????????
	 int b;
	 int c;
	 int i; //i?????
	 String rice = new String(new char[4]); //????????
	 for (A = 1;A <= 3;A++)
	 {
	  for (B = 1;B <= 3;B++)
	  {
	   for (C = 1;C <= 3;C++)
	   {
		 a = ((B > A) + (C == A));
		 b = ((A > B) + (A > C));
		 c = ((C > B) + (B > A));
		 if (((A > B && a < b) || (A == B && a == b) || (A < B && a> b)) + ((A> C && a < c) || (A == C && a == c) || (A < C && a> c)) + ((B < C && b> c) || (B> C && b < c) || (B == C && b == c)) == 3) //????????????
		 {
			  rice = tangible.StringFunctions.changeCharacter(rice, A, 'A');
			  rice = tangible.StringFunctions.changeCharacter(rice, B, 'B');
			  rice = tangible.StringFunctions.changeCharacter(rice, C, 'C');
		 }
	   }
	  }
	 }
	   for (i = 1;i <= 3;i++)
	   {
		   System.out.print(rice.charAt(i));
	   }

	   return 0;
	}
}

